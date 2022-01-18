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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NextLocation implements Task {

    private String strCity;
    private String strZip;

    public NextLocation(String strCity, String strZip) {
        this.strCity = strCity;
        this.strZip = strZip;
    }

    public static NextLocation onThePage(String strCity, String strZip) {
        return Tasks.instrumented(NextLocation.class, strCity, strZip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegistrationLocationPage.NEXT_LOCATION_BUTTON),
                Enter.theValue(strCity).into(UtestRegistrationLocationPage.INPUT_CITY),
                Enter.theValue(strZip).into(UtestRegistrationLocationPage.INPUT_ZIP)
        );
    }
}