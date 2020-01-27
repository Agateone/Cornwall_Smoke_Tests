package Stepdef.Popbitch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import Elements.Popbitch_First_Use_Notice_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class POPSMO25_First_Use_Notice_Displayed {

	WebDriver driver;
	@Given("I am a user of Axate and in a logged out state")
	@Test(priority=156)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_in_a_logged_out_state(String browser) {
		//firefox
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");		
			driver = new FirefoxDriver();
					
		}	
		//safari
			else if (browser.equalsIgnoreCase("safari")) { 
				driver= new SafariDriver();
				
		} 
		//chrome
			else if (browser.equalsIgnoreCase("chrome")) { 
				System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
				driver= new ChromeDriver();				
				
		} 
		
			//edge
			else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
			driver = new EdgeDriver();
		}	

	}

	@When("I navigate to a premium article on popbitch")
	@Test(priority=157)
	public void i_navigate_to_a_premium_article_on_popbitch() throws InterruptedException {
	   driver.get("https://popbitch.com/2019/11/royal-blush/");
	   Thread.sleep(20000);
	}

	@Then("the first use notice is displayed")
	@Test(priority=158)
	public void the_first_use_notice_is_displayed() throws InterruptedException {
		Popbitch_First_Use_Notice_Elements pop_first_use= new Popbitch_First_Use_Notice_Elements(driver);
		Boolean displayed= pop_first_use.First_use_notice_displayed();
		Boolean expected = true;
		Assert.assertEquals(displayed, expected);
		System.out.print("First use notice displayed");
	}


}
