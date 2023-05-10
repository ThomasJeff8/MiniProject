package starter.apitest.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCat {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for all categories")
    public String setApiEndpointsForAllCategories() {
        return url + "categories";
    }

    @Step("I send GET HTTP request for all categories")
    public void sendGetHttpRequestForAllCategories() {
        SerenityRest.given().get(setApiEndpointsForAllCategories());
    }

    @Step("I receive valid HTTP response code 200 for all categories")
    public void validateHttpResponseCode200ForAllCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }
}