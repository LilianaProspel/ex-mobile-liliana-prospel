package com.example.steps;

import io.cucumber.java.en.*;
import com.example.pages.LoginPage;
import com.example.pages.ProductsPage;
import io.appium.java_client.AppiumDriver;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private final LoginPage loginPage;
    private final ProductsPage productsPage;

    public LoginSteps(AppiumDriver driver) {
        this.loginPage = new LoginPage(driver);
        this.productsPage = new ProductsPage(driver);
    }
    @Given("The user enter {string} and password {string}")
    public void the_user_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @When("the user presses the login button")
    public void the_user_presses_the_login_button() {
        loginPage.tapLoginButton();
    }
    @Then("The user should see the title PRODUCTS and at least one product")
    public void the_user_should_see_the_title_products_and_at_least_one_product(String title) {
        assertTrue(productsPage.getTitle().contains(title));
        assertTrue(productsPage.isAtLeastOneProductDisplayed());
    }
}