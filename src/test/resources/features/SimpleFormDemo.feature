Feature: Test Simple Form Demo

  Scenario: Single Input Field
    Given user has opened the Simple Form Demo Page
    When user enters the message in the text box "Hello World"
    Then click on Show Message button
    And your message displays again "Hello World"

    Scenario: Two Input Field
      Given user has opened the Simple Form Demo Page
      When user enters the value a "4"
      And user enters the value b "5"
      Then clicks on get total button
      And total of a + b is displayed "9"
