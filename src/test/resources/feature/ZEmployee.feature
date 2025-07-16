#@employee
#Feature: Employee
  #In order to manage employee records 
  #As an user 
  #I would like to add, edit and delete employee records
#
  #Scenario: Add Valid Employee
    #Given User have browser with OrangeHRM application
    #When User enter username as 'Admin'
    #And User enter password as 'admin123'
    #And User click on login
    #And User click on PIM menu
    #And User click on Add Employee
    #And User fill the employee form
      #| firstname | middlename | lastname |
      #| john      | w          | wick     |
    #And User clicks on save employee
    #Then User should get the profile name as 'john wick'
    #And User should get the personal details as per the form filled
    #
    #
  #
    #
#@employee
#Feature: Employee
  #In order to manage employee records 
  #As an user 
  #I would like to add, edit and delete employee records
#
  #Scenario Outline: Add Valid Employee
    #Given User have browser with OrangeHRM application
    #When User enter username as '<username>'
    #And User enter password as '<password>'
    #And User click on login
    #And User click on PIM menu
    #And User click on Add Employee
    #And User fill the employee form
      #| firstname | middlename | lastname   | create_login_detail   | select_employee_type   |
      #| <fname>   | <mname>    | <lastname> | <enable_login_detail> | <select_employee_type> |
    #And User clicks on save employee
    #Then User should get the profile name as '<fname> <lastname>'
    #And User should get the personal details as per the form filled
#
    #Examples: 
      #| username | password | fname | mname | lastname | enable_login_detail | select_employee_type |
      #| Admin    | admin123 | john  | w     | wick     | yes                 | contract             |
      #| Admin    | admin123 | jack  | w     | wick     | no                  | contract             |
    