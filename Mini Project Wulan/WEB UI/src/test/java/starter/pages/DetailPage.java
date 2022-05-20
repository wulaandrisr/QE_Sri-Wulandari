package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {

    private By detailButtonField() {
        return By.xpath("//span[contains(text(),'Detail')]/parent::button");


    }
    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateDetailButton() {
        return $(detailButtonField()).isDisplayed();


    }
    @Step
    public void clickDetailButton() {
        $(detailButtonField()).click();

    }

}



