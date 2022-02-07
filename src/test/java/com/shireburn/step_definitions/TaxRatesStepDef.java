package com.shireburn.step_definitions;

import com.shireburn.pages.TaxProfilesPage;
import com.shireburn.pages.TaxRatesPage;
import com.shireburn.utilities.BrowserUtils;
import com.shireburn.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TaxRatesStepDef {

    TaxRatesPage taxRatesPage = new TaxRatesPage();
    TaxProfilesPage taxProfilesPage = new TaxProfilesPage();

    @Given("User fills in the required fields with {string}, {string}, {string}, {string}, {string}")
    public void user_fills_in_the_required_fields_with(String code, String rangeFrom, String rangeTo, String taxRate, String subtract) {
        taxRatesPage.code.sendKeys(code);
        BrowserUtils.waitFor(2);
        taxRatesPage.dateFrom.click();
        taxRatesPage.calendar.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.titleOfCalendar.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.titleOfCalendar.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.twentyOne.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.Jan.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.first.click();
        BrowserUtils.waitFor(2);

        taxRatesPage.dateTo.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.calendar.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.titleOfCalendar.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.titleOfCalendar.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.twentyOne.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.Dec.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.thirtyFirst.click();
        BrowserUtils.waitFor(2);

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        taxRatesPage.rangeFromInitials.click();
        taxRatesPage.lastRangeFrom.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.lastRangeFrom.sendKeys(rangeFrom);
        BrowserUtils.waitFor(2);
        taxRatesPage.rangeToInitials.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.lastRangeTo.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.lastRangeTo.sendKeys(rangeTo);
        BrowserUtils.waitFor(2);
        taxRatesPage.taxRate.click();
        taxRatesPage.lastTaxRate.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.lastTaxRate.sendKeys(taxRate);
        BrowserUtils.waitFor(2);
        taxRatesPage.subtract.click();
        taxRatesPage.lastSubtract.click();
        BrowserUtils.waitFor(2);
        taxRatesPage.lastSubtract.sendKeys(subtract);
    }

    @Then("User verifies datas are added {string}")
    public void user_verifies_datas_are_added(String string) {
        Assert.assertTrue(Driver.get().findElement(By.xpath("//div[.='"+string+"']")).isDisplayed());
    }

}
