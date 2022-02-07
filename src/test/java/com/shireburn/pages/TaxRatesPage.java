package com.shireburn.pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaxRatesPage extends BasePage{

    @FindBy(xpath = "//input[@role='textbox']")
    public WebElement code;

    @FindBy(xpath = "(//div[@class='currentRow']//div[@data-context='TaxRate'])[1]")
    public WebElement dateFrom;

    @FindBy(xpath = "(//div[@class='currentRow']//div[@data-context='TaxRate'])[2]")
    public WebElement dateTo;

    @FindBy(xpath = "(//div[@class='currentRow']//div[@data-context='TaxRate'])[3]")
    public WebElement rangeFrom;

    @FindBy(xpath = "(//div[@class='currentRow']//div[@data-context='TaxRate'])[4]")
    public WebElement rangeTo;

    @FindBy(xpath = "(//div[@class='currentRow']//div[@data-context='TaxRate'])[5]")
    public WebElement taxRate;

    @FindBy(xpath = "(//div[@class='currentRow']//div[@data-context='TaxRate'])[6]")
    public WebElement subtract;

    @FindBy(xpath = "(//div[@class='currentRow']//div[@data-context='TaxRate'])[7]")
    public WebElement showAsPT;

    @FindBy(xpath = "//div[contains(@class, 'jqx-icon-calendar')]")
    public WebElement calendar;

    @FindBy(xpath = "//td[@aria-live='assertive']/div")
    public WebElement titleOfCalendar;

    @FindBy(xpath = "//*[.='Jan']")
    public WebElement Jan;

    @FindBy(xpath = "(//td[.='1'])[1]")
    public WebElement first;

    @FindBy(xpath = "(//td[.='31'])[1]")
    public WebElement thirtyFirst;

    @FindBy(xpath = "//*[.='Dec']")
    public WebElement Dec;

    @FindBy(xpath = "//*[.='2021']")
    public WebElement twentyOne;

    @FindBy(xpath = "//div[@data-uid='TaxRate-RangeFrom']")
    public WebElement rangeFromInitials;

    @FindBy(xpath = "//div[@data-uid='TaxRate-RangeTo']")
    public WebElement rangeToInitials;

    @FindBy(xpath = "//input[@data-uid='TaxRate-RangeFrom']")
    public WebElement lastRangeFrom;

    @FindBy(xpath = "//input[@data-uid='TaxRate-RangeTo']")
    public WebElement lastRangeTo;

    @FindBy(xpath = "//input[@data-uid='TaxRate-Rate']")
    public WebElement lastTaxRate;

    @FindBy(xpath = "//input[@data-uid='TaxRate-Subtract']")
    public WebElement lastSubtract;




}
