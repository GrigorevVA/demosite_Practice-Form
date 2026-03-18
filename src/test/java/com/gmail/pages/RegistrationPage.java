package com.gmail.pages;

import com.codeborne.selenide.SelenideElement;
import com.gmail.pages.components.CaledarComponent;
import com.gmail.pages.components.LoadPicture;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationPage {


    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmail = $("#userEmail"),
            resultsNameTable =$("#example-modal-sizes-title-lg"),
            currentAddress= $("#currentAddress"),
            gender=$("label[for=gender-radio-3]"),
            subject = $("#subjectsInput"),
            resultsTable = $(".table-responsive"),

            setNumber=$("#userNumber");





   /* $("#currentAddress").setValue("ул. Пушкина, дом Колотушкина");*/
    public CaledarComponent calendarComponent=new CaledarComponent();
    public LoadPicture loadPicture = new LoadPicture();
    public void openPage(){
       // open("/automation-practice-form");
        open("");
        $(byText("Forms")).click();
        $(byText("Practice Form")).click();


        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

    }

    public void typeFirstName(String value){

        firstNameInput.setValue(value);
    }
    public void typeLastName(String value) {

        lastNameInput.setValue(value);
    }
    public void typeUserEmail(String value) {
        userEmail.setValue(value);
    }

    public void typeCurrendAddress(String value){
        currentAddress.setValue(value);

    }
    public void selectGender(){

        gender.click();
    }
    public void typeUserNumber(String value){

        setNumber.setValue(value);
    }
    public void typeOfSubject(String value){
        subject.setValue(value).pressEnter().pressEnter();
    }


    public void RegistrationPage(String value){
        resultsNameTable.shouldHave(text(value));
    }


    public RegistrationPage checkResultsValue(String key, String value) {
        resultsTable.$(byText(key))
                .parent().shouldHave(text(value));
        return this;


    }


}
