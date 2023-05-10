package starter.apitest.Autentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostRegAut {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";
    @Step("I register using the correct data")
    public String RegisterUsingTheCorrectData(){
        return url + "register";
    }
    @Step("I submit a POST request to {string} with fullname Fullname Lastname, email 2someone@mail.com and password 123123")
    public void POSTRequestToWithFullnameEmailAndPassword(){
        JSONObject requestBody = new JSONObject();
        String alphabet = "abcdfgh";
        String s = RandomStringUtils.random(10, alphabet);

        requestBody.put("fullname", s);
        requestBody.put("email", s);
        requestBody.put("password", s);
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(RegisterUsingTheCorrectData());}
    @Step("I receive valid HTTP response code register 200 for register")
    public void ValidHTTPResponseCodeRegister(){
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I send POST HTTP request registerr")
    public void sendPostHttpRequestRegisterNeg() {
        JSONObject requestBody = new JSONObject();
        String alphabet = "abcdfgh";
        String z = RandomStringUtils.random(10, alphabet);

        requestBody.put("fullname", "");
        requestBody.put("email", z);
        requestBody.put("password", z);
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(RegisterUsingTheCorrectData());}

    @Step("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        restAssuredThat(response -> response.statusCode(400));
    }

}
