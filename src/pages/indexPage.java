package pages;

import common.basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class indexPage extends basePage {
	
	private By html5Link = By.xpath("//a[@href='/html5']");
	private By indexHeader = By.xpath("//*[contains(.,'This is the index page! Hooray!')]");
						
	// TODO: "Home" will need further refinement once I get the grid set up.		
	private void whyDontYouJustGoHOMEThatsYourHOMEAreYouTooGoodForYourHOMEANSWERME() {
		driver.get(landingPageURL);
		waitUntil(indexHeader);
	}
	
	private void goToHTML5Page() {
		whyDontYouJustGoHOMEThatsYourHOMEAreYouTooGoodForYourHOMEANSWERME();
		click(html5Link);
	}

}
