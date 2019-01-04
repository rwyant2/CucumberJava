package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

import common.basePage;

public class html5Page extends basePage {

	private ById html5Link = ""
	
	public void goToHTML5Page() {
		driver.findElement(By.xpath("//a[@href='/html5']")).click();
	}
	
}
