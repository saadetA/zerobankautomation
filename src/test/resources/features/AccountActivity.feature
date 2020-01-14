Feature:	Navigating	to	Account  Activity
  @Account_Activity
  Scenario: Verify that Account	summary	page	should	have	the	title	Account Activity.
    Given user is on the login page
    Then user logs in as a user
    Then user navigate to "Account Activity" page
    Then user verifies that"Zero - Account Activity" message is displayed


  @Account_Activity_savings
  Scenario: Verify that Account	dropdown option is selected as savings
    Given user is on the login page
    Then user logs in as a user
    Then user navigate to "Account Activity" page
  Then user click to "Account"
    Then  Verify that Account	dropdown option is selected as "Savings"

  @Account_Activity_saving_options
  Scenario: Verify that Account	dropdown options are avaliable
    Given user is on the login page
    Then user logs in as a user
    Then user navigate to "Account Activity" page
    Then user click to "Account"
    Then  Verify that Account	dropdown option is selected as "Savings"
    Then  user verifys that Account	dropdown options are avaliable
    |Savings    |
    |Checking   |
    |Savings    |
    |Loan       |
    |Credit Card|
    |Brokerage  |

  @Account_Activity_Transactions
  Scenario: Verify that Account	dropdown options are avaliable
    Given user is on the login page
    Then user logs in as a user
    Then user navigate to "Account Activity" page
    Then  user click to "Show Transactions"
    Then user verifies that columns name are displayed
      |Date Description Deposit Withdrawal|





