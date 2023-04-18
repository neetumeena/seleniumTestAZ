package com.az.pages;

import com.az.enums.WaitConditionType;
import com.az.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class HomePage {


    private static final By ADD_VEHICLE = By.xpath("//button[@data-testid='deskTopVehicle-menu-lg']");
    private static final By SELECT_YEAR_BOX = By.id("yearheader");
    private static final By SELECT_YEAR = By.xpath("//*[text()='%replaceable%']");
    private static final By SELECT_MAKER_BOX = By.id("makeheader");
    private static final By SELECT_MODEL_BOX = By.id("modelheader");
    private static final By SELECT_MODEL = By.xpath("//*[text()='%replaceable%']");
    private static final By WOULD_YOU_LIKE = By.xpath("//*[text()='WOULD YOU LIKE']");
    private static final By CLOSE_WOULD_YOU_LIKE_POPUP = By.xpath("//*[@aria-label='close jebbit questionnaire']");
    //    private static final By SELECT_ITEM = By.xpath("//*[contains(text(),'%replaceable%')]");
    private String select_item = "//*[contains(text(),'%replaceable')]";
    //    private static final By SELECT_MAKER = By.xpath("//*[text()='%replaceable%']");
    private String select_maker = "//*[text()='%replaceable']";
    private String select_year = "//*[text()='%replaceable']";
    private String select_by_text = "//*[text()='%replaceable']";

    public void clickOnAddVehicle() {

        SeleniumUtils.click(ADD_VEHICLE);
    }

    public void setSelectYear(String year) {
        String year_ = select_by_text.replaceAll("%replaceable", year);
        SeleniumUtils.sendKeys(SELECT_YEAR_BOX, year);
        SeleniumUtils.click(By.xpath(year_));
    }

    public void setSelectMaker(String makerType) {
        String maker = select_by_text.replaceAll("%replaceable", makerType);
        SeleniumUtils.sendKeys(SELECT_MAKER_BOX, makerType);
        SeleniumUtils.click(By.xpath(maker));
    }

    public void setSelectModel(String modelType) {
        String model = select_by_text.replaceAll("%replaceable", modelType);
        SeleniumUtils.sendKeys(SELECT_MODEL_BOX, modelType);
        SeleniumUtils.click(By.xpath(model));
    }

    public void clickOnItem(String itemName) {
        String item = select_item.replaceAll("%replaceable", itemName);

        try {
            SeleniumUtils.click(By.xpath(item), WaitConditionType.CLICKABLE);
        } catch (Exception e) {
            SeleniumUtils.click(CLOSE_WOULD_YOU_LIKE_POPUP);
            SeleniumUtils.click(By.xpath(item), WaitConditionType.CLICKABLE);
        }
//        System.out.println(item);
//        SeleniumUtils.click(By.xpath(item), WaitConditionType.CLICKABLE);
    }
}
