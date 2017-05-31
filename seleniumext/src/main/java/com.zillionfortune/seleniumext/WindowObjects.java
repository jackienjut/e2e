package com.zillionfortune.seleniumext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

/**
 * Created by luhaiming on 2017/1/4 0004.
 */
public class WindowObjects {
    public static WebDriver driver;


    public WindowObjects() {
        driver = DriverFactory.getChromeDriver();

    }

    public void loadPage(String url) {

    }

    public void click(WebElement element, WaitConditions... conditions) {

    }

    public void input(WebElement element, String text, WaitConditions... conditions) {

    }
}
