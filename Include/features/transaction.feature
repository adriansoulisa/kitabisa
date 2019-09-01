@tag
Feature: The test case verifies that a user can login with a valid account

  Scenario Outline: Transaction successfully
    Given The Login page is loaded successfully
    When I login the system with valid "<username>" username and "<password>" password
    When I fill in the donation "<number>" number  
    Then I validate the transaction

    Examples: 
      | username         	  | password       | number|
      | testd6881@gmail.com | 08Februari1998 | 20000|
      
  