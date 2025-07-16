package demoqa;

import org.junit.jupiter.api.Test;

import static pages.utils.DataHolder.*;

public class TextBoxTest extends TestBase {

    @Test
    void fillPracticeFormTest() {
        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(subject)
                .setHobby(hobby)
                .setAddress(address)
                .setPhoto(photoAdress, photoName)
                .setState(state)
                .setCity(city)
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
