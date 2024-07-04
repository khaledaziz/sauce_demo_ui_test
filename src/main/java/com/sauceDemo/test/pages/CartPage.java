package com.sauceDemo.test.pages;

import com.sauceDemo.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends BasePage {

    protected By cartItems = By.xpath("//div[@class= 'inventory_item_name']");

    public List<String> getCartItems(){
        List<WebElement> elements = findElements(cartItems);
        List<String> itemsNames = new ArrayList<>(elements.size());

        for(WebElement element: elements){
            if(elements.size() > 0){
                itemsNames.add(element.getText());
            }
        }
        return itemsNames;
    }

}
