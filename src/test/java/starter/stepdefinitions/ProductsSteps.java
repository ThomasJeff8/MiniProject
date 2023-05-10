package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.apitest.Products.*;

public class ProductsSteps {
    @Steps
    GetAllProd getAllProd;
    @Steps
    GetProdID getProdID;
    @Steps
    DeleteProd deleteProd;

    @Steps
    PostNewProd postNewProd;

    @Steps
    GetProdRat getProdRat;
    @Steps
    GetProdCom getProdCom;
    @Steps
    PostAsPro postAsPro;
    @Steps
    PostCreate postCreate;

    @Given("I set GET api endpoints for all products")
    public void setApiEndpointsForAllProducts() {
        getAllProd.setApiEndpointsForAllProducts();
    }
    @When("I send GET HTTP request for all products")
    public void sendGetHttpRequestForAllProducts() {
        getAllProd.sendGetHttpRequestForAllProducts();
    }
    @Then("I receive valid HTTP response code 200 for all products")
    public void validateHttpResponseCode200ForAllProducts() {
        getAllProd.validateHttpResponseCode200ForAllProducts();
    }

    @Given("I set GET api endpoints for products by ID")
    public void setApiEndpointsForProductsByID() {
        getProdID.setApiEndpointsForProductsByID();
    }

    @When("I send GET HTTP request for products by ID")
    public void sendGetHttpRequestForProductsByID() {
        getProdID.sendGetHttpRequestForProductsByID();
    }

    @Then("I receive valid HTTP response code 200 for products by ID")
    public void validateHttpResponseCode200ForProductsByID() { getProdID.validateHttpResponseCode200ForProductsByID();

    }

    @Given("I set DELETE api endpoints for a products")
    public void setDeleteApiEndpointsForAProducts() { deleteProd.setDeleteApiEndpointsForAProducts();
    }

    @When("I send DELETE HTTP request for a products")
    public void sendDeleteHttpRequestForAProducts() { deleteProd.sendDeleteHttpRequestForAProducts();
    }

    @Then("I receive valid HTTP response code 204 for a products")
    public void validateHttpResponse204ForAProducts() { deleteProd.validateHttpResponse204ForAProducts();
    }

    @Given("I set POST endpoints for create new products")
    public void SetPOSTEndpointsForCreateNewProducts() { postNewProd.SetPOSTEndpointsForCreateNewProducts();
    }

    @When("I send POST HTTP request for create new products")
    public void SendPOSTHTTPRequestForCreateNewProducts() { postNewProd.SendPOSTHTTPRequestForCreateNewProducts();

    }

    @Then("I receive a valid HTTP response code 200 in create new products")
    public void ReceiveAValidHTTPResponseCodeInCreateNewProducts() { postNewProd.ReceiveAValidHTTPResponseCodeInCreateNewProducts();

    }

    @Given("I set GET api endpoints for products ratings")
    public void setApiEndpointsForProductsRatings() { getProdRat.setApiEndpointsForProductsRatings();

    }

    @When("I send GET HTTP request for products ratings")
    public void sendGetHttpRequestForProductsRatings() { getProdRat.sendGetHttpRequestForProductsRatings();

    }

    @Then("I receive valid HTTP response code 200 for products ratings")
    public void validateHttpResponseCode200ForProductsRatings() { getProdRat.validateHttpResponseCode200ForProductsRatings();

    }

    @Given("I set GET api endpoints for products comments")
    public void setApiEndpointsForProductsComments() { getProdCom.setApiEndpointsForProductsComments();

    }

    @When("I send GET HTTP request for products comments")
    public void sendGetHttpRequestForProductsComments() { getProdCom.sendGetHttpRequestForProductsComments();


    }

    @Then("I receive valid HTTP response code 200 for products comments")
    public void validateHttpResponseCode200ForProductsComments() { getProdCom.validateHttpResponseCode200ForProductsComments();

    }

    @Given("I set POST api endpoints for assign a product ratings")
    public void setApiEndpointsForAssignProductsRatings() { postAsPro.setApiEndpointsForAssignProductsRatings();
    }

    @When("I send POST HTTP request for assign a product ratings")
    public void sendGetHttpRequestForAssignProductsRatings() { postAsPro.sendGetHttpRequestForAssignProductsRatings();

    }

    @Then("I receive valid HTTP response code 200 for assign a product ratings")
    public void validateHttpResponseCode200ForAssignProductsRatings() { postAsPro.validateHttpResponseCode200ForAssignProductsRatings();

    }


    @Given("I set POST api endpoints for create comment for products")
    public void setApiEndpointsForCreateCommentForProducts() { postCreate.setApiEndpointsForCreateCommentForProducts();

    }

    @When("I send POST HTTP request for create comment for products")
    public void sendGetHttpRequestForCreateCommentForProducts() { postCreate.sendGetHttpRequestForCreateCommentForProducts();


    }

    @Then("I receive valid HTTP response code 200 for create comment for products")
    public void validateHttpResponseCode200ForCreateCommentForProducts() { postCreate.validateHttpResponseCode200ForCreateCommentForProducts();

    }
}
