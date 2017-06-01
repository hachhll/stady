package ru.homework.core;

import ru.homework.threads.ThreadFill;

import static java.lang.Thread.sleep;


/**
 * Created by Gevorg on 24.05.2017.
 */
public class TransportVal {

    public static void main(String... args) {

        Thread threadFill_1 = new Thread(new ThreadFill());
        threadFill_1.start();
        Thread threadFill_2 = new Thread(new ThreadFill());
        threadFill_2.start();

        try {
            sleep(1000);
            System.out.println("Gen interrapt threadFill_1");
            threadFill_1.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Mian exception");
            threadFill_1.interrupt();
        }

        try {
            sleep(2000);
            System.out.println("Gen interrapt threadFill_2");
            threadFill_2.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Mian exception");
            threadFill_2.interrupt();
        }
    }


}
