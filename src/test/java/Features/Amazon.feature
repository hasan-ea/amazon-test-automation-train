Feature: Amazon.com
  Scenario: Amozon.com Adding Product
    Given User is on homepage
    When accept cookies
    When Click the search area
    When Write product name
    When Click the search button
    When Filter for shipped Amazon
    When Click the First product
    When Add to cart
    When Check at cart page
