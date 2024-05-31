package com.example.steps;

import com.example.config.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        DriverFactory.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        DriverFactory.getDriver().quit();
    }
}