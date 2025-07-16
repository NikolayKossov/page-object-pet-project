package pages.utils;

import com.github.javafaker.Faker;

public class DataHolder {
    public static String firstName = Faker.instance().name().firstName();
    public static String lastName = Faker.instance().name().lastName();
    public static String email = Faker.instance().internet().emailAddress();
    public static String number = Faker.instance().number().digits(10);
    public static String gender = GenderGenerator.randomGender(); //todo Add merhod
    public static String dayOfBirth = String.valueOf(Faker.instance().number().numberBetween(1, 31));
    public static String monthOfBirth = MonthGenerator.randomMonth();  //todo Add method
    public static String yearOfBirth = String.valueOf(Faker.instance().number().numberBetween(1900, 2025));
    public static String subject = CharGenerator.randomChar();
    public static String hobby = HobbiesGenerator.randomHobby();
    public static String photoAdress = "src/test/resources/";
    public static String photoName = "photo.jpg";
    public static String address = Faker.instance().address().fullAddress();
    public static String state = StateGenerator.randomState();
    public static String city = CityGenerator.randomCity(state);
}
