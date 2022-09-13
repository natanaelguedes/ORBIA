
@registrationOnTheOrbiaWebsite  
Feature: I, as a user, must access the  url (https://www.orbia.ag/) and register as an agro-specialist on the ORBIA website 
That as a user, I can register as an Agrospecialist on the Orbia website

  @RegisterAsAnAgrospecialistOntheOrbiaWebsite
  
  Scenario: The user should view the purchase made in the order history.
    Given I,  as the user, access the site clicking on address bar and insert the url  "http://orbia.com/"
    Then  the user logs into the Orbia website, providing the username and password
    And click the "Access orbia" button
    Then check if the registration is correct
    And click on the continue registration button
    Then click on the field "Choose a production"
    And  select a production
    And select a the quantity
    Then click on the "Add Production" button
    When I click on the select field, I choose a production and the quantity              
    And click the Continue button    
    Then select the state and city
    And click all the checkboxes to accept the terms of use (the first, "I have read and agree with theTerms of use"
    the second, "I have read and agree to the Privacy Policy*", and the third, I have read and agree to the "Bayern Impulse Regulations", where Bayern Regulations is a "link"  )
    Then I click on the link "Bayern regulations"    
    When clicking on the link, a page with the term in PDF document format is automatically opened in another window or tab
    Then click on the "Finish Registration" button.
    And a validation code with five numbers is sent to the mobile number informed in the registration
    Then insert a code of validation
    And it is redirected to the store page.
   
     Examples: 
      | fields/action                                | value/mensage                                                                                                                 |
      | url                                          |  "https://www.orbia.ag/"                                                                                                      |  
      | click in button                              |  Entre ou Cadastre-se     	                                                                                                   |
      | insert a Email valid                         |	ngsneto@gmail.com                                                                                                            |
      | insert a Password                            |  yoY4^yEp)7																										       			                                                   |         
      | click a link                                 | "Acessa a Orbia"                                                                                                              |                                                     
      | click in button                              |"Independent Agronomist"                                                                                                       |                                                                           
      | click select production                      |"Batata"                                                                                                                       | 
      | click to select size/quantity                | "4"                                                                                                                           |
      | click on the checkbox and accept all terms   | "I have read and agree with theTerms of use",                                                                                 |
      |                                              | "I have read and agree to the Privacy Policy*"                                                                                |
      |                                              | " and the third, I have read and agree to the " Bayern Impulse Regulations,                                                   |
      |                                              |    where "Bayern Regulations" is a "link"	                                                                                   | 
      |                                              |"a page with the term in PDF document format is automaticallypened in another window or tab"                                   |
      | click in link                                | "Bayern Impulse Regulation",and a page with the term in PDF document format is automatically opened in another window or tab  |    
      | click on the "Finish Registration" button    |"And a validation code with five numbers is sent to the mobile number informed in the registration                      "      |
     
      
      
       