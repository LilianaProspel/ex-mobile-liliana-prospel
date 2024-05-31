Feature: SwagLabs Login

  #Scenario: Successful login with valid credentials
  #  Given The user enter "standard_user" and password "secret_sauce"
  #  When the user presses the login button
  #  Then The user should see the title "PRODUCTS" and at least one product

  Scenario: Successful login with valid credentials
    Given The user enter "standard_user" and password "secret_sauce"
    When the user presses the login button
    Then The user should see the title "PRODUCTS"

  Scenario: Successful view products page after login
    Given The user enter "standard_user" and password "secret_sauce"
    When the user presses the login button
    Then The user should see at least one product