Feature: MY QA APP


  @regression @qaapp @tc231
  Scenario Outline: Forgot Password, Error message returned when not valid @tc23
    Given I am on CampusM QA App
    And select guest profile
    When I can indicate I forgot my password and enter my <EmailAddress>
    Then I can request for password in email
    And I can confirm message displayed by application is <PasswordMessage>

    Examples:
      | ProfileName             | EmailAddress                 | PasswordMessage                 |
      | "A Guest Profile Group" | "IdontExist@UknownEmail.com" | "E-mail address does not exist" |