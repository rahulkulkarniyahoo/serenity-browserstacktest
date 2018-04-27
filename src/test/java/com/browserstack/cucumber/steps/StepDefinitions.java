package com.browserstack.cucumber.steps;

import com.browserstack.cucumber.pages.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;








import java.io.IOException;

import static com.browserstack.cucumber.utils.CommonMethods.waitPlease;

public class StepDefinitions  {


    LoginPage loginPage;
    ProfilePage profilePage;
    TermsAndConditionsPage termsAndConditionsPage;
    ForgotPasswordPage forgotPasswordPage;
    MessagePage messagePage;
    HomeMenuPage homeMenuPage;







    String sEnvironment = null;

    @Before
    public void startUp() throws IOException, InterruptedException {
        System.out.println("*****************************************************************************************************");
        sEnvironment = System.getProperty("Environment");
        System.out.println("Starting up = " + sEnvironment);
        System.out.println("*****************************************************************************************************\n\n");
    }

    @Given("^I am on CampusM QA App$")
    public void i_am_on_CampusM_QA_App() throws Throwable {
        System.out.println("i_am_on_CampusM_QA_App, envrionment = " + sEnvironment );
        profilePage.openWebsite(sEnvironment);
    }



    @Given("^select guest profile$")
    public void select_guest_profile() throws Throwable {
        System.out.println("select_guest_profile");
        profilePage.clickGuestProfile();

    }

    @Given("^select register$")
    public void select_register() throws Throwable {
        loginPage.clickRegister();
    }


    @When("^I select X on Terms and Conditions Page$")
    public void i_select_X_on_Terms_and_Conditions_Page() throws Throwable {
        waitPlease(3);
        termsAndConditionsPage.clickCloseX();

    }


    @Then("^I am verify that I am navigated to login home menu page$")
    public void i_am_verify_that_I_am_navigated_to_login_home_menu_page() throws Throwable {
        homeMenuPage.verifyChangeProfileExists();
    }


    @When("^I can indicate I forgot my password and enter my \"([^\"]*)\"$")
    public void i_can_indicate_I_forgot_my_password_and_enter_my(String sEmailAddress) throws Throwable {
        loginPage.clickForgotPassword();
        forgotPasswordPage.requestPassword(sEmailAddress);
    }

    @Then("^I can request for password in email$")
    public void i_can_request_for_password_in_email() throws Throwable {
        forgotPasswordPage.clickGetNewPassword();
    }


    @Then("^I can confirm message displayed by application is \"([^\"]*)\"$")
    public void i_can_confirm_message_displayed_by_application_is(String sPasswordMessage) throws Throwable {
        messagePage.verifyPasswordSentMessage(sPasswordMessage);
    }
}
