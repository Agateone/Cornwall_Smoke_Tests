package Elements;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account_Page {
	
	WebDriver Account_driver;
	By Account_page_profile_preferences_link = By.linkText("Profile & Preferences");
	By Country = By.id("country");
	
	public Account_Page(WebDriver Account_driver2) {				//constructor
		this.Account_driver= Account_driver2;
	}
	public void Click_on_profile() {
	
		//Thread.sleep(6000);
				ArrayList<String> tabs2 = new ArrayList<String> (Account_driver.getWindowHandles());
				Account_driver.switchTo().window(tabs2.get(1));		
				WebDriverWait wait = new WebDriverWait(Account_driver, 20);					
				WebElement Profile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Profile & Preferences")));
				Profile.click();
	}

	
	public void Click_on_personal_information()
	{
		
		WebDriverWait wait = new WebDriverWait(Account_driver, 20);	
		//Select country = new Select(Account_driver.findElement(Account_page_profile_preferences_link));
		//country.selectByVisibleText("Personal Information");	
		WebElement personal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Personal Information")));
		personal.click();
	}
	public String get_country()
	{
			
		
		WebDriverWait wait = new WebDriverWait(Account_driver, 20);					
		wait.until(ExpectedConditions.visibilityOfElementLocated(Country));
		Select country = new Select(Account_driver.findElement(Country));
		WebElement myElem = country.getFirstSelectedOption();
		String Country= myElem.getText();
		return Country;
	}
	
	
	
}
