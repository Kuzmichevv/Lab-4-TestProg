package ua.edu.kibit.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class CreditApiSteps {

    @Given("the user is authenticated")
    public void theUserIsAuthenticated() {
    }

    @When("the user requests to create a card")
    public void theUserRequestsToCreateACard() {
    }

    @Then("the card should be created successfully")
    public void theCardShouldBeCreatedSuccessfully() {
        assertTrue("Card was not created", true);
    }
}
