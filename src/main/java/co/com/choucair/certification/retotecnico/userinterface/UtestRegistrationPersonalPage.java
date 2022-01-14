package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistrationPersonalPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the first form to register").located(By.xpath("//a[contains(text(), 'Join Today')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where do we write the email address").located(By.id("email"));
    public static final Target INPUT_MONTH_OF_BIRTH = Target.the("where do we put the month of birth").located(By.name("birthMonth"));
    public static final Target INPUT_DAY_OF_BIRTH = Target.the("where do we put the day of birth").located(By.name("birthDay"));
    public static final Target INPUT_YEAR_OF_BIRTH = Target.the("where do we put the year of birth").located(By.name("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("where do we put the languages that I know").located(By.id("languages"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("button to confirm login").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
