package com.az.driver;

import com.az.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public final class Driver {
    private Driver() {
    }
    public static void initDriver() {
        WebDriver driver;
        if (DriverManager.getDriver() == null) {
            driver = DriverFactory.getDriver(ConfigFactory.getConfig().browser());
            DriverManager.setDriver(driver);
        }
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
        DriverManager.getDriver().get(ConfigFactory.getConfig().url());
    }
    public static void quitDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
