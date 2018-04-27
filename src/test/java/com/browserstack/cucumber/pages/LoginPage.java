package com.browserstack.cucumber.pages;

import com.browserstack.cucumber.utils.CommonMethods;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.browserstack.cucumber.utils.CommonMethods.waitPlease;
import static com.browserstack.cucumber.utils.CustomConsole.print;


/**
 * Created by rahulk on 16/05/2017.
 */

@DefaultUrl("https://classregister.campusm.org")
public class LoginPage extends PageObject {


    @FindBy(xpath = "//button[text()='Register']")
    WebElement btn_Register;


    @FindBy(xpath = "//*[text()='Please complete your details']/../..//button[text()='Register'][1]")
    WebElement btn_Register2;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement btn_Login;

    @FindBy(xpath = "//button[text()='Forgot Password']")
    WebElement btn_ForgotPassword;

    @FindBy(xpath = "//*[@id='submit']")
    WebElement btn_SSOLogin;

    @FindBy(id = "email")
    WebElement txt_email;

    @FindBy(id = "login")
    WebElement txt_Username;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    WebElement txt_ErrorMessage;


    TermsAndConditionsPage termsAndConditionsPage;
    CommonMethods commonMethods;


    @Step
    public void clickRegister() {
        print("LoginPage", "clickRegister");
        waitForPresenceOf("//button[text()='Register']");
        btn_Register.click();
    }

    @Step
    public void loginValidUser() {
        print("LoginPage", "loginValidUser");
        waitForWithRefresh();
        txt_email.sendKeys("myemail1@testemail.com");
        txt_password.sendKeys("UnsecuredPassword!23");
        btn_Login.click();
    }


    public void clickForgotPassword() {

        print("LoginPage", "clickForgotPassword");
        btn_ForgotPassword.click();
    }


}
