package com.az.pages;

import com.az.enums.WaitConditionType;
import com.az.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class ProductDisplayPage {
    private static final By ADD_TO_CART = By.xpath("//*[text()='ADD TO CART']");
    private static final By VIEW_CART_AND_CHECKOUT = By.xpath("//*[text()='VIEW CART AND CHECKOUT']");
    private static final By CLOSE_WOULD_YOU_LIKE_POPUP = By.xpath("//*[@aria-label='close jebbit questionnaire']");
    public void clickOnAddToCartBtn() {
        SeleniumUtils.click(ADD_TO_CART);
    }
    public void clickOnViewCartAndCOBtn() {
        try {
            SeleniumUtils.click(VIEW_CART_AND_CHECKOUT, WaitConditionType.CLICKABLE);
        } catch (Exception e) {
            SeleniumUtils.click(CLOSE_WOULD_YOU_LIKE_POPUP, WaitConditionType.CLICKABLE);
            SeleniumUtils.click(VIEW_CART_AND_CHECKOUT, WaitConditionType.CLICKABLE);
        }
    }
}
