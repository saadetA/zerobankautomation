package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PayBillStepDefinitions {

PayBillPage payBillPage=new PayBillPage();
    @Then("user verifies that {string} title is displayed")
    public void user_verifies_that_title_is_displayed(String string) {
        Assert.assertEquals("title can not found", string, Driver.get().getTitle());
    }

    @Then("user enters amount into amount box and date into date box")
    public void user_enters_amount_into_amount_box_and_date_into_date_box() {
       payBillPage.amount.sendKeys("12500");
    payBillPage.date.sendKeys("2020-01-01");
    }


    @Then("user verifies that {string} success message is displayed")
    public void user_verifies_that_success_message_is_displayed(String string) {

   Assert.assertEquals("message is not displayed", string, payBillPage.successMessage.getText());
    }




    @Then("user click to pay button")
    public void user_click_to_pay_button() {
payBillPage.payButton.click();
    }


    @Then("user verifies that {string} error message is displayed")
    public void user_verifies_that_error_message_is_displayed(String string) {
     //  Assert.assertEquals(string,);
    }

}
