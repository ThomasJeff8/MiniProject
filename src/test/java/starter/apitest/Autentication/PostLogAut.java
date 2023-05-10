package starter.apitest.Autentication;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLogAut {
    protected String url = "https://altashop-api.fly.dev/api/";


    @Step("I perform POST operational for login")
    public String PerformPOSToperationalforlogin() {
        return url + "auth/login";
    }

    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestForAutenLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adit@gmail.com");
        requestBody.put("password", "adit123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(PerformPOSToperationalforlogin());
    }

    @Step("I receive valid HTTP response code 200 for login")
    public void receiveHttpResponseCode200ForLogin() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
