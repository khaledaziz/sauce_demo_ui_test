package com.sauceDemo.test.pages;

import com.sauceDemo.test.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    protected By usernameInput = By.id("user-name");
    protected By passwordInput = By.id("password");
    protected By loginButton = By.id("login-button");

    public LoginPage enterUsername(String username){
        clickOnElement(usernameInput);
        typeTextToField(username, usernameInput);
        return new LoginPage();
    }

    public LoginPage enterPassword(String password){
        clickOnElement(passwordInput);
        typeTextToField(password, passwordInput);
        return new LoginPage();
    }

    public ProductsPage clickLogin(){
        clickOnElement(loginButton);
        return new ProductsPage();
    }

}
