Feature: Give bread to the hungry.

  Eugenio will give you some cookie, in the case you're angry. Several types of cookies are available.

  @Ask
  Scenario Outline: Ask for a cookie.
    Given Eugenio brings <initial_cookies> cookies
    Given Alvaro is hungry
    When Alvaro asks for a cookie to Eugenio
    Then Eugenio has <final_cookies> cookies
    And Alvaro is not hungry

    Examples:
    | initial_cookies | final_cookies |
    |               1 |             0 |
    |               4 |             3 |

  Scenario: Ask for a cookie but no cookies.
    Given Eugenio brings 0 cookies
    Given Alvaro is hungry
    When Alvaro asks for a cookie to Eugenio
    Then Eugenio has 0 cookies
    And Alvaro is hungry

  @Offers
  Scenario Outline: Offers a cookie and rejected.
    Given Eugenio brings <initial_cookies> cookies
    Given Alvaro is not hungry
    When Eugenio offers a cookie to Alvaro
    Then Eugenio has <final_cookies> cookies
    Then Alvaro is not hungry

    Examples:
      | initial_cookies | final_cookies |
      |               1 |             1 |
      |               4 |             4 |

  Scenario Outline: Offers a cookie and accepted.
    Given Eugenio brings <initial_cookies> cookies
    Given Alvaro is hungry
    When Eugenio offers a cookie to Alvaro
    Then Eugenio has <final_cookies> cookies
    Then Alvaro is not hungry

    Examples:
      | initial_cookies | final_cookies |
      |               1 |             0 |
      |               4 |             3 |