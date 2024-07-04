package com.sauceDemo.test;

import com.sauceDemo.test.base.BaseTest;
import com.sauceDemo.test.pages.CartPage;
import com.sauceDemo.test.pages.LoginPage;
import com.sauceDemo.test.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test(testName = "T005 Verify the items added to the cart are listed successfully in the cart page")
    public void checkCartItems() {
        LoginPage loginPageObject = new LoginPage();
        loginPageObject
                .enterUsername(BaseTest.username)
                .enterPassword(BaseTest.password)
                .clickLogin()
                .addRemoveItem("Sauce Labs Backpack")
                .addRemoveItem("Sauce Labs Bike Light")
                .openCart();

        Assert.assertTrue((new CartPage().getCartItems().stream().anyMatch(records -> records.contains("Sauce Labs Backpack"))));
        Assert.assertTrue((new CartPage().getCartItems().stream().anyMatch(records -> records.contains("Sauce Labs Bike Light"))));
    }
}
