package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProdRat {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for products ratings")
    public String setApiEndpointsForProductsRatings() {
        return url + "products/2/ratings";
    }

    @Step("I send GET HTTP request for products ratings")
    public void sendGetHttpRequestForProductsRatings() {
        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").when().get(setApiEndpointsForProductsRatings());
    }

    @Step("I receive valid HTTP response code 200 for products ratings")
    public void validateHttpResponseCode200ForProductsRatings() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

