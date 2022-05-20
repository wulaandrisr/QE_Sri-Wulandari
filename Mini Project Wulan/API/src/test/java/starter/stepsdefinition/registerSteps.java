package starter.stepsdefinition;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.register.registerPost;

public class registerSteps {
    @Steps
    registerPost post;

    @And("I receive error message for register")
    public void receiveErrorMessageForRegister() {
        post.receiveErrorMessageForRegister();

    }
}