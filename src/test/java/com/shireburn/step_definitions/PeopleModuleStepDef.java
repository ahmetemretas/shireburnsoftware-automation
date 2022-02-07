package com.shireburn.step_definitions;

import com.shireburn.pages.PeopleModulePage;
import com.shireburn.utilities.BrowserUtils;
import com.shireburn.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PeopleModuleStepDef {
    @When("User clicks Tax Profile")
    public void user_clicks_tax_profile() {
        PeopleModulePage peopleModulePage = new PeopleModulePage();
        peopleModulePage.taxProfiles.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Title is incorrect","QATest01 - Tax Profiles", Driver.get().getTitle());
    }
}
