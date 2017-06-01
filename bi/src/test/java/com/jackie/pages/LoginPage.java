package com.jackie.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by luhaiming on 2017/6/1 0001.
 */
public class LoginPage extends CommonPage {
    @FindBy(xpath = "/html/body/div[1]/div/div/div/input[1]")
    private WebElement username_input;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/input[2]")
    private WebElement password_input;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/button")
    private WebElement login_button;


    public void inputUserName(String username){
        input(username_input , username);
    }

    public void inputPassword(String password){
        input(password_input , password);
    }

    public void clickLoginButton(){
        click(login_button);
    }
}
