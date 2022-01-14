package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestRegistrationDevicePage;
import co.com.choucair.certification.retotecnico.userinterface.UtestRegistrationLocationPage;
import co.com.choucair.certification.retotecnico.userinterface.UtestRegistrationPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class NextDevice implements Task {


    public static Performable onThePage() {
        return Tasks.instrumented(NextDevice.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(UtestRegistrationDevicePage.NEXT_DEVICES_BUTTON)
                //SelectFromOptions.byVisibleText("macOS").from(UtestRegistrationDevicePage.INPUT_OS)
        );
    }
}
