package starter.apitest.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Getallord {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpoints for all orders")
    public String setApiEndpointsForAllOrders() {
        return url + "orders";
    }

    @Step("I send GET HTTP request for all orders")
    public void sendGetHttpRequestForAllOrders() {
        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").get(setApiEndpointsForAllOrders());
    }

    @Step("I receive valid HTTP response code 200 for all orders")
    public void validateHttpResponseCode200ForAllOrders() {
        restAssuredThat(response -> response.statusCode(200));
    }
}