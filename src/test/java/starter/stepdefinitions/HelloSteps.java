package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.apitest.Hello.GetHel;


public class HelloSteps {

    @Steps
    GetHel getHel;

    @Given("I set GET api endpoints for index")
    public void setApiEndpointsForIndex() {
        getHel.setApiEndpointsForIndex();

    }

    @When("I send GET HTTP request for index")
    public void sendGetHttpRequestForIndex() {
        getHel.sendGetHttpRequestForIndex();

    }

    @Then("I receive valid HTTP response code 200 for index")
    public void validateHttpResponseCode200ForIndex() {
        getHel.validateHttpResponseCode200ForIndex();

    }
}