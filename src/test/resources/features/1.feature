Feature: 

	#User Story
	#
	#As a user I should be able to Navigate to AccountSummary
	#
	#AC
	#
	#Verify that user should be Navigate to AccountSummary
	@CT7-95
	Scenario: user should be able to navigate Account summary
		 
		 
		 
		 
		 Scenario: Verify that Account	summary	page	should	have	the	title	Zero	–Account	summary.
		    Given user is on the login page
		    Then user logs in as a user
		    Then user verifies that"Zero - Account Summary" message is displayed
		