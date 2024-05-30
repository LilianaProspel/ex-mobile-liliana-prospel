package com.example.pages;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends PageObject {

    @FindBy(xpath = "//*[@text='PRODUCTS']")
    private WebElement productsTitle;

    @FindBy(className = "android.widget.TextView")
    private List<WebElement> productsList;

    public ProductsPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isProductsTitleDisplayed() {
        return productsTitle.isDisplayed();
    }

    public boolean isAtLeastOneProductDisplayed() {
        return productsList.size() > 0;
    }
}