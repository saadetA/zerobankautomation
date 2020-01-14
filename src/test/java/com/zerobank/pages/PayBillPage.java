package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillPage extends BasePage{
    @FindBy(css="input[class='span4 hasDatepicker']")
    public WebElement date;

    @FindBy(css=".span1")
    public WebElement amount;


    @FindBy(css="[id='alert_content']")
    public WebElement successMessage;

    @FindBy(id="pay_saved_payees")
    public WebElement payButton;
    @FindBy(css="")
    public WebElement failedMessage;

}
