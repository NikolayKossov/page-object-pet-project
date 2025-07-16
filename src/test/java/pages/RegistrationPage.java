package pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import pages.components.CalendarComponent;
import pages.components.FileComponent;
import pages.components.RegistrationResultModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultModal registrationResultModal = new RegistrationResultModal();
    FileComponent fileComponent = new FileComponent();

    private final static String TITLE_TEXT = "Practice Form";
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement firstNameInput = $("#firstName");
    //private SelenideElement male = $("#gender-radio-");
    private final SelenideElement email = $("#userEmail");
    private final SelenideElement address = $("#currentAddress");
    private final SelenideElement subjectInput = $("#subjectsInput");
   // private final SelenideElement music = $("#hobbies-checkbox-3");
    private final SelenideElement state = $("#state");
    //private final SelenideElement uttar = $("#react-select-3-option-1");
    private final SelenideElement city = $("#city");
    private final SelenideElement merrut = $("#react-select-4-option-2");

    public RegistrationPage openPage() {
        open("automation-practice-form");
        $(".text-center").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage clearLastName() {
        lastNameInput.clear();
        return this;
    }

    public RegistrationPage setEmail(String userEmail) {
        email.setValue(userEmail);
        return this;
    }

    public RegistrationPage setGender(String gender) {     //todo add map logic
        int num = 0;
        if ("Male".equals(gender)) {
            num = 1;
        }  else if ("Female".equals(gender)) {
            num = 2;
        } else if ("Other".equals(gender)) {
            num = 3;
        }
        $("#gender-radio-"+num).parent().click();
        return this;
    }

    public RegistrationPage setSubject(String hobby) {
        subjectInput.setValue(hobby).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String hobby) {  //todo improve the logic for many cases
        int num = 0;
        if ("Sports".equals(hobby)) {
            num = 1;
        }  else if ("Reading".equals(hobby)) {
            num = 2;
        } else if ("Music".equals(hobby)) {
            num = 3;
        }
        $("#hobbies-checkbox-"+num).parent().click();
        return this;
    }

    public RegistrationPage setAnyHobby() {  //todo improve the logic for many cases
        int num = Faker.instance().number().numberBetween(1, 3);
        $("#hobbies-checkbox-"+num).parent().click();
        return this;
    }

    public RegistrationPage setNumber(String number) {
        $("#userNumber").setValue(number);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setAddress(String userAddress) {
        address.setValue(userAddress);
        return this;
    }

    public RegistrationPage setState(String userState) {
        state.click();
        $("#stateCity-wrapper").$(byText(userState)).click();
        return this;
    }

    public RegistrationPage setCity(String userCity) {
        city.click();
        $("#stateCity-wrapper").$(byText(userCity)).click();
        return this;
    }

    public RegistrationPage setAnyState() {
        state.click();
        int num = Faker.instance().number().numberBetween(0, 3);

        $("#react-select-3-option-"+num).click();

        return this;
    }

    public RegistrationPage setCityMerrut() {
        city.click();
        merrut.click();
        return this;
    }

    public RegistrationPage verifyModalAppears() {
        registrationResultModal.verifyModalAppears();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationResultModal.verifyResult(key, value);
        return this;
    }

    public RegistrationPage setPhoto(String address, String photoName) {
        fileComponent.uploadPhoto(address, photoName);
        return this;
    }

    public RegistrationPage confirmData() {
        actions().sendKeys(Keys.ENTER).perform();
        return this;
    }
}
