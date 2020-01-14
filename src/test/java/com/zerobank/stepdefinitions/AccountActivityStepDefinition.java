package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefinition {

BasePage basePage=new BasePage();
 AccountActivityPage accountActivityPage=new AccountActivityPage();

    @Then("user navigate to {string} page")
    public void user_navigate_to_page(String string) {
      basePage.navigateTo(string);
    }



   @Then("user click to {string}")
   public void user_click_to(String string) {
BrowserUtils.wait(2);
       accountActivityPage.account.click();
  }

    @Then("Verify that Account	dropdown option is selected as {string}")
    public void verify_that_Account_dropdown_option_is_selected_as(String string) {
        Assert.assertTrue(accountActivityPage.savings1.isSelected());
    }

    @Then("user verifys that Account	dropdown options are avaliable")
    public void user_verifys_that_Account_dropdown_options_are_avaliable(List<String> dataTable) {
        System.out.println(dataTable);
        BrowserUtils.wait(2);
        Assert.assertEquals(dataTable,accountActivityPage.getColumnNames());
    }


    @Then("user verifies that columns name are displayed")
    public void user_verifies_that_columns_name_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
        BrowserUtils.wait(2);
        Assert.assertEquals(dataTable,accountActivityPage.getColumnNames1());
    }




}
