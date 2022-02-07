package com.shireburn.pages;

import com.shireburn.utilities.BrowserUtils;
import com.shireburn.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaxProfilesPage extends BasePage{

    @FindBy(id = "insertButton")
    public WebElement addButton;

    @FindBy(id = "editButton")
    public WebElement editButton;

    @FindBy(id = "deleteActionButton")
    public WebElement deleteButton;

    @FindBy(id = "taxratebutton")
    public WebElement ratesButton;

    @FindBy(id = "saveButton")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@type='textbox']")
    public WebElement taxProfileInput;

    @FindBy(xpath = "//*[@class='jqx-grid-cell-left-align mandatory warning']")
    public WebElement taxProfileDescription;

    @FindBy(xpath = "//div[@data-uid='TaxProfile-FssStatusType']")
    public WebElement fssStatusInitial;

    @FindBy(xpath = "//*[starts-with(@id, \"dropdownlistContentdropdown\")]")
    public WebElement fssStatus;

    @FindBy(xpath = "//span[starts-with(text(),\"FSS M\")]")
    public WebElement fssStatusMain;

    @FindBy(xpath = "//*[@class='currentRow']/div[5]/div/div/div")
    public WebElement taxOnAnnualGross;

    @FindBy(id = "cancelButton")
    public WebElement cancelButton;

    @FindBy(xpath = "(//div[.='automation'])[2]")
    public WebElement currentRow;

    @FindBy(xpath = "//div[.='qa']")
    public WebElement highlight;

    @FindBy(xpath = "//input[@data-uid='FilterRow-TaxProfile-Code']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[.='delete']")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//span[.='No data to display']")
    public WebElement noDataToDisplay;

    @FindBy(xpath = "//div[contains(@class, \"jqx-grid-content-metro\")]")
    public WebElement taxProfileAfterAdded;

    @FindBy(xpath = "//div[.='automation2']")
    public WebElement edittedTaxProfileDescription;
}
