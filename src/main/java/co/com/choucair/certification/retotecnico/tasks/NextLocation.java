package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestRegistrationLocationPage;
import co.com.choucair.certification.retotecnico.userinterface.UtestRegistrationPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.remote.server.handler.ClickElement;

public class NextLocation implements Task {


    public static Performable onThePage() {
        return Tasks.instrumented(NextLocation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(UtestRegistrationLocationPage.NEXT_LOCATION_BUTTON),
                Enter.theValue("507").into(UtestRegistrationLocationPage.INPUT_ZIP)
        );
    }
}