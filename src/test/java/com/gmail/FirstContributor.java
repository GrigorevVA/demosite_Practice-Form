package com.gmail;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstContributor {
    @BeforeAll
    static void setUP() {
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void Contrebur(){
        open("https://github.com/selenide/selenide");

        $(".Layout-sidebar").$(byText("Contributors")).closest("div")
                .$$("ul li").first().hover();
        $(".Popover-message Popover-message--large Box color-shadow-large Popover-message--bottom-left").shouldHave(text("Selenide"));
        sleep(5000);


    }

}
