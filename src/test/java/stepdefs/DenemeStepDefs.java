package stepdefs;

import io.cucumber.java.en.When;

public class DenemeStepDefs extends BaseSteps{
    @When("user add the product {string} to the cart.")
    public void userAddTheProductToTheCart(String text) {

        //click(addToCart(text));
        addCart(text);
    }
}
