package com.wired.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    public void click(AndroidElement element){
        waitForVisible(element);
        element.click();

    }

    public static void waitForVisible(AndroidElement element){

        //WebDriverWait wait = new WebDriverWait(driver,5);

        WebDriverWait wait = new WebDriverWait(element.getWrappedDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
