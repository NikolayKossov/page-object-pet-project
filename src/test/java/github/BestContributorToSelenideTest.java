package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenideTest {
    @Test
    void solntsevShouldBeTopContributor() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com/selenide/selenide");
        $(".BorderGrid").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell")
                .$$("ul li").first().hover();
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
    }
}
