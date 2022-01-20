package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistrationDevicePage extends PageObject {
    public static final Target INPUT_OS_FIRST = Target.the("where I can click on OS").located(By.xpath("//div[@name = 'osId']//div[@placeholder = 'Select OS']"));
    public static final Target INPUT_OS = Target.the("where I can select the OS").located(By.xpath("//div[@name = 'osId']//input"));
    public static final Target INPUT_VERSION_FIRST = Target.the("where I can click on version").located(By.xpath("//div[@placeholder = 'Select a Version']"));
    public static final Target INPUT_VERSION = Target.the("where I can select the version").located(By.xpath("//input[@placeholder = 'Select a Version']"));
    public static final Target INPUT_OS_LANGUAGE_FIRST = Target.the("where I can click on OS language").located(By.xpath("//div[@placeholder = 'Select OS language']"));
    public static final Target INPUT_OS_LANGUAGE = Target.the("where I can select the OS language").located(By.xpath("//input[@placeholder = 'Select OS language']"));
    public static final Target INPUT_BRAND_FIRST = Target.the("where I can click on brand").located(By.xpath("//div[@placeholder = 'Select Brand']"));
    public static final Target INPUT_BRAND = Target.the("where I can select the brand").located(By.xpath("//input[@placeholder = 'Select Brand']"));
    public static final Target INPUT_MODEL_FIRST = Target.the("where I can click on model").located(By.xpath("//div[@placeholder = 'Select a Model']"));
    public static final Target INPUT_MODEL = Target.the("where I can select the model for my phone").located(By.xpath("//input[@placeholder = 'Select a Model']"));
    public static final Target INPUT_OS_PHONE_FIRST = Target.the("where I can click on OS for my phone").located(By.xpath("//div[@name = 'handsetOSId']//div[@placeholder = 'Select OS']"));
    public static final Target INPUT_OS_PHONE = Target.the("where I can select the OS for my phone").located(By.xpath("//div[@name = 'handsetOSId']//input"));
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("button that shows us the last step form on register").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
