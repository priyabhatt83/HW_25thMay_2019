@login

@login

Feature: user is not able to login successfully with incorrect or
  blank credential

  Background:
    Given user is on homepage

  Scenario Outline:
    When user click on Log In button
    And user enters invalid "<Email>" and "<Password>"
    And click on login button
    Then User should not able to login successfully
    And user can see "<error message>"

    Examples:

      | Email           | Password |  error message                                  |

      | soni@test.com   | temp123  |   The credentials provided are incorrect        |
      | Test1@test.com  | raj123   |   The credentials provided are incorrect        |
      |                 | raj123   |   Please enter your email                       |
      | soni@test.com   |          |   The credentials provided are incorrect        |
      | Test1@test.com  |          |   The credentials provided are incorrect        |
      |                 | temp123  |   Please enter your email                       |
      | Test1@test.com  | temp123  |   No customer account found                     |
      |                 |          |   Please enter your email                       |