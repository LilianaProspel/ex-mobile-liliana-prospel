package com.example.steps;

import com.example.config.DriverFactory;
import com.example.pages.ProductsPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductsSteps {
    private final ProductsPage productsPage;

    public ProductsSteps() {
        AppiumDriver driver = DriverFactory.getDriver();
        this.productsPage = new ProductsPage(driver);
    }

    @Then("The user should see the title {string} and at least one product")
    public void the_user_should_see_the_title_products_and_at_least_one_product(String title)  {
        assertEquals(title, productsPage.getPageTitle().getText());
        assertTrue(productsPage.isAtLeastOneProductDisplayed());
    }

    @Then("The user should see the title {string}")
    public void the_user_should_see_the_title_products(String title)  {
        assertEquals(title, productsPage.getPageTitle().getText());
    }


    @Then("The user should see at least one product")
    public void the_user_should_see_at_least_one_product()  {
        assertTrue(productsPage.isAtLeastOneProductDisplayed());
    }
}