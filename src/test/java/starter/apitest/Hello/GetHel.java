package starter.apitest.Hello;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetHel {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for index")
    public String setApiEndpointsForIndex() {
        return url + "hello";
    }

    @Step("I send GET HTTP request for index")
    public void sendGetHttpRequestForIndex() {
        SerenityRest.given().get(setApiEndpointsForIndex());
    }

    @Step("I receive valid HTTP response code 200 for index")
    public void validateHttpResponseCode200ForIndex() {
        restAssuredThat(response -> response.statusCode(200));
    }
}