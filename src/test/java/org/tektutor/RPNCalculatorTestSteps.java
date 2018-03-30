package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class RPNCalculatorTestSteps {

    private String rpnMathExpression;
    private RPNCalculator rpnCalculator;
    private double expectedResult, actualResult;

    @Given("^I provide the input as \"([^\"]*)\"$")
    public void i_provide_the_input_as(String rpnMathExpression) throws Throwable {
        this.rpnMathExpression = rpnMathExpression;
    }

    @When("^I invoke evaluate method$")
    public void i_invoke_evaluate_method() throws Throwable {
        rpnCalculator = new RPNCalculator();
        actualResult = rpnCalculator.evaluate( rpnMathExpression );
    }

    @Then("^I expect the result as \"([^\"]*)\"$")
    public void i_expect_the_result_as(String expectedResult) throws Throwable {
        this.expectedResult = Double.parseDouble(expectedResult);
        assertEquals ( this.expectedResult, actualResult, 0.0001 );
    }

}