package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {


    private By cartIconField() {
        return By.xpath("//span[contains(text(),'Beli')]/parent::button");

    }
    private By deleteIconField() {
            return By.xpath("(//button[contains(@class, 'v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default')])");

    }

    @Step
    public void openPage() {
        open();

    }

    @Step
    public boolean validateCartIcon() {
        return $(cartIconField()).isDisplayed();

    }
    @Step
    public boolean validateDeleteIcon() {
        return $(deleteIconField()).isDisplayed();

    }
    @Step
    public void clickCartButton() {
        $(cartIconField()).click();

    }
   @Step
   public void clickDeleteButton() {
   $(deleteIconField()).click();

   }

}
