package starter.apitest.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class PostOrd {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints for create new orders")
    public String SetPOSTEndpointsForCreateNewOrders(){
        return url + "orders";}

    @Step("I send POST HTTP request for create new orders")
    public void SendPOSTHTTPRequestForCreateNewOrders(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id","2");
        requestBody.put("quantity","1");
        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI").get(SetPOSTEndpointsForCreateNewOrders());
    }
    @Step("I receive a valid HTTP response code 200 in create new orders")
    public void ReceiveAValidHTTPResponseCodeInCreateNewOrders(){    restAssuredThat(response -> response.statusCode(200));}

}