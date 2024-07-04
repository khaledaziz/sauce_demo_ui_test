package com.sauceDemo.test.pages;

import com.sauceDemo.test.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    protected By cartButton = By.xpath("//div[@id = 'shopping_cart_container']//a");

    public ProductsPage addRemoveItem(String item){
        clickOnElement(By.xpath("//div[text() = '"+item+"']//ancestor::div[@class= 'inventory_item_description']//button"));
        return new ProductsPage();
    }

    public CartPage openCart(){
        clickOnElement(cartButton);
        return new CartPage();
    }

    public String getItemButtonText(String item){
        return getElementText(By.xpath("//div[text() = '"+item+"']//ancestor::div[@class= 'inventory_item_description']//button"));
    }

}
