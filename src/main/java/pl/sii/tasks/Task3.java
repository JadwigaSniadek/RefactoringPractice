package pl.sii.tasks;

import java.time.LocalDate;
import java.time.Month;

public class Task3 {

    private static final double WINTER_PRICE = 100;
    private static final double SUMMER_PRICE = 120;
    private static final double GROUP_DISCOUNT = 0.1;
    private static final Month START_SUMMER_MONTH = Month.MARCH;
    private static final Month END_SUMMER_MONTH = Month.OCTOBER;
    private static final int MINIMAL_GROUP_SIZE = 5;

    public static double calculateTicketPrice(LocalDate date, int quantity) {
        double price = getSeasonalPrice(date);
        return applyDiscount(quantity, price);
    }

    private static double getSeasonalPrice(LocalDate date) {
        if (isSummerPrice(date)) {
            return SUMMER_PRICE;
        } else {
            return WINTER_PRICE;
        }
    }

    private static boolean isSummerPrice(LocalDate date) {
        return date.getMonth().compareTo(START_SUMMER_MONTH) > 0 && date.getMonth().compareTo(END_SUMMER_MONTH) < 0;
    }

    private static double applyDiscount(int quantity, double price) {
        if (quantity >= MINIMAL_GROUP_SIZE) {
            price = price - price * GROUP_DISCOUNT;
        }
        return quantity * price;
    }


}
