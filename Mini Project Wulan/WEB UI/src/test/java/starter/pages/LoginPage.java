package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By emailField() {
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");

    }
    private By passwordField() {
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");

    }
    private By loginButton() {
        return By.xpath("//span[contains(text(),'Login')]/parent::button");

    }
    public By loginIcon() {
        return By.xpath("(//button[contains(@class, 'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[2]");

    }
    private By errorMessage() {
        return By.className("v-alert__content");

    }
    @Step
    public void openPage() {
        open();
    }
    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();

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
    public void clickLoginButton() {
        $(loginButton()).click();


    }
    @Step
    public boolean validateErrorMessage() {
        return $(errorMessage()).isDisplayed();

    }
    @Step
    public boolean validateEqualsErrorMessage(String message) {
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

    @Step
    public void clickLoginIcon() {
        $(loginIcon()).click();

    }

}
