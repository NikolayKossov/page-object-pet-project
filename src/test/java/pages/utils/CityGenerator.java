package pages.utils;

import java.util.HashMap;
import java.util.Random;
public class CityGenerator {
    public static String randomCity(String state) {
        HashMap<String, String[]> cities = new HashMap<>();
        cities.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        cities.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        cities.put("Haryana", new String[]{"Karnal", "Panipat"});
        cities.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

        String randomCity = cities.get(state)[new Random().nextInt(cities.get(state).length)];
        return randomCity;
    }
}
