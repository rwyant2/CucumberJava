package stepdefs;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;

public class commonStepDef {
	
	html5Page htmlPage = new html5Page();
	indexPage indexPage = new indexPage();
//	protected static WebDriver driver;
//	protected static WebDriverWait wait;
//	protected static String landingPageURL;	
	
//	@Before
//	public void before(Scenario scenario) {
//		System.out.println("before annotation");
//		String absPath = new File("").getAbsolutePath();		
//		System.setProperty("webdriver.chrome.driver", absPath + "//webdrivers//chromedriver");
//		wait = new WebDriverWait(driver, 10);
//		driver = new ChromeDriver();
//		landingPageURL = "localhost:8080";
//	}
	
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