
Feature: Login functionalities

  Scenario: Login with correct credentials
    Given web browser loaded the welcome page
    When the user click login link in welcome page
    Then login page should be displayed
    When the user enter credentials in login page
    Then userinfo page should be displayed