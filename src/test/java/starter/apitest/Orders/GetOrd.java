package starter.apitest.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOrd {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for orders by ID")
    public String setApiEndpointsForOrdersByID() {
        return url + "orders";
    }

    @Step("I send GET HTTP request for orders by ID")
    public void sendGetHttpRequestForOrdersByID() {
        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI").get(setApiEndpointsForOrdersByID());
    }

    @Step("I receive valid HTTP response code 200 for orders by ID")
    public void validateHttpResponseCode200ForOrdersByID() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

