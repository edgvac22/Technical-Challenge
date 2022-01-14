package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestRegistrationPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinToday implements Task {

    public static Performable onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegistrationPersonalPage.JOIN_TODAY_BUTTON),
                Enter.theValue("PutYourFirstName").into(UtestRegistrationPersonalPage.INPUT_FIRST_NAME),
                Enter.theValue("PutYourLastName").into(UtestRegistrationPersonalPage.INPUT_LAST_NAME),
                Enter.theValue("PutYourEmailAddress").into(UtestRegistrationPersonalPage.INPUT_EMAIL_ADDRESS),
                Enter.theValue("PutYourMonthOfBirth").into(UtestRegistrationPersonalPage.INPUT_MONTH_OF_BIRTH),
                Enter.theValue("PutYourDayOfBirth").into(UtestRegistrationPersonalPage.INPUT_DAY_OF_BIRTH),
                Enter.theValue("PutYourYearOfBirth").into(UtestRegistrationPersonalPage.INPUT_YEAR_OF_BIRTH),
                Enter.theValue("PutYourLanguagesThatYouKnow").into(UtestRegistrationPersonalPage.INPUT_LANGUAGES),
                Click.on(UtestRegistrationPersonalPage.NEXT_LOCATION_BUTTON)
        );
    }
}
