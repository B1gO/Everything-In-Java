package com.security.composite.automation.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage{

    @FindBy(id = "login")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='col-sm-12']//h2")
    private WebElement welcomeMessage;

    public WelcomePage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
        PageFactory.initElements(driver, this);
    }

    //methods
    public void clickLoginLink(){
        loginButton.click();
    }
}
