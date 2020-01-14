package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage {

@FindBy(css = "[required='required']")
public WebElement account;

 @FindBy(css = "option[value='1']")
public WebElement savings1;

    @FindBy(css = "option[value]")
    public List<WebElement > options;

   @FindBy(tagName="thead")
public List<WebElement> transactions;

    public List<String> getColumnNames() {
        return BrowserUtils.getListOfString(options);
    }


    public List<String> getColumnNames1() {
        return BrowserUtils.getListOfString(transactions);
    }

}
