package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProd {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoints for a products")
    public String setDeleteApiEndpointsForAProducts() {
        return url + "products/2";
    }

    @Step("I send DELETE HTTP request for a products")
    public void sendDeleteHttpRequestForAProducts() {
        SerenityRest.given().delete(setDeleteApiEndpointsForAProducts());
    }

    @Step("I receive valid HTTP response code 204 for a products")
    public void validateHttpResponse204ForAProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }
}