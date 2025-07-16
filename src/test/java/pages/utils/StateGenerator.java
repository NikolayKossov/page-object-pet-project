package pages.utils;

import java.util.Random;

public class StateGenerator {
    public static String randomState() {
        String[] states = {
                "NCR", "Uttar Pradesh", "Haryana", "Rajasthan"
        };

        String randomState = states[new Random().nextInt(states.length)];
        return randomState;
    }
}
