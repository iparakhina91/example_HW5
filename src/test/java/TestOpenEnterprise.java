import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestOpenEnterprise {

    @Test
     void shouldLoadBuildLikeTheBest() {

        open("https://github.com/");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(".HeaderMenu-dropdown-link[href='/enterprise']").click();
        $("div.col-9-max").$("h1.h1-mktg").shouldHave(text("Build like the best"));
    }
}
