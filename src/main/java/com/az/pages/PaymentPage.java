package com.az.pages;

import com.az.enums.WaitConditionType;
import com.az.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class PaymentPage {

    private static final By GUEST_CHOICE = By.xpath("//*[text()='Continue As Guest']");
    private static final By CONTINUE_BTN = By.xpath("//*[text()='CONTINUE']");
    private static final By COMPLETE_PURCHASE_BTN = By.xpath("//*[text()='COMPLETE PURCHASE']");
    private static final By CARD_NUMBER = By.id("cardNumber");
    private static final By EXPIRY = By.id("expiry");
    private static final By SECURITY_CODE = By.id("securityCode");
    private static final By FIRSTNAME = By.id("firstName");
    private static final By LASTNAME = By.id("lastName");
    private static final By PHONE_NUMBER = By.id("phoneNumber");
    private static final By EMAIL = By.id("email");
    private static final By ADDRESS1 = By.id("address1");
    private static final By CITY = By.id("city");
    private static final By STATE = By.id("state");
    private static final By ZIPCODE = By.id("zipCode");
    private static final By CLOSE_WOULD_YOU_LIKE_POPUP = By.xpath("//*[@aria-label='close jebbit questionnaire']");


    public void setGuestChoice() {
        try {
            SeleniumUtils.click(GUEST_CHOICE, WaitConditionType.CLICKABLE);
        } catch (Exception e) {
            SeleniumUtils.click(CLOSE_WOULD_YOU_LIKE_POPUP);
//            By GUEST_CHOICE = By.xpath("//*[text()='Continue As Guest']");
            SeleniumUtils.click(GUEST_CHOICE, WaitConditionType.CLICKABLE);
        }
    }

    public void clickContinueBtn() {
        SeleniumUtils.click(CONTINUE_BTN);
    }

    public void clickOnCompletePaymentBtn() {
        SeleniumUtils.click(COMPLETE_PURCHASE_BTN);
    }

    public void setCardNumber(String cardNumber) {
        SeleniumUtils.sendKeys(CARD_NUMBER, cardNumber);
    }

    public void setExpiry(String expiry) {
        SeleniumUtils.sendKeys(EXPIRY, expiry);
    }

    public void setSecurityCode(String securityCode) {
        SeleniumUtils.sendKeys(SECURITY_CODE, securityCode);
    }

    public void setFirstname(String firstname) {
        SeleniumUtils.sendKeys(FIRSTNAME, firstname);
    }

    public void setLastname(String lastname) {
        SeleniumUtils.sendKeys(LASTNAME, lastname);
    }

    public void setPhoneNumber(String phoneNumber) {
        SeleniumUtils.sendKeys(PHONE_NUMBER, phoneNumber);
    }

    public void setAddress1(String address1) {
        SeleniumUtils.sendKeys(ADDRESS1, address1);
    }

    public void setEmail(String email) {
        SeleniumUtils.sendKeys(EMAIL, email);
    }

    public void setCity(String city) {
        SeleniumUtils.sendKeys(CITY, city);
    }

    public void setState(String state) {
        SeleniumUtils.sendKeys(STATE, state);
    }

    public void setCardDetails(String cardNumber, String expiry, String cvv) {
        SeleniumUtils.sendKeys(CARD_NUMBER, cardNumber);
        SeleniumUtils.sendKeys(EXPIRY, expiry);
        SeleniumUtils.sendKeys(SECURITY_CODE, cvv);
        SeleniumUtils.click(CONTINUE_BTN);


    }

    public void setBillingAddress(String firstname, String lastname, String phoneNumber, String email, String address1, String city, String state, String zipCode) {
        SeleniumUtils.sendKeys(FIRSTNAME, firstname);
        SeleniumUtils.sendKeys(LASTNAME, lastname);
        SeleniumUtils.sendKeys(PHONE_NUMBER, phoneNumber);
        SeleniumUtils.sendKeys(EMAIL, email);
        SeleniumUtils.sendKeys(ADDRESS1, address1);
        SeleniumUtils.sendKeys(CITY, city);
        SeleniumUtils.sendKeys(STATE, state);
        SeleniumUtils.sendKeys(ZIPCODE, zipCode);
        SeleniumUtils.click(CONTINUE_BTN);


    }
}
