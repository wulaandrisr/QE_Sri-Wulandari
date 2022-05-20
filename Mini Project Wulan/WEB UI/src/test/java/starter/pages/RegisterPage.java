package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By usernameField() {
        return By.xpath("//label[contains(text(),'Nama Lengkap')]/following-sibling::input");

    }
    private By emailField() {
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");

    }
    private By passwordField() {
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");

    }
    public By registerButton() {
        return By.xpath("//span[contains(text(),'Register')]/parent::button");
    }
    public By loginIcon() {
        return By.xpath("(//button[contains(@class, 'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[2]");

    }
    public By registerIcon() {
        return By.xpath("//a[contains(text(), 'Register')]");

    }
    private By errorNotification() {
        return By.className("v-alert__content");

    }


    @Step
    public void openPage() {
        open();
    }
    @Step
    public boolean validateOnRegisterPage() {
        return $(registerButton()).isDisplayed();

    }
    @Step
    public void inputUserName(String name){
        $(usernameField()).type(name);

    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);

    }
    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);

    }
    @Step
    public void clickRegisterButton() {
        $(registerButton()).click();

    }
    @Step
    public boolean validateErrorNotification () {
        return $(errorNotification()).isDisplayed();

    }
    @Step
    public boolean validateEqualsErrorNotification (String notification) {
        return $(errorNotification()).getText().equalsIgnoreCase(notification);
    }

    @Step
    public void clickLoginIcon() {
        $(loginIcon()).click();

    }
    @Step
    public void clickRegisterIcon() {
        $(registerIcon()).click();

    }
}
