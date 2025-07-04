package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class selindeRepositorySearch
{
    @Test
    void shouldFindSelinideRepositoryAtTheTop() {
        Configuration.holdBrowserOpen = true;
        //open GitHub main page
        open("https://github.com/");
        //fill "selinide" in the search field and press enter
        $("[placeholder='Search or jump to...']").click();
        $("[name=query-builder-test]").setValue("selenide").pressEnter();
        //choose the first repository from the list
        $$("div[data-testid='results-list']").first().$("a").click();
        //check the name "selinide/selinde"
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
