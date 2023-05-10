package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.apitest.Orders.Getallord;
import starter.apitest.Orders.GetOrd;
import starter.apitest.Orders.PostOrd;

public class OrderSteps {

    @Steps
    PostOrd postOrd;
    @Steps
    Getallord getallord;
    @Steps
    GetOrd getOrd;

    @Given("I set GET api endpoints for all orders")
    public void setApiEndpointsForAllOrders() {
        getallord.setApiEndpointsForAllOrders();

    }

    @When("I send GET HTTP request for all orders")
    public void sendGetHttpRequestForAllOrders() {
        getallord.sendGetHttpRequestForAllOrders();

    }

    @Then("I receive valid HTTP response code 200 for all orders")
    public void validateHttpResponseCode200ForAllOrders() {
        getallord.validateHttpResponseCode200ForAllOrders();

    }


    @Given("I set POST endpoints for create new orders")
    public void SetPOSTEndpointsForCreateNewOrders() {
        postOrd.SetPOSTEndpointsForCreateNewOrders();

    }

    @When("I send POST HTTP request for create new orders")
    public void SendPOSTHTTPRequestForCreateNewOrders() {
        postOrd.SendPOSTHTTPRequestForCreateNewOrders();

    }

    @Then("I receive a valid HTTP response code 200 in create new orders")
    public void ReceiveAValidHTTPResponseCodeInCreateNewOrders() {
        postOrd.ReceiveAValidHTTPResponseCodeInCreateNewOrders();

    }

    @Given("I set GET api endpoints for orders by ID")
    public void setApiEndpointsForOrdersByID() {
        getOrd.setApiEndpointsForOrdersByID();
    }

    @When("I send GET HTTP request for orders by ID")
    public void sendGetHttpRequestForOrdersByID() {
        getOrd.sendGetHttpRequestForOrdersByID();
    }

    @Then("I receive valid HTTP response code 200 for orders by ID")
    public void validateHttpResponseCode200ForOrdersByID() {
        getOrd.validateHttpResponseCode200ForOrdersByID();
    }
}
