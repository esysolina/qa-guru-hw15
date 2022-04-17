package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTest extends TestBase{

    @Test
    public void headerTest(){
        step("Открыть 'https://www.litres.ru/'", () ->
                open("https://www.litres.ru/"));
        step("Заголовок страницы должен содержать текст", () -> {
            String expectedTitle = "ЛитРес – библиотека электронных и аудиокниг, " +
                    "скачать в fb2 и mp3, читать и слушать онлайн на LitRes";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}
