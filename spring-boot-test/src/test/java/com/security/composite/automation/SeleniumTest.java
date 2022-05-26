package com.security.composite.automation;

import com.security.composite.automation.pageobject.LoginPage;
import com.security.composite.automation.pageobject.UserInfoPage;
import com.security.composite.automation.pageobject.WelcomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        /**
         * Download chromedriver from: https://chromedriver.chromium.org/downloads
         * Make Sure to choose a version compatible with your current chrome browser !!!
         * Place the chromedriver.exe in your desired path
         */
        String chromeDriverPath = "D:\\Workspace\\Junit-Automation-Test\\spring-boot-without-test\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin(){
        driver.get("http://localhost:8080");

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickLoginLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        UserInfoPage userInfoPage = new UserInfoPage(driver);

        Assert.assertTrue(driver.getPageSource().contains("User Info page"));
    }


    @After
    public void clearUp(){
        driver.close();
        driver = null;
    }

    //TODO: HOMEWORK - test the register flow

}
