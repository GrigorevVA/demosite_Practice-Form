package com.gmail;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {
    @BeforeAll
    static void SizeBrowser(){
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void successTest(){
        open ("https://demoqa.com/text-box");

        $("#userName").setValue("Vovan");
        $("#userEmail").setValue("email@gmail.com");
        $("#currentAddress").setValue("Some address");
        $("#permanentAddress").setValue("Additional address");
        $("#submit").click();

        $("#output").shouldBe(Condition.visible);

        //name
        //email
        //currentAddress
        //permanentAddress
        $("#name").shouldHave(text("Vovan"));
        $("#email").shouldHave(text("email@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Some address"));
        $("#output #permanentAddress").shouldHave(text("Additional address"));
    }

}
