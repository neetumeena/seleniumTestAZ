package com.az.tests;

import com.az.annotations.FrameworkAnnotation;
import com.az.constants.TestData;
import com.az.pages.HomePage;
import com.az.pages.MyCartPage;
import com.az.pages.PaymentPage;
import com.az.pages.ProductDisplayPage;
import org.testng.annotations.Test;

public class CheckoutFlowTest extends BaseTest {

    @FrameworkAnnotation
    @Test(description = "end to end checkout flow for purchasing “Duralast 24DC-DL\n" + "Group Size 24 Deep Cycle Marine and RV Battery 550 CCA” for vehicle “2020 Audi A3 Premium 2.0L FI\n" + "Turbo DOHC 4cyl” using Credit Card as payment method")
    public void testCaseToPurchaseProduct_PaymentSuccess() {
        HomePage homePage = new HomePage();
        MyCartPage myCartPage = new MyCartPage();
        ProductDisplayPage productDisplayPage = new ProductDisplayPage();
        PaymentPage paymentPage = new PaymentPage();
        homePage.clickOnAddVehicle();
        homePage.setSelectYear("2020");
        homePage.setSelectMaker("Audi");
        homePage.setSelectModel("A3 Premium");
        homePage.clickOnItem("Duralast Gold Battery H5");
        productDisplayPage.clickOnAddToCartBtn();
        productDisplayPage.clickOnViewCartAndCOBtn();
        myCartPage.clickCheckoutBtn();
        paymentPage.setGuestChoice();
        paymentPage.clickContinueBtn();
        paymentPage.setCardDetails(TestData.SUCCESS_CARD_NUMBER, TestData.EXPIRY, TestData.CVV);
        paymentPage.setBillingAddress(TestData.FIRSTNAME, TestData.LASTNAME, TestData.PHONE_NUMBER, TestData.EMAIL, TestData.ADDRESS, TestData.CITY, TestData.STATE, TestData.PINCODE);
        paymentPage.clickOnCompletePaymentBtn();
    }

    @Test(description = "end to end checkout flow for purchasing “Duralast 24DC-DL\n" + "Group Size 24 Deep Cycle Marine and RV Battery 550 CCA” for vehicle “2020 Audi A3 Premium 2.0L FI\n" + "Turbo DOHC 4cyl” using Credit Card as payment method")
    public void testCaseToPurchaseProduct_PaymentFailed() {
        HomePage homePage = new HomePage();
        MyCartPage myCartPage = new MyCartPage();
        ProductDisplayPage productDisplayPage = new ProductDisplayPage();
        PaymentPage paymentPage = new PaymentPage();
        homePage.clickOnAddVehicle();
        homePage.setSelectYear("2020");
        homePage.setSelectMaker("Audi");
        homePage.setSelectModel("A3 Premium");
        homePage.clickOnItem("Duralast Gold Battery H5");
        productDisplayPage.clickOnAddToCartBtn();
        productDisplayPage.clickOnViewCartAndCOBtn();
        myCartPage.clickCheckoutBtn();
        paymentPage.setGuestChoice();
        paymentPage.clickContinueBtn();
        paymentPage.setCardDetails(TestData.FAILED_CARD_NUMBER, TestData.EXPIRY, TestData.CVV);
        paymentPage.setBillingAddress(TestData.FIRSTNAME, TestData.LASTNAME, TestData.PHONE_NUMBER, TestData.EMAIL, TestData.ADDRESS, TestData.CITY, TestData.STATE, TestData.PINCODE);
        paymentPage.clickOnCompletePaymentBtn();
    }
}
