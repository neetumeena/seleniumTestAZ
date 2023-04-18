package com.az.utils;

import com.az.config.ConfigFactory;
import com.az.driver.DriverManager;
import com.az.enums.WaitConditionType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {


    public static void click(By by) {
        WebElement element = waitUntilElementPresent(by);
        element.click();
    }

    public static void click(By by, WaitConditionType waitConditionType) {
        WebElement element = null;
        if (waitConditionType == WaitConditionType.PRESENCE)
            element = waitUntilElementPresent(by);
        else if (waitConditionType == WaitConditionType.CLICKABLE) {
            element = waitUntilElementToBeClickable(by);
        } else if (waitConditionType == WaitConditionType.VISIBLE) {
            element = waitUntilElementToBeVisible(by);
        }
        element.click();
    }

    public static void sendKeys(By by, String value) {
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
    }

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement waitUntilElementToBeClickable(By by) {
        System.out.println(by.toString());
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private static WebElement waitUntilElementToBeVisible(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
