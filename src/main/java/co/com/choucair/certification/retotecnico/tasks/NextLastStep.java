package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class NextLastStep implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public NextLastStep(String strPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strPassword;
    }

    public static NextLastStep onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(NextLastStep.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestLastStepPage.NEXT_LAST_STEP_BUTTON),
                Enter.theValue(strPassword).into(UtestLastStepPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestLastStepPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestLastStepPage.INPUT_STAY_INFORMED),
                Click.on(UtestLastStepPage.INPUT_TERM_OF_USE),
                Click.on(UtestLastStepPage.INPUT_PRIVACY)
        );
    }
}
