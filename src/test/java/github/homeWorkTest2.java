package github;

import com.codeborne.selenide.AuthenticationType;
import com.codeborne.selenide.BasicAuthCredentials;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class homeWorkTest2 {
    @Test
    void name() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com/");
        $$(".HeaderMenu-wrapper button").findBy(text(" Solutions ")).hover();
        $$(".HeaderMenu-dropdown a").findBy(text(" Enterprises ")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}
