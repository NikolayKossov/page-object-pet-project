package pages.utils;

import java.util.Random;

public class CharGenerator {
    public static String randomChar() {
        String chars = "abcdeghilmnoprstuvy";
        String randomChar = String.valueOf(chars.charAt(new Random().nextInt(chars.length())));
        return randomChar;
    }
}



