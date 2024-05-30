Feature: SwagLabs Login

  Scenario: Successful login with valid credentials
    Given The user enter "standard_user" and password "secret_sauce"
    When the user presses the login button
    Then The user should see the title PRODUCTS and at least one product
