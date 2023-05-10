package starter.apitest.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCatID {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints for categories by ID")
    public String setApiEndpointsForCategoriesByID() {
        return url + "categories";
    }

    @Step("I send GET HTTP request for categories by ID")
    public void sendGetHttpRequestForCategoriesByID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Gaming");
        requestBody.put("description", "For gaming purposes");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiEndpointsForCategoriesByID());
    }

    @Step("I receive valid HTTP response code 200 for categories by ID")
    public void validateHttpResponseCode200ForCategoriesByID() {
        restAssuredThat(response -> response.statusCode(200));
    }
}