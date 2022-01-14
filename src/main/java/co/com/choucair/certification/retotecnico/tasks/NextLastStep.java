package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class NextLastStep implements Task {

    public static Performable onThePage() {
        return Tasks.instrumented(NextLastStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestLastStepPage.NEXT_LAST_STEP_BUTTON),
                Enter.theValue("ThisIsMyPassword123*").into(UtestLastStepPage.INPUT_PASSWORD),
                Enter.theValue("ThisIsMyPassword123*").into(UtestLastStepPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestLastStepPage.INPUT_STAY_INFORMED),
                Click.on(UtestLastStepPage.INPUT_TERM_OF_USE),
                Click.on(UtestLastStepPage.INPUT_PRIVACY)
        );
    }
}
