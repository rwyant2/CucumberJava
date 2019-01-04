package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*

public class commonStepDef {
	
	html5Page htmlPage = new html5Page();
	indexPage indexPage = new indexPage();
	
	@Given("^user goes to html5 page$")
	public void user_goes_to_html5_page() throws Exception {
		indexPage.goToHTML5Page();
	}
	
	@When("^user enters \"([^\"]*)\" in field where label contains \"([^\"]*)\"$")
	//@When("^user enters {string} in field where label contains {string}$")
	public void user_enters_in_field_where_label_contains(String text, String label) {
	    htmlPage.enterTextInField(text,label);
	    throw new cucumber.api.PendingException();
	}

	
}