package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User launches the browser")
    public void user_launches_the_browser() {
        System.out.println("launching the browser");
    }
    @Given("User enters the url in the browser")
    public void user_enters_the_url_in_the_browser() {
        System.out.println("entering the url");
    }
    @When("User enters the valid search text in the searchbox")
    public void user_enters_the_valid_search_text_in_the_searchbox() {
        System.out.println("Enter something valid in the text box");
    }
    @When("User enters the invalid search text in the searchbox")
    public void user_enters_the_invalid_search_text_in_the_searchbox() {
        System.out.println("Enter something invalid in the text box");
    }
    @When("clicks on the Google search button")
    public void clicks_on_the_google_search_button() {
        System.out.println("Clicking on Google search button");
    }
    @Then("the results should be displayed")
    public void the_results_should_be_displayed() {
        System.out.println("Some results are displayed");
    }

}
