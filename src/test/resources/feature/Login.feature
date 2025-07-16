@login @regression
Feature: Login
  In order to manage employee records 
  As an admin 
  I would like to login into the system

  Background: 
    Given User have browser with OrangeHRM application

  @smoke @valid
  Scenario: Valid Login
    When User enter username as 'Admin'
    And User enter password as 'admin123'
    And User click on login
    Then User should get access to dashboard page with content as 'Time at Work'

  @invalid
  Scenario Outline: Invalid Login
    When User enter username as '<username>'
    And User enter password as '<password>'
    And User click on login
    Then User should get error message as '<expected_error>'

    Examples: 
      | username | password | expected_error      |
      | john     | john123  | Invalid credentials |
      | peter    | peter123 | Invalid credentials |


