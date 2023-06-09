package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreate {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST api endpoints for create comment for products")
    public String setApiEndpointsForCreateCommentForProducts() {
        return url + "products/2/comments";
    }

    @Step("I send POST HTTP request for create comment for products")
    public void sendGetHttpRequestForCreateCommentForProducts() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content","the games are great including Gran Turismo 7 but sadly GT4 is much better");
        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI").header("Content-Type","application/json").body(requestBody.toJSONString()).post(setApiEndpointsForCreateCommentForProducts());
    }

    @Step("I receive valid HTTP response code 200 for create comment for products")
    public void validateHttpResponseCode200ForCreateCommentForProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }
}