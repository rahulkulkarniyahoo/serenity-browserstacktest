package com.browserstack.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.text.ParseException;
import com.browserstack.cucumber.pages.LocalPage;

public class LocalCheckSteps {
    LocalPage localPage;

    @Then("^I should see \"([^\"]*)\"$")
    public void matchTitle(String matchTitle) throws Throwable {
        System.setProperty("webdriver.chrome.driver","/Users/rahulk/Documents/temp/WebtestBrowserStack_Serenity/serenity-browserstack-master 2/src/test/resources/chromedriver");
        localPage.open();
        System.out.println("********************************************************");
        System.out.println("\t\tWebSite is now open");
        System.out.println("********************************************************\n\n");
        System.out.println("localPage.getTitle(); = " +  localPage.getTitle());

        System.out.println("localPage.getDriver().getTitle() = " + localPage.getDriver().getTitle());


        //localPage.bodyShouldMatch(matchTitle);
    }
}
