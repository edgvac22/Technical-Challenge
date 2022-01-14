package co.com.choucair.certification.retotecnico.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairTechnicalChallengeStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Edgardo wants to create an account on the page$")
    public void thanEdgardoWantsToCreateAnAccountOnThePage() {

    }

    @When("^he click on the Join Today button$")
    public void heClickOnTheJoinTodayButton() {

    }

    @Then("^he can fill out the form and create the account$")
    public void heCanFillOutTheFormAndCreateTheAccount() {

    }
}
