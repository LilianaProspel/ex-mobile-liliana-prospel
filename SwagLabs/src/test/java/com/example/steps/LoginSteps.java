package com.example.steps;

import com.example.config.DriverFactory;
import io.cucumber.java.en.*;
import com.example.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    private final LoginPage loginPage;
    private AppiumDriver localDriver;

    public LoginSteps() {
        AppiumDriver driver = DriverFactory.getDriver();
        this.loginPage = new LoginPage(driver);
        this.localDriver = driver;
    }

    @Given("The user enter {string} and password {string}")
    public void the_user_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("the user presses the login button")
    public void the_user_presses_the_login_button() {
        loginPage.tapLoginButton();
        this.wait_element_disappear();
    }

    @Given("The user is logged in with {string} and password {string}")
    public void the_user_is_logged_in_with_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Given("The user waits for the application to open")
    public void the_user_waits_for_the_application_to_open() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void wait_element_disappear() {
        WebDriverWait wait = new WebDriverWait(localDriver, java.time.Duration.ofSeconds(5));
        WebElement myElement = localDriver.findElement(By.xpath("//*[@content-desc='test-LOGIN']"));
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }
}