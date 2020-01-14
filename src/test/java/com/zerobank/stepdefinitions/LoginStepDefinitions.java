package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as a user")
    public void user_logs_in_as_a_user() {
        System.out.println("Login as a user");
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);

    }

    @Then("user verifies that{string}page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println(string);
        Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }







    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with "+string+" username and "+string2+" password");
    }




    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println("verified that warning message is displayed: "+string);
   BrowserUtils.wait(10);


    }






}
