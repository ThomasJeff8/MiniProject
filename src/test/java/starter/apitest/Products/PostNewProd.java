package starter.apitest.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostNewProd {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints for create new products")
    public String SetPOSTEndpointsForCreateNewProducts(){
        return url + "products";}

    @Step("I send POST HTTP request for create new products")
    public void SendPOSTHTTPRequestForCreateNewProducts(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","XBOX1");
        requestBody.put("price",499);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(SetPOSTEndpointsForCreateNewProducts());
    }
    @Step("I receive a valid HTTP response code 200 in create new products")
    public void ReceiveAValidHTTPResponseCodeInCreateNewProducts(){    restAssuredThat(response -> response.statusCode(200));}


}