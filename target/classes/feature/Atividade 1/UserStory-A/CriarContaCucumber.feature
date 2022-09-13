
@CreateAccount  
Feature: create a new account by accessing the url http://automationpractice.com/index.php

I, as a user, want to register the account and log in to the platform with the account created
  @CreateAccountWithSuccess
  Scenario: Create a new account on the site from the store with success
    Given I,  as the user, access the site clicking on address bar and insert the url  "http://automationpractice.com/"
    And, as the user, clink the link "Sign in" 
    Then, is displayed two  functionality for authentication "CREATE AN ACCOUNT" with a field "Email address" with a button "Create an account"    
    When the user insert the "e-mail"  and  click on button "Create an account"  
    Then the user is redirected to the registration page with "YOUR PERSONAL INFORMATION"
    And the user click on button radio, choosing one option ("Mr or Mrs")
    Then, next, the user  insert the fields text for "First Name"  and "Last Name"  and "Password" 
    Then, as the user insert a "EMAIL" and the "Password"   
    And below, the  user click on selects for "Day","Mounth" and "Year" 
    Then So the user, if he wants, can click or no on the ckeckbox for "Sign up for our newsletter!"
    AND "Receive special offers from our partners!"
    And, further down the user has to fill in the address form
    Then the user in field "YOUR ADDRESS", the user must insert: the "First Name" and "Last  name", the First 
    And second "Address(Line 2)", which can be Apartment, suite, unit, building, floor, etc...        
    And you must also SELECT A "City", A "State", AND ENTER A "ZIP/Postal Code"
    And too SELECT a "Country"
    And ENTER SOME ADDITIONAL INFORMATION IN THE FIELD "Additional Information"  
    Then  next insert  "your home phone" and "your mobile phone"    
    And Finally, insert an "address  for future reference"
    Then right after, filling in all this information, the user clicks on the "Register" button          
    And the user is redirected to the "My Account page" 


    Examples: 
      | fields/action                                | value                                                                      |
      | url                                          |  http://automationpractice.com/index.php                                   |  
      | click in button                              |  Sign in                                                                   |
      | insert a Email address valid                 |  marisasilva445699@orbia.ag                                                | 
      | click in button                              |	Create an account                                                         |
			| click Title                                  |  Mrs                                                                       |                                                     
      | First name                                   |  marisa                                                                    |
      | Last name                                    |  silva                                                                     |
      | Email                                        | marisasilva445@orbia.ag    
      | Password                                     | yoY4^yEp)6
      |days/months/years                             | 8/May/2015                                                                 |   
      |checkboxs for (Sign up for our newsletter!    | If you want, the user can dial both checkboxesSign up for our newsletter!, |    
      | e Receive special offers from our partners!) | , Receive special offers from our partners!)  or none                      |                                                                           
      ----------------------------------------------------------------------------------------------------------------------------
      YOUR ADDRESS
      | First name                                   |marisa                                                                      |
      | Last name                                    |silva                                                                       |
      | Company                                      |orbia                                                                       |    
      | Address                                      |Rua do Fogo de Santelmo, Lote 2.07.02 1990 – 110 Lisboa (Junto ao Oceanário)|
      | Address(Line 2)                              |apto                                                                        |
      | City                                         |Estados Unidos                                                              |
      | click on the state field and select an option|California                                                                  |      
      | click insert Zip/Postal Code                 |77477                                                                       |
      | click insert Country an select an option     |United State                                                                |
      | click the field Additional information       |Cede da Microsoft                                                           |
      | click the field Home phone                   |2107-0707                                                                   |
      | click the field Mobile phone                 |+5583987653215                                                              |
      | click the Assign an address alias for future |                                                                            |
      |  reference. *                                |marisasilva445699@orbia.ag                                                  |
      | click the button                             |Register                                                                    |    
                                   
      
      
      
       
