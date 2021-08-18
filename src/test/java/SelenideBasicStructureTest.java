import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Wait;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideBasicStructureTest {

    @Test
    void amazon(){
        // Открыть страницу amazon.com
        open("https://amazon.com");
        // Ввести Harry Potter в поле поиска, нажать Enter
        $("#twotabsearchtextbox").setValue("Harry Potter").pressEnter();
        // Проверка: загрузился список товаров и на первом месте товар с именем Harry Potter
        $$("[data-component-type=s-search-result]").first()
                .shouldHave(text("Har324324234"));
    }

    @Test
    void onlineShop_SearchProductMachine_Success(){
        //arrange
        open("http://intershop.skillbox.ru/");
        //act
        $(".search-field").setValue("машина").pressEnter();
        //assert
        $$(".product").first().shouldHave(textCaseSensitive("машина"));
        $$(".product").filter(textCaseSensitive("машина")).shouldHave(sizeGreaterThanOrEqual(2));
    }

}
