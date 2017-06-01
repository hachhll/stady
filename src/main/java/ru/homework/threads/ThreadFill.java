package ru.homework.threads;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import ru.homework.common.DataList;
import ru.homework.common.DataStruct;
import ru.homework.model.DataLST;
import ru.homework.model.DataVLS;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.currentThread;

/**
 * Created by Gevorg on 24.05.2017.
 */
public class ThreadFill implements Runnable {

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    public void run() {
        DataStruct dataVal = new DataStruct();

        Date date = new Date();

        int i = 0;
        while (true) {
            if (!currentThread().isInterrupted()) {
                try {
                    dataVal.setDateVal(dateFormat.format(date));
                    dataVal.setTimeVal(timeFormat.format(date));
                    dataVal.setDataList(genRnd());
                } catch (ParseException e) {
                    System.err.println(e.getMessage());
                    currentThread().isInterrupted();
                }

                System.out.println("Date: " + dateFormat.format(dataVal.getDateVal()));
                System.out.println("Time: " + timeFormat.format(dataVal.getTimeVal()));
                List<DataLST> date_lst_arr = new LinkedList<>();

                System.out.println("VALUES: ");
                for (DataList val : dataVal.getDataList()) {
                    System.out.print(val.getVal1() + " ; ");
                    System.out.print(val.getVal2() + " ; ");
                    System.out.print(val.getVal3() + " ; ");
                    System.out.print(val.getVal4() + " ; ");
                    System.out.println(val.getVal5());
                    DataLST date_lst = DataLST.newBuilder()
                            .setVal1(val.getVal1())
                            .setVal2(val.getVal2())
                            .setVal3(val.getVal3())
                            .setVal4(val.getVal4())
                            .setVal5(val.getVal5()).build();
                    date_lst_arr.add(date_lst);
                }

                DataVLS date_vls = DataVLS.newBuilder()
                        .setDateVal(dateFormat.format(dataVal.getDateVal()))
                        .setTimeVal(timeFormat.format(dataVal.getTimeVal()))
                        .setDataList(date_lst_arr).build();

                DatumWriter<DataVLS> datumWriter =
                        new SpecificDatumWriter<DataVLS>(DataVLS.class);
                DataFileWriter<DataVLS> fileWriter =
                        new DataFileWriter<DataVLS>(datumWriter);

                try {
                    fileWriter.create(date_vls.getSchema(), new File("test_avro"+i+".avro"));
                    fileWriter.append(date_vls);
                    fileWriter.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }

                dataVal.getDataList().clear();
                date_lst_arr.clear();

                System.out.println("Interation: " + i);
                i++;
                try {
                    currentThread().sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Sleep exception");
                    currentThread().interrupt();
                }
            } else {
                System.out.println(currentThread().isInterrupted());
                return;
            }
        }
    }

    private static List<DataList> genRnd() {
        Random rnd = new Random();
        List<DataList> rndList = new LinkedList<DataList>();
        for (int i = 1; i <= 5; i++) {
            DataList dataList = new DataList();
            dataList.setVal1(rnd.nextInt(i * 100));
            dataList.setVal2(rnd.nextInt(i * 100));
            dataList.setVal3(rnd.nextInt(i * 100));
            dataList.setVal4(rnd.nextInt(i * 100));
            dataList.setVal5(rnd.nextInt(i * 100));
            rndList.add(dataList);
        }
        return rndList;
    }
}
