import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Wait;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideBasicStructure {

    @Test
    void orderScenario(){
        // arrange
        open("https://amazon.com");

        // act
        $("button1").click();
        $("textfield1").setValue("abc");
        $("button2").click();

        // assert
        $("banner").should(appear);
        $("title").shouldHave(text("abc"));

        // act
        $("button3").contextClick();

        // assert
        $("contextMenu").shouldBe(visible);

    }

    @Test
    void optionalAsserts(){
        // arrange
        open("https://amazon.com");
        // act
        $("button1").click();
        // act
        $("button2").click();
        // act
        $("button3").contextClick();
        // assert
        $("label").shouldHave(text("abc"));



    }

}
