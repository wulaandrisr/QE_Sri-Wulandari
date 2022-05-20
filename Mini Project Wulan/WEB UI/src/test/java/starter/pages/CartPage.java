package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    private By cartButtonField() {
        return By.xpath("(//button[contains(@class, 'v-btn v-btn--icon v-btn--round theme--dark v-size--default')])[1]");


    }
    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateCartButton() {
        return $(cartButtonField()).isDisplayed();


    }
    @Step
    public void clickCartButton() {
        $(cartButtonField()).click();

    }

}



