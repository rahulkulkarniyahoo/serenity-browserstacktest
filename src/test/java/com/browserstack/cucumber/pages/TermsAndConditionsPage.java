package com.browserstack.cucumber.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.browserstack.cucumber.utils.CommonMethods.waitPlease;
import static com.browserstack.cucumber.utils.CustomConsole.print;
import static com.browserstack.cucumber.utils.CustomConsole.printVerification;


/**
 * Created by rahulk on 16/05/2017.
 */
public class TermsAndConditionsPage extends PageObject {

    @FindBy(xpath = "//button[text()='Accept']")
    WebElement btn_Accept;

    @FindBy(xpath = "//button[text()='Decline']")
    WebElement btn_Decline;

    @FindBy(xpath = "//*[@aria-label='close']")
    WebElement btn_Close;

    // Not best practise but this this a backup.
    @FindBy(xpath = "html/body/article[3]/div[1]/button[2]")
    WebElement btn_Close2;


    public void clickAccept()  {
        print("TermsAndConditionsPage","clickAccept" );
        try {
            btn_Accept.click();

        } catch(NoSuchElementException noSEE){
           waitPlease(8);
            btn_Accept.click();
        }
    }


    public void clickCloseX() {
        print("TermsAndConditionsPage","clickCloseX" );
        try {
            btn_Close.click();
        }
        catch(ElementNotVisibleException noSEE){
            System.out.println("TermsAndConditionsPage ElementNotVisibleException. Using alternate way");
            waitPlease(8);
            btn_Close2.click();
           // btn_Accept.click(); This is just to check if it works . This line can be deleted anytime

        }

        catch(NoSuchElementException noSEE){
            System.out.println("TermsAndConditionsPage NoSuchElementException. Using alternate way");
            waitPlease(8);
             btn_Close2.click();
        }

    }

}
