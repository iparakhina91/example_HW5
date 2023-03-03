import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestOpenEnterprise {

    @Test
     void shouldLoadBuildLikeTheBest() {

        open("https://github.com/");
        $(".HeaderMenu-item:nth-child(2)").hover();
        $(".HeaderMenu-dropdown-link[href='/enterprise']").click();
        $("div.col-9-max").$("h1.h1-mktg").shouldHave(text("Build like the best"));
    }
}
