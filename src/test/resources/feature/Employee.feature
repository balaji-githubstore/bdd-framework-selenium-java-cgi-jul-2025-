@employee
Feature: Employee
  In order to manage employee records 
  As an user 
  I would like to add, edit and delete employee records

  Scenario Outline: Add Valid Employee
    Given User have browser with OrangeHRM application
    When User enter username as '<username>'
    And User enter password as '<password>'
    And User click on login
    And User click on PIM menu
    And User click on Add Employee
    And User fill the employee form
      | firstname | middlename | lastname   |
      | <fname>   | <mname>    | <lastname> |
    And User clicks on save employee
    Then User should get the profile name as '<fname> <lastname>'
    And User should get the personal details as per the form filled

    Examples: 
      | username | password | fname | mname | lastname |
      | Admin    | admin123 | john  | w     | wick     |
      | Admin    | admin123 | jack  | w     | wick     |
