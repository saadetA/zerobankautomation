package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(css = "[class='signin btn btn-info']")

    public WebElement signinButton;

    @FindBy(id = "user_login")

    public WebElement loginInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(css = "[value = 'Sign in']")
    public WebElement signIn;

    @FindBy(className = "alert alert-error")
    public WebElement warningmessage;


    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }


    public void login(String userName, String password){
        signinButton.click();


        loginInput.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordInput.sendKeys(password, Keys.ENTER);


    }






}