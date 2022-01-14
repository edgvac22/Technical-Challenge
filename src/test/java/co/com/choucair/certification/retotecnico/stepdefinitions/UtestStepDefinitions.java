package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Edgardo wants to create an account on the page$")
    public void thanEdgardoWantsToCreateAnAccountOnThePage() {
        OnStage.theActorCalled("Edgardo").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^he start to complete all the forms$")
    public void heStartToCompleteAllTheForms() {
        OnStage.theActorInTheSpotlight().attemptsTo(NextLocation.onThePage(), NextDevice.onThePage(), NextLastStep.onThePage());
    }

    @Then("^he finish the forms and create the account$")
    public void heFinishTheFormsAndCreateTheAccount() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteSetup.onThePage());
    }
}
