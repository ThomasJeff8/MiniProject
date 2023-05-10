package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProdCom {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for products comments")
    public String setApiEndpointsForProductsComments() {
        return url + "products/2/comments";
    }

    @Step("I send GET HTTP request for products comments")
    public void sendGetHttpRequestForProductsComments() {
        SerenityRest.given().when().get(setApiEndpointsForProductsComments());
    }

    @Step("I receive valid HTTP response code 200 for products comments")
    public void validateHttpResponseCode200ForProductsComments() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

