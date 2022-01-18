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
        actor.attemptsTo(Click.on(UtestRegistrationDevicePage.NEXT_DEVICES_BUTTON),
                Click.on(UtestRegistrationDevicePage.INPUT_OS),
                SelectFromOptions.byVisibleText(strOS).from((UtestRegistrationDevicePage.INPUT_OS)),
                Click.on(UtestRegistrationDevicePage.INPUT_VERSION),
                SelectFromOptions.byVisibleText(strVersion).from(UtestRegistrationDevicePage.INPUT_VERSION),
                Click.on(UtestRegistrationDevicePage.INPUT_OS_LANGUAGE),
                SelectFromOptions.byVisibleText(strOSLanguage).from(UtestRegistrationDevicePage.INPUT_OS_LANGUAGE),
                Click.on(UtestRegistrationDevicePage.INPUT_BRAND),
                SelectFromOptions.byVisibleText(strBrand).from(UtestRegistrationDevicePage.INPUT_BRAND),
                Click.on(UtestRegistrationDevicePage.INPUT_MODEL),
                SelectFromOptions.byVisibleText(strModel).from(UtestRegistrationDevicePage.INPUT_MODEL),
                Click.on(UtestRegistrationDevicePage.INPUT_OS_PHONE),
                SelectFromOptions.byVisibleText(strOSPhone).from(UtestRegistrationDevicePage.INPUT_OS_PHONE)
        );

    }
}
