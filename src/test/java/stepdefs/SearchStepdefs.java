package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static stepdefs.Locator.*;

public class SearchStepdefs extends BaseSteps{

    @Given("user navigate to homepage")
    public void userNavigateToHomepage() {
        driver.get(url);
    }


    @Then("homepage should be opened")
    public void homepageShouldBeOpened() {
    }


    @When("user search for {string}")
    public void userSearchFor(String searchText) throws InterruptedException {
        getInput("Search products…").sendKeys(searchText);
        new Actions(driver).keyDown(Keys.ENTER).perform();
        Thread.sleep(2000);

    }

    @Then("there must be {int} listed product")
    public void thereMustBeProductNumberListedProduct(int productNumber) {
        Assert.assertEquals(getElement(lProductNames).getSize(),productNumber);
    }


}