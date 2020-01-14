package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import gherkin.ast.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinition {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("user verifies that{string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        Assert.assertEquals("title can not found", string, Driver.get().getTitle());
    }


    @Then("user verifies that columns are displayed")
    public void user_verifies_that_columns_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
        BrowserUtils.wait(2);
    Assert.assertEquals(dataTable,accountSummaryPage.getColumnNames());
    }

    @Then("user verifies that rows are displayed")
    public void user_verifies_that_rows_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
        BrowserUtils.wait(2);
        Assert.assertEquals(dataTable,accountSummaryPage.getRowNames());
    }
    }
