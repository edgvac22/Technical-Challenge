package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLastStepPage extends PageObject {
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("button that shows us the last step form on register").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
    public static final Target INPUT_PASSWORD = Target.the("where you put your password").located(By.xpath("//input[contains(@id, 'password')]"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where you confirm the password").located(By.xpath("//input[contains(@id, 'confirmPassword')]"));
    public static final Target INPUT_STAY_INFORMED = Target.the("where do I click if I want to stay informed").located(By.name("newsletterOptIn"));
    public static final Target INPUT_TERM_OF_USE = Target.the("where do I click if I want to accept the term of use").located(By.name("termOfUse"));
    public static final Target INPUT_PRIVACY = Target.the("where do I click if I want to accept the privacy and security policy").located(By.name("privacySetting"));
    public static final Target NAME_STEP = Target.the("extract the name of the step title").located(By.xpath("//h1[contains(text(), 'The last step')]"));
}
