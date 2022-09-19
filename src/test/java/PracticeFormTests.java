import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Elena");
        $("[id=lastName]").setValue("Siraeva");
        $("[id=userEmail]").setValue("lena@siraeva.com");
        $("[id=userNumber]").setValue("9228881554");
       // $("[id=dateOfBirthInput]").setValue("19 Sep 2022");
        $("[id=subjectsInput]").setValue("Math");
        $("[id=currentAddress]").setValue("SSR");

    }
}
