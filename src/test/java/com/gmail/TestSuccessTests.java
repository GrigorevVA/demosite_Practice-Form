package com.gmail;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSuccessTests {

    @Test
    void successTest() {
        open ("https://demoqa.com/text-box");

        $("#userName").setValue("Vladimir");
        $("#userEmail").setValue("email@gmail.com");
        $("#currentAddress").setValue("345St");
        $("#permanentAddress").setValue("445St");
        //$("#submit").click();

       // $("#output").shouldBe(visible);

       // $("#name").shouldHave(text("Vladimir"));
       // $("#email").shouldHave(text("email@gmail.com"));
       // $("#currentAddress").shouldHave(text("345St"));
       // $("#permanentAddress").shouldHave(text("445St"));



    }

}
