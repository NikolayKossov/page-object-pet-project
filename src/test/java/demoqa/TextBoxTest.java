package demoqa;

import org.junit.jupiter.api.Test;
public class TextBoxTest extends TestBase {

    @Test
    void fillPracticeFormTest() {
        String firstName = "John";
        String lastName = "Smith";
        String email = "smithjohnson@gmail.com";
        String number = "1234567890";
        String gender = "Male";
        String dayOfBirth = "20";
        String monthOfBirth = "December";
        String yearOfBirth = "1990";
        String subject = "Computer Science";
        String hobby = "Music";
        String photoAdress = "src/test/resources/";
        String photoName = "photo.jpg";
        String address = "baker street 221b";
        String state = "Uttar Pradesh";
        String city = "Merrut";

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(subject)
                .setMusicAsHobby(hobby)
                .setAddress(address)
                .setPhoto(photoAdress, photoName)
                .setState(state)
                .setCityMerrut()
                .confirmData();

        registrationPage.verifyModalAppears()
                        .verifyResult("Student Name", firstName + " " + lastName)
                        .verifyResult("Student Email", email)
                        .verifyResult("Gender", gender)
                        .verifyResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                        .verifyResult("Subjects", subject)
                        .verifyResult("Hobbies", hobby)
                        .verifyResult("Picture", photoName)
                        .verifyResult("Address", address)
                        .verifyResult("State and City", state+" "+city);

    }
}
