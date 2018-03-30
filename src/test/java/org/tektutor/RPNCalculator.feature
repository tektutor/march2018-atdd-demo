Feature: Develop a RPN Calculator application

   This application will accept a math expression in reverse polish notation, evaluates
   and returns the result.

   Scenario: Simple Addition
      Given I provide the input as "10 15 +"
      When I invoke evaluate method
      Then I expect the result as "25.0"

   Scenario Outline: Simple Subtraction
      Given I provide the <input>
      When I invoke evaluate method
      Then I expect the <expectedResult>

    Examples:
    | input       | expectedResult |
    | "100 85 -"  | "15.0"         |
    | "10 8 -"    | "2.0"          |
    | "10 80 -"    | "-70.0"       |