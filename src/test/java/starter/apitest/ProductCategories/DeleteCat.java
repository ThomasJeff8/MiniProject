package starter.apitest.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCat {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoints for a categories")
    public String setDeleteApiEndpointsForACategories() {
        return url + "products/2";
    }

    @Step("I send DELETE HTTP request for a categories")
    public void sendDeleteHttpRequestForACategories() {
        SerenityRest.given().delete(setDeleteApiEndpointsForACategories());
    }

    @Step("I receive valid HTTP response code 204 for a categories")
    public void validateHttpResponse204ForACategories() {
        restAssuredThat(response -> response.statusCode(200));
    }
}