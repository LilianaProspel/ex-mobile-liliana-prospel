package com.example.pages;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends PageObject {

    @FindBy(className = "android.widget.TextView")
    private List<WebElement> textViews;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"ADD TO CART\"])")
    private List<WebElement> productsList;

    public ProductsPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isAtLeastOneProductDisplayed() {
        return !productsList.isEmpty();
    }

    public WebElement getPageTitle() {
        for (WebElement textView : textViews) {
            if (textView.getText().equals("PRODUCTS")) {
                return textView;
            }
        }
        return null;
    }
}