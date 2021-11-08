package com.wired.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {

    //private AppiumDriver driver;
    @AndroidFindBy(xpath = "//android.widget.TextView[@index = '0']")
    private AndroidElement btnHamburger;

    @AndroidFindBy(id = "testing")
    private AndroidElement btnSubmit;

    public HomePage(AppiumDriver driver) {

        // this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void clickHamburgerMenu() {

        click(btnHamburger);


    }

}
