package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class homeWorkTest {
    @Test
    void name() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com/selenide/selenide");
        $$(".UnderlineNav-body li").findBy(text("Wiki")).click();
        $$("[data-filterable-for=wiki-pages-filter] li button").findBy(text("Show 3 more pages…")).click();
        $$("[data-filterable-for=wiki-pages-filter] li a").findBy(text("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5"));
    }
}
