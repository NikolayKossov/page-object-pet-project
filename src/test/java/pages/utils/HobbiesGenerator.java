package pages.utils;

import java.util.Random;

public class HobbiesGenerator {
    public static String randomHobby() {
        String[] hobbies = {"Sports", "Music", "Reading"};
        String hobby = hobbies[new Random().nextInt(hobbies.length)];
        return hobby;
    }
}
