package com.jackie.seleniumext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by luhaiming on 2017/1/4 0004.
 */
public class DriverFactory {

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver getFireFoxDriver() {
        return null;
    }
}
