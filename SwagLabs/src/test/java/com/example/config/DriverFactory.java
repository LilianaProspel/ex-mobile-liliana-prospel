package com.example.config;

import driver.AppiumAndroidDriver;
import io.appium.java_client.AppiumDriver;

public class DriverFactory {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            driver = AppiumAndroidDriver.suNavegador().onDriver();
        }
        return driver;
    }
}