package com.shireburn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PeopleModulePage extends BasePage{
    @FindBy(xpath = "//*[@data-bind='text: label'][@class='currentModuleSectionGroup-moduleText fxStretch']")
    public WebElement taxProfiles;
}
