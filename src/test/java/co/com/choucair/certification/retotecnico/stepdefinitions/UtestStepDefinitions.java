package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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

    @When("^he start to complete the forms$")
    public void heStartToCompleteTheForms() {
        OnStage.theActorInTheSpotlight().attemptsTo(NextLocation.onThePage(), NextDevice.onThePage(), NextLastStep.onThePage(), CompleteSetup.onThePage());
    }

    @Then("^he create the account$")
    public void heCreateTheAccount(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
