package com.wired.commons;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class DriverClass {

    private  static ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

    //pass an instance of the driver to this method to maintain same thread operations and achieve parallel executions
    public static void setDriver(AppiumDriver driverInstance){

        driver.set(driverInstance);
    }

    public static WebDriver getDriver(){

        return driver.get();
    }

    public static void launchApp(){


    }
}
