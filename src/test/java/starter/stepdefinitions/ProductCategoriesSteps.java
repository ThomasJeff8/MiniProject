package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.apitest.ProductCategories.DeleteCat;
import starter.apitest.ProductCategories.GetAllCat;
import starter.apitest.ProductCategories.GetCatID;
import starter.apitest.ProductCategories.PostCat;

public class ProductCategoriesSteps {
    @Steps
    GetAllCat getAllCat;
    @Steps
    GetCatID getCatID;

    @Steps
    PostCat postCat;
    @Steps
    DeleteCat deleteCat;

    @Given("I set GET api endpoints for all categories")
    public void setApiEndpointsForAllCategories() { getAllCat.setApiEndpointsForAllCategories();

    }

    @When("I send GET HTTP request for all categories")
    public void sendGetHttpRequestForAllCategories() { getAllCat.sendGetHttpRequestForAllCategories();

    }

    @Then("I receive valid HTTP response code 200 for all categories")
    public void validateHttpResponseCode200ForAllCategories() { getAllCat.validateHttpResponseCode200ForAllCategories();

    }


    @Given("I set GET api endpoints for categories by ID")
    public void setApiEndpointsForCategoriesByID() { getCatID.setApiEndpointsForCategoriesByID();

    }

    @When("I send GET HTTP request for categories by ID")
    public void sendGetHttpRequestForCategoriesByID() { getCatID.sendGetHttpRequestForCategoriesByID();

    }

    @Then("I receive valid HTTP response code 200 for categories by ID")
    public void validateHttpResponseCode200ForCategoriesByID() { getCatID.validateHttpResponseCode200ForCategoriesByID();

    }

    @Given("I send POST HTTP request for create categories")
    public void SendPOSTHTTPRequestForCreateACategories() { postCat.SendPOSTHTTPRequestForCreateACategories();

    }

    @When("I receive a valid HTTP response code 200 in create a categories")
    public void ReceiveAValidHTTPResponseCodeInCreateACategories() { postCat.ReceiveAValidHTTPResponseCodeInCreateACategories();

    }

    @Then("I receive valid data for a categories")
    public void ReceiveValidDataForCreateACategories() { postCat.ReceiveValidDataForCreateACategories();

    }

    @Given("I set DELETE api endpoints for a categories")
    public void setDeleteApiEndpointsForACategories() { deleteCat.setDeleteApiEndpointsForACategories();


    }

    @When("I send DELETE HTTP request for a categories")
    public void sendDeleteHttpRequestForACategories() { deleteCat.sendDeleteHttpRequestForACategories();

    }

    @Then("I receive valid HTTP response code 204 for a categories")
    public void validateHttpResponse204ForACategories() { deleteCat.validateHttpResponse204ForACategories();
    }
}
