package com.browserstack.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.browserstack.cucumber.utils.CommonMethods.waitPlease;
import static com.browserstack.cucumber.utils.CustomConsole.print;


/**
 * Created by rahulk on 23/05/2017.
 */

public class ProfilePage extends PageObject {


    @FindBy(xpath = "//*[@id='postcode']")
    WebElement txt_PostCode;

    @FindBy(xpath = "//*[text()='Submit']")
    WebElement btn_Submit;

    public boolean pageLoaded() {
        print("ProfilePage", "pageLoaded");
        boolean status = false;

        try {
            waitFor("//*[text()='Please select a profile']");
            status = true;
        }
        catch(NoSuchElementException noSuchElementException) {
            System.out.println("findElementByID: noSuchElementException1");
            waitABit(4000);
            try {

                getDriver().findElement(By.xpath("//*[text()='Please select a profile']")).isDisplayed();
                status = true;
            } catch (NoSuchElementException noSuchElementException2) {
                System.out.println("findElementByID: noSuchElementException2");
                return false;
            }
        }

        return status;
    }

    public void clickProfile(String sProfileName) throws InterruptedException {
        print("ProfilePage", "clickProfile");
        if (pageLoaded()) {
            System.out.println("Page Loaded. Now clicking on the profile" + sProfileName);
            getDriver().findElement(By.xpath("//*[text()='" + sProfileName + "']")).click();
            waitPlease(1);
        } else {
            System.out.println("Came in Else");
            if (getDriver().findElement(By.xpath("//*[text()='" + sProfileName + "']")).isDisplayed()) {
                getDriver().findElement(By.xpath("//*[text()='" + sProfileName + "']")).click();
                System.out.println("Came in if after the else and now clicked!");
            } else {
                System.out.println("******** ProfilePage: clickProfile: Couldn't find Profile = " + sProfileName + " not could load the Page, I think! Dummy **********!!");
                Assert.assertTrue(false);
            }
        }
    }

    public void openWebsite(String sEnvironment) {
        System.out.println("Came in OpenWebsite");
        sEnvironment = sEnvironment.toUpperCase();


        switch (sEnvironment) {
            case "QA":
                System.out.println("*****************************************************************************************************");
                System.out.println("****************************** GETTING QA URL  *****************************************************");
                System.out.println("*****************************************************************************************************");
                getDriver().get("https://www.google.com");
                break;
            case "DEV":
                getDriver().get("https://www.yahoo.com");
                break;
            default:
                System.out.println("\nNO ENVIRONMENT WAS DECLARED.\nPlease define Environment with switch e.g -DEnvironment=qa\n\n\n\n");
                System.exit(0);
                break;
        }

        System.out.println("\n*************************************************************************");


        System.out.println("***************** Gettting Environment Property *************************");
        System.out.print("*****************  Current Environment = " +  System.getProperty("Environment") + " ");
        for (int i = 18 + sEnvironment.length(); i < 49; i++)
            System.out.print("*");

        System.out.println();
        System.out.println("*************************************************************************");
        getDriver().manage().window().maximize();
    }

    public void clickGuestProfile() throws InterruptedException {
        clickProfile("Guest Profile");
    }


}

