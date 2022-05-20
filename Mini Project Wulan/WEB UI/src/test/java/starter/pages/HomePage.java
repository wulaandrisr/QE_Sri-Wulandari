package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By className() {
        return By.xpath("//div[contains(@class,'v-main__wrap')]");

    }
    @Step
    public void validateOnHomePage() {
        $(className()).isDisplayed();
    }

}
