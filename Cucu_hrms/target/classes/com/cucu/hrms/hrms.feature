Feature: HRMS

  @VerifyTitle
  Scenario: Verify Title
  	Given Open Application
    When Verify Title
    Then Close Application
    
    @LoginPage
    Scenario: Login Page
    	Given Open Application
    	When Provide Login Credential
    	Then Verify Title
    	And Logout
    	And Close Application
    	
    @AddEmployee
    Scenario: Add Employee
    	Given Open Application
    	When Provide Login Credential
    	Then Verify Title
    	Then Add Employee
    	And Logout
    	And Close Application