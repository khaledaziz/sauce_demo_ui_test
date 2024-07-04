package com.sauceDemo.test.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class BasePage {

    protected WebDriver driver;
    private final int defaultImplicitlyWaitTime = 40;

    public BasePage() {
        driver = BaseTest.getDriver();
    }

    public void typeTextToField(String text, By field) {
        waitForPresenceOfElement(field);
        findElement(field).sendKeys(text);
    }

    public void waitForPresenceOfElement(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public WebElement findElement(By element) {
        return driver.findElement(element);
    }

    protected void clickOnElement(By element) {
        waitElementToBeClickable(element);
        findElement(element).click();
    }

    protected void waitElementToBeClickable(By element) {
        wait.until(elementToBeClickable(element));
    }

    protected List<WebElement> findElements(By element) {
        return driver.findElements(element);
    }

    FluentWait<WebDriver> wait = new FluentWait<>(BaseTest.getDriver())
            .withTimeout(Duration.ofSeconds(defaultImplicitlyWaitTime))
            .pollingEvery(Duration.ofMillis(200))
            .ignoring(NoSuchElementException.class);

    protected String getElementText(By element) {
        waitForPresenceOfElement(element);
        String text = findElement(element).getText();
        return text;
    }

    protected String getScreenShot() {
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
        return base64Screenshot;
    }
}
