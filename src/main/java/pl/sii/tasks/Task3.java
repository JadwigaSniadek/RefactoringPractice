package pl.sii.tasks;

import java.time.LocalDate;
import java.time.Month;

public class Task3 {

    private static int summerPrice = 120;
    private static int winterPrice = 100;
    private static double groupDiscount = 0.1;

    public static double calculateTicketPrice(LocalDate date, int quantity) {
        double price = 0;
        if (date.getMonth().compareTo(Month.MARCH) > 0) {
            if (date.getMonth().compareTo(Month.OCTOBER) < 0) {
                price = (double) summerPrice;
            }
        }
        if (date.getMonth().compareTo(Month.APRIL) < 0) {
            price = (double) winterPrice;
        }

        if (date.getMonth().compareTo(Month.SEPTEMBER) > 0) {
            price = (double) winterPrice;
        }

        if (quantity > 4) {
            price = price - price * groupDiscount;
        }

        return price;
    }
}
