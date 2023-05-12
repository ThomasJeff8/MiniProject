package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostAsPro {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST api endpoints for assign a product ratings")
    public String setApiEndpointsForAssignProductsRatings() {
        return url + "products/85118/ratings";
    }

    @Step("I send POST HTTP request for assign a product ratings")
    public void sendGetHttpRequestForAssignProductsRatings() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count",5);
        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI")
                .body(requestBody.toJSONString())
                .post(setApiEndpointsForAssignProductsRatings());
    }

    @Step("I receive valid HTTP response code 200 for assign a product ratings")
    public void validateHttpResponseCode200ForAssignProductsRatings() {
        restAssuredThat(response -> response.statusCode(200));
    }
}