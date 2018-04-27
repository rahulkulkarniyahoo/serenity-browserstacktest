package com.browserstack.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.browserstack.cucumber.utils.CommonMethods.waitPlease;
import static com.browserstack.cucumber.utils.CustomConsole.print;



/**
 * Created by rahulk on 12/12/2017.
 */
public class HomeMenuPage extends PageObject {

    @FindBy(xpath = "//*[text()='Change Profile']")
WebElement link_ChangeProfile;

    public void verifyChangeProfileExists() {
        print("HomeMenuPage","verifyChangeProfileExists" );
        try {
            Assert.assertEquals("The button with text Change Profile was not found",true,link_ChangeProfile.isDisplayed());
            System.out.println("VERIFICATION! The button with text Change Profile was found");

        } catch(NoSuchElementException noSEE){
            waitPlease(5);
            Assert.assertEquals("NoSuchElementException: The button with text Change Profile was not found",true,link_ChangeProfile.isDisplayed());
        }

    }
}
