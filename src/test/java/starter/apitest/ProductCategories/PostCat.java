package starter.apitest.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class PostCat {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints for create a categories")
    public String SetPOSTEndpointsForCreateACategories(){
        return url + "categories";}

    @Step("I send POST HTTP request for create categories")
    public void SendPOSTHTTPRequestForCreateACategories(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","gaming");
        requestBody.put("description","for gaming purposes");
        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(SetPOSTEndpointsForCreateACategories());
    }
    @Step("I receive a valid HTTP response code 200 in create a categories")
    public void ReceiveAValidHTTPResponseCodeInCreateACategories(){    restAssuredThat(response -> response.statusCode(200));}

    @Step("I receive valid data for a categories")
    public void ReceiveValidDataForCreateACategories() {
        restAssuredThat(response -> response.statusCode(200));
    }
}