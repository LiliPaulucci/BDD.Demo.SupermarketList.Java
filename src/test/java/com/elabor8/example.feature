Feature: SupermarketList
  A simple supermarket list that we can add and remove products from

  Scenario: A new list no contents
    When I create a new list
    Then the list has no contents

  Scenario: Add an item to the list
    Given I create a new list
    When I add an product to the list
    Then the list contains the product added

  Scenario: Add an item with quantity to the list
    Given I create a new list
    When I add 3 Cookies to the list
    Then the list contains a quantity of 3 cookies

  Scenario: Adding package of rice with quantity to the list
    Given I create a new list
    And I add 2 'Kgs of rice'
    Then the list contains a quantity of 2 'Kgs of rice'

  Scenario: Remove Cookies from the list
    Given I create a new list
    And I add 3 'Cookies'
    When I remove 'Cookies' from the list
    Then the list doesnt contains 'Cookies'

  Scenario: Remove 2 Cookies from the list
    Given I create a new list
    And I add 3 'Cookies'
    When I remove 2 'Cookies' from the list
    Then the list contains a quantity of 1 'Cookies'