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
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class NextDevice implements Task {

    private String strOS;
    private String strVersion;
    private String strOSLanguage;
    private String strBrand;
    private String strModel;
    private String strOSPhone;

    public NextDevice(String strOS, String strVersion, String strOSLanguage, String strBrand, String strModel, String strOSPhone) {
        this.strOS = strOS;
        this.strVersion = strVersion;
        this.strOSLanguage = strOSLanguage;
        this.strBrand = strBrand;
        this.strModel = strModel;
        this.strOSPhone = strOSPhone;
    }

    public static NextDevice onThePage(String strOS, String strVersion, String strOSLanguage, String strBrand, String strModel, String strOSPhone) {
        return Tasks.instrumented(NextDevice.class, strOS, strVersion, strOSLanguage, strBrand, strModel, strOSPhone);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestRegistrationDevicePage.INPUT_OS_FIRST),
                Enter.theValue(strOS).into(UtestRegistrationDevicePage.INPUT_OS),
                Hit.the(Keys.ENTER).into(UtestRegistrationDevicePage.INPUT_OS),
                Click.on(UtestRegistrationDevicePage.INPUT_VERSION_FIRST),
                Enter.theValue(strVersion).into(UtestRegistrationDevicePage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(UtestRegistrationDevicePage.INPUT_VERSION),
                Click.on(UtestRegistrationDevicePage.INPUT_OS_LANGUAGE_FIRST),
                Enter.theValue(strOSLanguage).into(UtestRegistrationDevicePage.INPUT_OS_LANGUAGE),
                Hit.the(Keys.ENTER).into(UtestRegistrationDevicePage.INPUT_OS_LANGUAGE),
                Click.on(UtestRegistrationDevicePage.INPUT_BRAND_FIRST),
                Enter.theValue(strBrand).into(UtestRegistrationDevicePage.INPUT_BRAND),
                Hit.the(Keys.ENTER).into(UtestRegistrationDevicePage.INPUT_BRAND),
                Click.on(UtestRegistrationDevicePage.INPUT_MODEL_FIRST),
                Enter.theValue(strModel).into(UtestRegistrationDevicePage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(UtestRegistrationDevicePage.INPUT_MODEL),
                Click.on(UtestRegistrationDevicePage.INPUT_OS_PHONE_FIRST),
                Enter.theValue(strOSPhone).into(UtestRegistrationDevicePage.INPUT_OS_PHONE),
                Hit.the(Keys.ENTER).into(UtestRegistrationDevicePage.INPUT_OS_PHONE),
                Click.on(UtestRegistrationDevicePage.NEXT_LAST_STEP_BUTTON)
        );
    }
}
