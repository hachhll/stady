package ru.homework.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Gevorg on 24.05.2017.
 */
public class DataStruct {

    private Date dateVal;
    private Date timeVal;
    private List<DataList> dataList;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    public void DateStruct() throws ParseException {

        this.dateVal = dateFormat.parse("2000-01-01");
        this.dateVal = timeFormat.parse("00:00:00");
        this.dataList = new LinkedList<>();
    }

    public void setTimeVal(String timeVal) throws ParseException {
        this.timeVal = timeFormat.parse(timeVal);
    }

    public void setDateVal(String dateVal) throws ParseException {
        this.dateVal = dateFormat.parse(dateVal);

    }

    public void setDataList(List<DataList> dataList) {
        this.dataList = dataList;
    }

    public Date getDateVal() {
        return dateVal;
    }

    public Date getTimeVal() {
        return timeVal;
    }

    public List<DataList> getDataList() {
        return dataList;
    }
}
