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

public class JoinToday implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strMonthOfBirth;
    private String strDayOfBirth;
    private String strYearOfBirth;

    public JoinToday(String strFirstName, String strLastName, String strEmailAddress, String strMonthOfBirth, String strDayOfBirth, String yearOfBirth) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strMonthOfBirth = strMonthOfBirth;
        this.strDayOfBirth = strDayOfBirth;
        this.strYearOfBirth = yearOfBirth;
    }

    public static JoinToday onThePage(String strFirstName, String strLastName, String strEmailAddress, String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth) {
        return Tasks.instrumented(JoinToday.class, strFirstName, strLastName, strEmailAddress, strMonthOfBirth, strDayOfBirth, strYearOfBirth);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestRegistrationPersonalPage.JOIN_TODAY_BUTTON),
                Enter.theValue(strFirstName).into(UtestRegistrationPersonalPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegistrationPersonalPage.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddress).into(UtestRegistrationPersonalPage.INPUT_EMAIL_ADDRESS),
                Click.on(UtestRegistrationPersonalPage.INPUT_MONTH_OF_BIRTH),
                SelectFromOptions.byVisibleText(strMonthOfBirth).from(UtestRegistrationPersonalPage.INPUT_MONTH_OF_BIRTH),
                Click.on(UtestRegistrationPersonalPage.INPUT_DAY_OF_BIRTH),
                SelectFromOptions.byVisibleText(strDayOfBirth).from(UtestRegistrationPersonalPage.INPUT_DAY_OF_BIRTH),
                Click.on(UtestRegistrationPersonalPage.INPUT_YEAR_OF_BIRTH),
                SelectFromOptions.byVisibleText(strYearOfBirth).from(UtestRegistrationPersonalPage.INPUT_YEAR_OF_BIRTH),
                Click.on(UtestRegistrationPersonalPage.NEXT_LOCATION_BUTTON)
        );
    }
}
