package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistrationDevicePage extends PageObject {
    public static final Target NEXT_DEVICES_BUTTON = Target.the("button that shows us the devices form on register").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
    public static final Target INPUT_OS = Target.the("where I can select the OS").located(By.xpath("//div[@placeholder = 'Select OS']"));
    public static final Target INPUT_VERSION = Target.the("where I can select the version").located(By.xpath("//select[@placeholder = 'Select a Version']"));
    public static final Target INPUT_OS_LANGUAGE = Target.the("where I can select the OS language").located(By.xpath("//select[@placeholder = 'Select OS language']"));
    public static final Target INPUT_BRAND = Target.the("where I can select the brand").located(By.xpath("//select[@placeholder = 'Select Brand']"));
    public static final Target INPUT_MODEL = Target.the("where I can select the model for my phone").located(By.xpath("//select[@placeholder = 'Select a Model']"));
    public static final Target INPUT_OS_PHONE = Target.the("where I can select the OS for my phone").located(By.xpath("//select[@placeholder = 'Select OS']"));
}
