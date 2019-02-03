package pl.sii.intro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class StringsConcatenations {

    public static void stringConcatenation() {
        long startTime = System.currentTimeMillis();
        String hello = "Hello";
        for (int i = 0; i < 100000; i++) {
            hello = hello + " Testers";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(String.format("Execution time is: %s", milisToTime(stopTime - startTime)));
    }

    public static void stringConcatenationBuilder() {
        long startTime = System.currentTimeMillis();
        StringBuilder hello = new StringBuilder("Hello");
        for (int i = 0; i < 100000; i++) {
            hello.append(" Testers");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(String.format("Execution time is: %s", milisToTime(stopTime - startTime)));
    }

    public static void main(String[] args) {
        stringConcatenation();
        stringConcatenationBuilder();
    }

    private static String milisToTime(final long timeInMilis) {
        Date date = new Date(timeInMilis);
        DateFormat formatter = new SimpleDateFormat("mm:ss.SSS");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        return formatter.format(date);
    }
}
