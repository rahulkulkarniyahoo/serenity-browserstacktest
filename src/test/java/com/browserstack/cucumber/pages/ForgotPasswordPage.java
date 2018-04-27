package com.browserstack.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.browserstack.cucumber.utils.CommonMethods.waitPlease;
import static com.browserstack.cucumber.utils.CustomConsole.print;

/**
 * Created by rahulk on 16/05/2017.
 */
public class ForgotPasswordPage extends PageObject {
//    @FindBy(id="//*[@id='email']")
//    WebElement txt_EmailAddress;
//

    @FindBy(xpath = "//*[text()='Forgotten Password']/../..//input[@id='email']")
    WebElement txt_EmailAddress;

    @FindBy(xpath = "//button[text()='Get New Password']")
    WebElement btn_GetNewPassword;


    @FindBy(id="mOdAl_5_title")
    WebElement txt_Title;

    @FindBy(css = "div.padding.message")
    WebElement txt_Message;


    public void requestPassword() {
        txt_EmailAddress.sendKeys("rahul.kulkarni@exlibrisgroup.com");
    }

    public void requestPassword(String sEmailAddress) {
        print("ForgotPasswordPage","requestPassword" );
        System.out.println("sEmailAddress = " + sEmailAddress);

//        System.out.println("RegistrationPage.emailAddressToSet = " + RegistrationPage.emailAddressToSet);
//
//        if ((RegistrationPage.emailAddressToSet != "") && (RegistrationPage.emailAddressToSet != null)){
//            System.out.println("************ requestPassword VALUE SET = " + RegistrationPage.emailAddressToSet);
//            txt_EmailAddress.sendKeys(RegistrationPage.emailAddressToSet);
//        }
//        else
//        {
//            System.out.println("Global Value not present. Setting example value = " + RegistrationPage.emailAddressToSet);
//            txt_EmailAddress.sendKeys(sEmailAddress);
//        }
//
//        if ((RegistrationPage.emailAddressToSet !=null) && (RegistrationPage.emailAddressToSet.length()==0)){
//            txt_EmailAddress.sendKeys(RegistrationPage.emailAddressToSet);
//        }
//        else{
//            txt_EmailAddress.sendKeys(sEmailAddress);
//        }


        //txt_EmailAddress.sendKeys(sEmailAddress);

    }

    public void clickGetNewPassword() throws InterruptedException {
        print("ForgotPasswordPage","clickGetNewPassword" );
        btn_GetNewPassword.click();
     //   confirmMessage();

    }

    /**
     *
     * Obsolete as I have created a common message.
     */
    private void confirmMessage() throws InterruptedException {
       waitPlease(6);
        System.out.println("Got Title : " + txt_Title.getText());
        System.out.println("Got Message : " + txt_Message.getText());

    }
}
