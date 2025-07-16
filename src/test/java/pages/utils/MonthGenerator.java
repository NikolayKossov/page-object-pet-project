package pages.utils;
import java.util.Random;

public class MonthGenerator {
    public static String randomMonth() {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        String randomMonth = months[new Random().nextInt(months.length)];
        return randomMonth;
    }
}
