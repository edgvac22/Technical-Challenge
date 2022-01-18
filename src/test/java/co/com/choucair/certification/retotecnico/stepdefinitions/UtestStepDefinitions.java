package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.UtestData;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Edgardo wants to create an account on the page$")
    public void thanEdgardoWantsToCreateAnAccountOnThePage(List<UtestData> utestData) {
        OnStage.theActorCalled("Edgardo").wasAbleTo(OpenUp.thePage(),
                JoinToday.onThePage(utestData.get(0).getStrFirstName(), utestData.get(0).getStrLastName(),
                        utestData.get(0).getStrEmailAddress(), utestData.get(0).getStrMonthOfBirth(),
                        utestData.get(0).getStrDayOfBirth(), utestData.get(0).getYearOfBirth()));
    }

    @When("^he start to complete the forms$")
    public void heStartToCompleteTheForms(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NextLocation.onThePage(utestData.get(0).getStrCity(), utestData.get(0).getStrZip()),
                NextDevice.onThePage(utestData.get(0).getStrOS(), utestData.get(0).getStrVersion(),
                        utestData.get(0).getStrOSLanguage(), utestData.get(0).getStrBrand(),
                        utestData.get(0).getStrModel(), utestData.get(0).getStrOSPhone()),
                NextLastStep.onThePage(utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirmPassword()),
                CompleteSetup.onThePage());
    }

    @Then("^he create the account$")
    public void heCreateTheAccount(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrNameStep())));
    }
}
