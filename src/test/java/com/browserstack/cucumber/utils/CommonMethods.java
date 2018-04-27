package com.browserstack.cucumber.utils;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.browserstack.cucumber.utils.CustomConsole.print;
import static com.browserstack.cucumber.utils.CustomConsole.printVerification;

/**
 * Created by rahulk on 20/11/2017.
 */
public class CommonMethods extends PageObject {
    @FindBy(xpath = "//button[@class='compact_2ijo4EC4 circular_1MLzuY5H basic_7PujQN0w negative_UJzj9wSZ button_21xmO-88']")
    static
    WebElement btn_Reset;

    @FindBy(xpath = "//button[@class='compact_2ijo4EC4 circular_1MLzuY5H basic_7PujQN0w secondary_2eUD73Q6 button_21xmO-88']")
    static
    WebElement btn_Done;

    @FindBy(xpath = "//*[@title='Grid View']")
    static
    WebElement btn_GridView;

    @FindBy(xpath = "//*[@title='List View']")
    static
    WebElement btn_ListView;

    @FindBy(xpath="//*[@aria-label='Search Tiles']")
    static
    WebElement btn_SearchTiles;


    @FindBy(xpath = "//a[@class='item_37Ws40BY']")
    WebElement item_ListView;

    public void waitSmallForElementToBePresent(WebElement waitForString) {
        print("CommonMethods", "waitSmallForElementToBePresent");
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(waitForString));
    }

    public static void waitPlease(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
