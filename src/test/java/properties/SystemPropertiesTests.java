package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void simplePropertyTest() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    @Tag("one_property")
    void simpleProperty1Test() {
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("hello")
    void simpleProperty2Test() {
        System.out.println("Hello, " + System.getProperty("user_name", "unknown student"));
    }
}
