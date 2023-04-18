package com.az.pages;

import com.az.enums.WaitConditionType;
import com.az.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class MyCartPage {
    private static final By CLOSE_WOULD_YOU_LIKE_POPUP = By.xpath("//*[@aria-label='close jebbit questionnaire']");

    private static final By CHECKOUT_BTN = By.xpath("//*[text()='CHECKOUT']");
    public void clickCheckoutBtn() {


        try {
            SeleniumUtils.click(CHECKOUT_BTN, WaitConditionType.CLICKABLE);
        } catch (Exception e) {
            SeleniumUtils.click(CLOSE_WOULD_YOU_LIKE_POPUP);
            SeleniumUtils.click(CHECKOUT_BTN, WaitConditionType.CLICKABLE);
        }
    }

}
