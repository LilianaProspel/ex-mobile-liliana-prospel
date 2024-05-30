package com.example.pages;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObject {

    @FindBy(id = "test-Username")
    private WebElement usernameField;

    @FindBy(id = "test-Password")
    private WebElement passwordField;

    @FindBy(id = "test-LOGIN")
    private WebElement loginButton;

    public LoginPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void tapLoginButton() {
        loginButton.click();
    }
}
