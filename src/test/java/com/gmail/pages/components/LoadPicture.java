package com.gmail.pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class LoadPicture {
    public void loadPicture(String link){
        $("#uploadPicture").uploadFile(new File(link));
    }
}
