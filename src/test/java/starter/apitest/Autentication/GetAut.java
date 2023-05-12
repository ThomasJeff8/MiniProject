package starter.apitest.Autentication;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAut {
    protected String url = "https://altashop-api.fly.dev/api/";
    protected String token;

    public GetAut() {
    }

    public GetAut(String token) {
        this.token = token;
    }

    @Step("I set GET api endpoints for autentication")
    public String setApiEndpointsForAuten() {
        return url + "auth/info";
    }

    @Step("I send GET HTTP request for autentication")
    public void sendGetHttpRequestForAuten() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI")
                .get(setApiEndpointsForAuten())
                .then()
                .statusCode(200);

    }

    @Step("I receive valid HTTP response code 200 for autentication")
    public void validateHttpResponseCode200ForAuten() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
