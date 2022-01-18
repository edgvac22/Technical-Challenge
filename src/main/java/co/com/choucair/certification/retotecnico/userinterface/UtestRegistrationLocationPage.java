package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistrationLocationPage extends PageObject{
    public static final Target NEXT_LOCATION_BUTTON = Target.the("button that shows us the location form on register").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
    public static final Target INPUT_CITY = Target.the("where do we write the city").located(By.xpath("//input[contains(@id, 'city')]"));
    public static final Target INPUT_ZIP = Target.the("where do we write the zip code").located(By.xpath("//input[contains(@id, 'zip')]"));
}
