package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProd {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for all products")
    public String setApiEndpointsForAllProducts() {
        return url + "products";
    }

    @Step("I send GET HTTP request for all products")
    public void sendGetHttpRequestForAllProducts() {
        SerenityRest.given().when().get(setApiEndpointsForAllProducts());
    }

    @Step("I receive valid HTTP response code 200 for all products")
    public void validateHttpResponseCode200ForAllProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }
}