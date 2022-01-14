package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestRegistrationPersonalPage;
import com.sun.codemodel.util.UnicodeEscapeWriter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import static afu.org.checkerframework.checker.units.UnitsTools.s;

public class JoinToday implements Task {

    public static Performable onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Select dropDownSelect;
        actor.attemptsTo(Click.on(UtestRegistrationPersonalPage.JOIN_TODAY_BUTTON),
                Enter.theValue("Edgardo").into(UtestRegistrationPersonalPage.INPUT_FIRST_NAME),
                Enter.theValue("Vaca").into(UtestRegistrationPersonalPage.INPUT_LAST_NAME),
                Enter.theValue("edgardovac2298@gmail.com").into(UtestRegistrationPersonalPage.INPUT_EMAIL_ADDRESS),
                Click.on(UtestRegistrationPersonalPage.INPUT_MONTH_OF_BIRTH),
                SelectFromOptions.byVisibleText("June").from(UtestRegistrationPersonalPage.INPUT_MONTH_OF_BIRTH),

                Click.on(UtestRegistrationPersonalPage.INPUT_DAY_OF_BIRTH),
                SelectFromOptions.byVisibleText("22").from(UtestRegistrationPersonalPage.INPUT_DAY_OF_BIRTH),
                Click.on(UtestRegistrationPersonalPage.INPUT_YEAR_OF_BIRTH),
                SelectFromOptions.byVisibleText("1998").from(UtestRegistrationPersonalPage.INPUT_YEAR_OF_BIRTH),
                Click.on(UtestRegistrationPersonalPage.NEXT_LOCATION_BUTTON)
        );
    }
}
