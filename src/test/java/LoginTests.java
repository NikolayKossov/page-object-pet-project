import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest() {
        Configuration.holdBrowserOpen = true;

        open("https://automationteststore.com/index.php?rt=account/login");
        $("[name=loginname]").setValue("userOdin");
        $("[name=password]").setValue("12345").pressEnter();
        $("a[href='https://automationteststore.com/']").click();
        $(".contentpanel").shouldHave(text("Welcome to the Automation Test Store! "));
    }

    @Test
    void selenideTest() {

    }
}
