package com.shireburn.step_definitions;

import com.shireburn.pages.LoginPage;
import com.shireburn.utilities.BrowserUtils;
import com.shireburn.utilities.ConfigurationReader;
import com.shireburn.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("User logs in succesfully")
    public void user_logs_in_succesfully() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        loginPage.login();
        BrowserUtils.waitFor(2);
        String title = Driver.get().getTitle();
        Assert.assertEquals("Title is incorrect","QATest01 - People Module",title);
    }

}
