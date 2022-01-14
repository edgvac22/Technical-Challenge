package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestCompleteSetup extends PageObject {
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("button that finish the process").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
