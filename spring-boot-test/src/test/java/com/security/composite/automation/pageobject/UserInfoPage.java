package com.security.composite.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserInfoPage {

    public UserInfoPage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

}


