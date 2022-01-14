package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.tasks.JoinToday;
import co.com.choucair.certification.retotecnico.tasks.NextDevice;
import co.com.choucair.certification.retotecnico.tasks.NextLocation;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
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

    @When("^he click on the Join Today button$")
    public void heClickOnTheJoinTodayButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(NextLocation.onThePage(), NextDevice.onThePage());
    }

    @Then("^he need to fill out all the forms until the last step and create the account$")
    public void heNeedToFillOutAllTheFormsUntilTheLastStepAndCreateTheAccount() {

    }
}
