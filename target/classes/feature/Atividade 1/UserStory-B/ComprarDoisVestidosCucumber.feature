
@buyDressesInStore  
Feature: I, as a user, must access the store url (http://automationpractice.com/index.php) to buy two dresses 
As a user, I must make a purchase in the store and view the purchase in the order history.

  @buyTwoDressesInStore
  Scenario: The user should view the purchase made in the order history.
    Given I,  as the user, access the site clicking on address bar and insert the url  "http://automationpractice.com/"
    Then, as the user, clink the link "Sign in"  
    Then, is displayed two  functionality for authentication "ALREADY REGISTERED?" with a field "Email address" with a button "Create an account"    
    And in the first field "CREATE ACCOUNT" WITH THE FIELDS "Email address", password and a login button
    Then, in the second interface in the field "ALREADY REGISTERED?" 
    When a user enters a valid email address and password   
    And,  click the login button
    When, a user is redirected to a "my account" interface page
    And, a user click the link "DRESSES ->Evening Dresses"
    Then, as the wearer, place the mouse arrow in the middle of the dress, selecting it
    And  click the  "Quick viewt" button
    When, click the quantity field
    Then choose the option "1"   
    When click the  size field
    Then choose option "M"
    And  click on the gray color
    When click the  "Add to cart" button
    Then click the  "Continue shopping" button    
    And click the "Quick Preview" button again
    When, click the quantity field
    Then choose the option "1"   
    When click the  size field
    Then choose option "S"
    And click on pink
    When click the  "Add to cart" button
    Then click the  "Proceed to checkout" button    
    And E The user will be redirected to a product summary page, which 
    is divided into : 01.Abstract 02.Login, 03.Address, 04.Shipping and 05. Payment.
    Then so by default it will be displayed in 01.Summary, because the user will see the following information: the image, the description, the status (which is in stock (default option)), the dollar value: of the unit price, of the quantity of piece per item, product total and total, and the shipping total, tax and grand total of all these items, and DELIVERY ADDRESS and INVOICE ADDRESS, and a Proceed to checkout button      
    And the user click the "Proceed to checkout button"
    When the user is logged in to the store s website, he will be redirected to 03.Address, otherwise, he will have to log in to the website 02.Sign in
    Then so, in this case, as the user is already logged in, he will see his address data, where the billing address and a checkbox will be displayed, which in this case is the email address informed on the registration page and that by default is already checked.    
    And below is displayed the shipping address and your billing address both with the refresh button    
    Then further down there is a button to add new address, a text field in case you want to add a comment. Beyond two buttons continue shopping and proceed to checkout
    And the user click "Proceed to checkout" button    
    Then the option to ship to this address is displayed and below displayed that the carrier delivers the next day!
    And now just accept the terms of service  
    Then I click on the checkbox to agree to the terms of service and will abide by them unconditionally.
    And click "Proceed to checkout" button to redirect to payment page    
    Then on this page displays the items that are in the shopping cart and their total value    
    And now, then click the option "Pay by check"
    Then on the PAYMENT page it displays saying that it was paid by check    
    And the page shows a brief summary of your order, such as the total amount of your order.   
    Then so says that it only allows payment by check if the currencies are in Dollars    
    And  also if the check payment currencies are in dollars 
    Then the user verifies the owner information and informs that the address will be displayed on the next page.
    And confirm the order by clicking "I confirm my order".
    Then a next page, show "your order on store is complete", showing order reference, showing the order reference and informs that an email has been sent to the user who made the purchase
    And displays the message "Your order will be shipped as soon as we receive your payment."
    Then the user clicks the "back to orders" button
    And on the ORDER HISTORY page is displayed: the order reference, the date, the total price, the payment type, the status, the invoice, and two buttons "Details" and "reorder"
                    Examples: 
      | fields/action                                | value                                                                      |
      | url                                          |  http://automationpractice.com/index.php                                   |  
      | click in button                              |  Sign in                                                                   |
      | insert a Email address valid                 |  marisasilva445@orbia.ag                                                | 
      | click in button                              |	Create an account                                                         |
			| click Title                                  |  Mrs                                                                       |                                                     
      | First name                                   |  marisa                                                                    |
      | Last name                                    |  silva                                                                     |
      | Email                                        |   marisasilva445@orbia.ag         
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
                                   
      
      
      
       