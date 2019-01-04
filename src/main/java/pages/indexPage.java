package pages;

import common.basePage;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class indexPage extends basePage {
	
	private By html5Link = By.xpath("//a[@href='/html5']");
	private By indexHeader = By.xpath("//*[contains(.,'This is the index page! Hooray!')]");
	
	public indexPage() { 
		System.out.println("indexpage constructor");
	}
	
	@Before
	public void before (Scenario scenario) {
		System.out.println("before annotation");
		driverSetup(scenario);
	}
	
	// TODO: "Home" will need further refinement once I get the grid set up.		
	private void whyDontYouJustGoHOMEThatsYourHOMEAreYouTooGoodForYourHOMEANSWERME() {
		driver.get(landingPageURL);
		waitUntil(indexHeader);
	}
	
	public void goToHTML5Page() {
		System.out.println("go to home page");
		whyDontYouJustGoHOMEThatsYourHOMEAreYouTooGoodForYourHOMEANSWERME();
		click(html5Link);
	}

}
