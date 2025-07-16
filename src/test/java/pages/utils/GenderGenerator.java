package pages.utils;

import java.util.Random;

public class GenderGenerator {
    public static String randomGender() {
        String[] genders = {"Male", "Female", "Other"};
        String gender = genders[new Random().nextInt(genders.length)];
        return gender;
    }
}
