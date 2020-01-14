Feature:	Navigating	to	Pay Bills
  @Pay_Bill
  Scenario: Verify that Pay	Bill  the title	is Zero - Pay Bills
    Given user is on the login page
    Then user logs in as a user
    Then user navigate to "Pay Bills" page
    Then user verifies that "Zero - Pay Bills" title is displayed

@Valid_Pay_Operation
Scenario: Verify that  successfully message is displayed
  Given user is on the login page
  Then user logs in as a user
  Then user navigate to "Pay Bills" page
  Then user enters amount into amount box and date into date box
  Then user click to pay button
  Then user verifies that "The payment was successfully submitted." success message is displayed


  @InValid_Pay_Operation
  Scenario: Verify that  error message is displayed
    Given user is on the login page
    Then user logs in as a user
    Then user navigate to "Pay Bills" page
    Then user click to pay button
    Then user verifies that "Please fill out this field" error message is displayed