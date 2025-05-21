package StepDefinitions;

import Pages.AmazonPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AmazonStep {
    @Given("User is on homepage")
    public void userIsOnHomepage() { AmazonPages.onHomePage();
    }

    @When("accept cookies")
    public void acceptCookies() {
        AmazonPages.accCookies();
    }

    @When("Click the search area")
    public void clickTheSearchArea() {

        AmazonPages.clickSearchArea();
    }

    @When("Write product name")
    public void writeProductName() {

        AmazonPages.writeProduct();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {

        AmazonPages.clickSearchButton();
    }

    @When("Filter for shipped Amazon")
    public void fillterForShippedAmazon() {

        AmazonPages.filterAmazon();
    }

    @When("Click the First product")
    public void clickTheFirstProduct() {

        AmazonPages.clickFirstProduct();
    }

    @When("Add to cart")
    public void addToCart() {

        AmazonPages.addProduct();
    }

    @When("Check at cart page")
    public void checkAtCartPage() {
        AmazonPages.checkPage();

    }


}
