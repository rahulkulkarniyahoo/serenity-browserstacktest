package com.browserstack.cucumber.pages;


import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.browserstack.cucumber.utils.CustomConsole.print;

/**
 * Created by rahulk on 19/05/2017.
 */
public class MessagePage extends PageObject {
    @FindBy(xpath = "//*[@class='alert alert-error']")
    WebElement msg_Area;

     @FindBy(xpath = "//div[@class='padding message']")
     WebElement msg_Area2;

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    public void verifyPasswordSentMessage(String sExpectedMessage) throws InterruptedException {
        print("MessagePage","verifyPasswordSentMessage" );
      //  String sExpectedMessage = "Please enter the email address you used to register and we will email you a new password";
        /**
         *
         * Tried multiple options of wait types, but none of them working.
         * waitFor also didnt work.
         * Rahul 30May2017
         * */


        Thread.sleep(3000);


        try {

            Assert.assertEquals("Oops! Messages don't match!", sExpectedMessage, msg_Area.getText());
        }

        catch (NoSuchElementException e) {
            System.out.println("Waited 3 seconds for element to be present. Waiting another 5 seconds");

            Thread.sleep(5000);
            Assert.assertEquals("Oops! Messages don't match!", sExpectedMessage, msg_Area2.getText());
        }
        System.out.println("Confirmation! Expected Message " + sExpectedMessage + " was found!");

    }
}
