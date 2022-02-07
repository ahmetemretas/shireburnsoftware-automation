package com.shireburn.step_definitions;

import com.shireburn.pages.TaxProfilesPage;
import com.shireburn.utilities.BrowserUtils;
import com.shireburn.utilities.ConfigurationReader;
import com.shireburn.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TaxProfilesStepDef {
    TaxProfilesPage taxProfilesPage = new TaxProfilesPage();

    @When("User clicks Add button")
    public void user_clicks_add_button() {
        taxProfilesPage.addButton.click();
        BrowserUtils.waitFor(2);
    }

    @Given("User fills in the required fields")
    public void user_fills_in_the_required_fields() {
        taxProfilesPage.taxProfileInput.sendKeys(ConfigurationReader.get("taxProfileName"));
        taxProfilesPage.taxProfileDescription.click();
        taxProfilesPage.taxProfileInput.sendKeys(ConfigurationReader.get("taxProfileDescription"));
        taxProfilesPage.fssStatusInitial.click();
        taxProfilesPage.fssStatus.click();
        taxProfilesPage.fssStatusMain.click();
        taxProfilesPage.taxOnAnnualGross.click();

    }

    @Then("User clicks Save button")
    public void user_clicks_save_button() {
        taxProfilesPage.saveButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("User cliks Rates button")
    public void user_cliks_rates_button() {
        taxProfilesPage.ratesButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Title is incorrect", "QATest01 - Tax Rates", Driver.get().getTitle());
    }
    @When("User highlights the tax profile")
    public void user_highlights_the_tax_profile() {
        taxProfilesPage.searchInput.sendKeys(ConfigurationReader.get("taxProfileName"));
        BrowserUtils.waitFor(3);

    }
    @When("User clicks Delete button")
    public void user_clicks_delete_button() {
        taxProfilesPage.deleteButton.click();
    }
    @When("User clicks Delete to accept")
    public void user_clicks_delete_to_accept() {
        taxProfilesPage.deleteConfirm.click();
        BrowserUtils.waitFor(2);
    }
    @When("User verifies there is no data to display")
    public void user_verifies_there_is_no_data_to_display() {
        Assert.assertTrue("There is data to display",taxProfilesPage.noDataToDisplay.isDisplayed());
    }
    @When("User clicks Edit button")
    public void user_clicks_edit_button() {
        taxProfilesPage.editButton.click();
    }
    @Given("User edits required fields")
    public void user_edits_required_fields() {
        taxProfilesPage.taxProfileInput.clear();
        taxProfilesPage.taxProfileInput.sendKeys(ConfigurationReader.get("taxProfileDescription2"));

    }
    @Then("User clicks Cancel button")
    public void user_clicks_cancel_button() {
        taxProfilesPage.cancelButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Current row is incorrect", ConfigurationReader.get("taxProfileDescription"), taxProfilesPage.currentRow.getText());
    }
    @Then("User verifies new Tax Profile is added")
    public void user_verifies_new_tax_profile_is_added() {
        taxProfilesPage.searchInput.sendKeys(ConfigurationReader.get("taxProfileName"));
        BrowserUtils.waitFor(3);
        Assert.assertTrue(taxProfilesPage.taxProfileAfterAdded.isDisplayed());
    }
    @Then("User verifies Tax Profiles edited")
    public void user_verifies_tax_profiles_edited() {
        Assert.assertTrue(Driver.get().findElement(By.xpath("//div[.='"+ConfigurationReader.get("taxProfileDescription2")+"']")).isDisplayed());
    }

}