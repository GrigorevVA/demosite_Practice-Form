package com.gmail.tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import com.gmail.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;



public class AutomationPracticeForm {
    /*Locale locale = new Locale("ru");*/
    String link = "src/test/resources/Без имени.jpg";

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName=faker.name().lastName();
    String email=faker.internet().emailAddress();
    String currentAdress=faker.address().streetAddress();
    String userNumber= faker.phoneNumber().cellPhone().replaceAll("\\D+", "");

    RegistrationPage registrationPage = new RegistrationPage();
    @BeforeAll
    static void setUP() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void succesQsTest() {
        registrationPage.openPage();
        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeUserEmail(email);
        registrationPage.typeCurrendAddress(currentAdress);
        /*$("#currentAddress").setValue("ул. Пушкина, дом Колотушкина");*/

        //$("#gender-radio-1").parent().click();//
        //$("#genterWrapper").$(byText("Other")).click();
        /*$("label[for=gender-radio-3]").click();*/
        registrationPage.selectGender();
        registrationPage.typeUserNumber(userNumber);
        /*$("#userNumber").setValue("0123456789");*/

        registrationPage.calendarComponent.setDate("04","June","1996");


        //$("#hobbies-checkbox-1").parent().click();
        //$("label['for=hobbies-checkbox-1']").click();
        /*$("#hobbiesWrapper").$(byText("Sports")).click();*/
        /*registrationPage.typeHobby();*/
        $("#hobbies-checkbox-1").click(); //$(byText("Sports"))
        // sleep(7000);
//        $("#uploadPicture").uploadFile(new File("src/test/resources/Без имени.jpg"));
        registrationPage.loadPicture.loadPicture(link);
        /*$("#subjectsInput").setValue("English").pressEnter().pressEnter();*/
        registrationPage.typeOfSubject("English");



        //sleep(7000);

      //  $("#state").scrollTo().click();
      //  $("stateCity-wrapper").$(byText("NCR")).click();
      //  $("#city").click();
       // $("stateCity-wrapper").$(byText("Noida")).click();
      //  $("#submit").click();
        //$("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        //$("table-responsive").shouldHave(text("Alex Sosnitskiy"),text("vova@cool.ru"));
        registrationPage.RegistrationPage("Thanks for submitting the form");
        /*$(".table-responsive").shouldHave(text(firstName), text(lastName),
                text(email));*/
        registrationPage.checkResultsValue("Student Name",firstName + " " + lastName );







       // $("#dateOfBirthInput").click();
       // $("#dateOfBirthInput").$(".react-datepicker__day react-datepicker__day--021 react-datepicker__day--selected").click();
       // $x("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]").click();



        }
}