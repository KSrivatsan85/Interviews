package com.wired.pages;

import com.wired.commons.DriverClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {

    //if
    //private AppiumDriver driver;
    @AndroidFindBy(xpath = "//android.widget.TextView[@index = '0']")
    private AndroidElement btnHamburger;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'SEARCH')]")
    private AndroidElement lnkSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TOP STORIES')]")
    private AndroidElement lnkBusiness;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'GEAR')]")
    private AndroidElement lnkGear;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'SCIENCE')]")
    private AndroidElement lnkScience;

    public HomePage() {

        // this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(DriverClass.getDriver()), this);

    }

    public void clickHamburgerMenu() {

        StringBuilder page = new StringBuilder();
        click(btnHamburger);


    }

}
