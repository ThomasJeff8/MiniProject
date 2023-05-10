package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProdID {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for products by ID")
    public String setApiEndpointsForProductsByID() {
        return url + "products";
    }

    @Step("I send GET HTTP request for products by ID")
    public void sendGetHttpRequestForProductsByID() {
        SerenityRest.given().when().get(setApiEndpointsForProductsByID());
    }

    @Step("I receive valid HTTP response code 200 for products by ID")
    public void validateHttpResponseCode200ForProductsByID() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

