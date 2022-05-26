package com.security.composite.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;

public class LoginPage {

    @FindBy(id = "emailTxt")
    private WebElement email;

    @FindBy(id = "pwd")
    private WebElement password;

    @FindBy(name = "submit")
    private WebElement submitButton;


    public LoginPage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("emailTxt")));
        PageFactory.initElements(driver, this);
    }

    public void login(){
        email.clear();
        email.sendKeys("a@gmail.com");
        password.clear();
        password.sendKeys("a@gmail.com");
        submitButton.click();
    }
}
