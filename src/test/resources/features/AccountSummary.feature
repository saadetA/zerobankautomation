Feature:	Navigating	to	Accounts	Summary
  @Account_summary
  Scenario: Verify that Account	summary	page	should	have	the	title	Zero	–Account	summary.
    Given user is on the login page
    Then user logs in as a user
    Then user verifies that"Zero - Account Summary" message is displayed



  @Account_Summary_Types
  Scenario: Verify that Account Types display
    Given user is on the login page
    Then user logs in as a user
    Then  user verifies that columns are displayed
      |Cash Accounts       |
      |Investment Accounts |
      |Credit Accounts     |
      |Loan Accounts       |



  @Credit_Accounts
  Scenario: Verify that Credit Account Headers display
    Given user is on the login page
    Then user logs in as a user
    Then  user verifies that column names are displayed
      |Account|Credit Card|Balance|

