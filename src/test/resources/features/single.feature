Feature: Google's Search Functionality

#    Scenario: Can find search results
#        When I type query as "BrowserStack"
#        And I submit
#        Then I should see title "BrowserStack - Google Search"
#
#
#    @regression @qaapp @tc24
#    Scenario: Attempt a log in and reject the terms and conditions and observe the response @tc24
#        Given I am on CampusM QA App
#        And select guest profile
#        And select register
#        When I select X on Terms and Conditions Page
#        Then I am verify that I am navigated to login home menu page


    @regression @qaapp @tc23
    Scenario Outline: Forgot Password, Error message returned when not valid @tc23
        Given I am on CampusM QA App
        And select guest profile
        When I can indicate I forgot my password and enter my <EmailAddress>
        Then I can request for password in email
        And I can confirm message displayed by application is <PasswordMessage>

        Examples:
            | ProfileName             | EmailAddress                 | PasswordMessage                 |
            | "A Guest Profile Group" | "IdontExist@UknownEmail.com" | "E-mail address does not exist" |