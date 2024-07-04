package com.sauceDemo.test;

import com.sauceDemo.test.base.BaseTest;
import com.sauceDemo.test.pages.LoginPage;
import com.sauceDemo.test.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test(testName = "T001 Add item to cart")
    public void addToCart() {
        LoginPage loginPageObject = new LoginPage();
        loginPageObject
                .enterUsername(BaseTest.username)
                .enterPassword(BaseTest.password)
                .clickLogin()
                .addRemoveItem("Sauce Labs Backpack");

        Assert.assertEquals((new ProductsPage()).getItemButtonText("Sauce Labs Backpack"), "Remove", "Button text isn't changed to Remove");
    }

    @Test(testName = "T002 Remove item from the cart")
    public void removeFromCart() {
        LoginPage loginPageObject = new LoginPage();
        loginPageObject
                .enterUsername(BaseTest.username)
                .enterPassword(BaseTest.password)
                .clickLogin()
                .addRemoveItem("Sauce Labs Backpack")
                .addRemoveItem("Sauce Labs Backpack");

        Assert.assertEquals((new ProductsPage()).getItemButtonText("Sauce Labs Backpack"), "Add to cart", "Button text isn't changed to Add to cart");
    }

}
