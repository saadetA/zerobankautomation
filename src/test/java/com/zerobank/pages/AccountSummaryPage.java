package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;



public class AccountSummaryPage extends BasePage {


    @FindBy(className = "board-header")
    public List<WebElement>  accountTypes;

    @FindBy(css = "div:nth-child(6) th")
public List<WebElement> creditAccountsColumns;

    public List<String> getColumnNames() {
        return BrowserUtils.getListOfString(accountTypes);
    }

    public List<String> getRowNames() {
        return BrowserUtils.getListOfString(creditAccountsColumns);
    }


}