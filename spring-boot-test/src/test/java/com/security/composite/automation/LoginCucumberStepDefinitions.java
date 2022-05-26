package com.security.composite.automation;

import com.security.composite.automation.pageobject.LoginPage;
import com.security.composite.automation.pageobject.UserInfoPage;
import com.security.composite.automation.pageobject.WelcomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;


@SpringBootTest
public class LoginCucumberStepDefinitions {

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


    @Given("web browser loaded the welcome page")
    public void webb_browser_is_open(){
        driver.get("http://localhost:8080");
    }


    @When("^the user click login link in welcome page$") //^$ - for input parameters
    public void click_login_link_in_welcome_page(){
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickLoginLink();
    }

    @Then("^login page should be displayed$")
    public void login_page_displayed(){
        String source = driver.getPageSource();
        Assert.assertTrue(source.contains("Email:"));
    }

    @When("^the user enter credentials in login page$")
    public void enter_credentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @Then("^userinfo page should be displayed$")
    public void userinfo_page_displayed(){
        UserInfoPage userInfoPage = new UserInfoPage(driver);
        String source = driver.getPageSource();
        Assert.assertTrue(source.contains("User Info page"));
    }

    @After
    public void cleanUp(){
        driver.close();
        driver = null;
    }

    //TODO: HOMEWORK - test the register flow
}
