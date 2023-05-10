package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.apitest.Autentication.GetAut;
import starter.apitest.Autentication.PostLogAut;
import starter.apitest.Autentication.PostRegAut;

public class AutenticationSteps {
    @Steps
    GetAut getAut;
    @Steps
    PostLogAut postLogAut;
    @Steps
    PostRegAut postRegAut;


    @Given("I set GET api endpoints for autentication")
    public void setApiEndpointsForAuten() {
        getAut.setApiEndpointsForAuten();
    }

    @When("I send GET HTTP request for autentication")
    public void sendGetHttpRequestForAuten() {
        getAut.sendGetHttpRequestForAuten();
    }

    @Then("I receive valid HTTP response code 200 for autentication")
    public void validateHttpResponseCode200ForAuten() {
        getAut.validateHttpResponseCode200ForAuten();
    }


    @Given("I perform POST operational for login")
    public void PerformPOSToperationalforlogin() {
        postLogAut.PerformPOSToperationalforlogin();
    }

    @When("I send POST HTTP request login")
    public void sendPostHttpRequestForAutenLogin() {
        postLogAut.sendPostHttpRequestForAutenLogin();
    }

    @Then("I receive valid HTTP response code 200 for login")
    public void receiveHttpResponseCode200ForLogin() {
        postLogAut.receiveHttpResponseCode200ForLogin();
    }

    @Given("I register using the correct data")
    public void RegisterUsingTheCorrectData() {
        postRegAut.RegisterUsingTheCorrectData();
    }

    @When("I submit a POST request to {string} with fullname {string}, email {string} and password {string}")
    public void POSTRequestToWithFullnameEmailAndPassword(String arg0, String arg1, String arg2, String arg3) {
        postRegAut.POSTRequestToWithFullnameEmailAndPassword();
    }

    @Then("I receive valid HTTP response code register 200")
    public void ValidHTTPResponseCodeRegister() {
        postRegAut.ValidHTTPResponseCodeRegister();
    }

    @Given("I send POST HTTP request registerr")
    public void sendPostHttpRequestRegisterNeg() {
        postRegAut.sendPostHttpRequestRegisterNeg();
    }

    @Then("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        postRegAut.receiveValidHttp400Register();
    }
}

