package Stepdef.Popbitch;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Elements.Login_Page_Elements;
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Wallet_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class POPSMO30_Login_From_First_Use_Notice {
	WebDriver driver;
	
	@Given("I am a user of Axate and I am on the login page through popbitch staging")
	@Test(priority=199)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_login_page_through_popbitch_staging(String browser) throws InterruptedException {
		
			if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");		
				driver = new FirefoxDriver();
				driver.get("https://popbitch.com/2019/11/royal-blush/");
				WebDriverWait wait = new WebDriverWait(driver, 20);
				Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
				popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Login();
				WebElement register= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Not registered? Register now!")));	
				Boolean login_page_displayed= register.isDisplayed();
				if(login_page_displayed==true)
				{
					System.out.println("Clicking on Login from FUN opened Login page");
				}
			}	
			//safari
				else if (browser.equalsIgnoreCase("safari")) { 
					driver= new SafariDriver();
					driver.manage().window().maximize();
					try {
						driver.get("http://popbitch.agate.one/2017/10/the-harder-they-fall-2/");					
					}
					catch(Exception e)
					{
						System.out.println("Couldnt open popbitch staging");
					}
					Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
					popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
					String reg_Page_url= driver.getCurrentUrl();
					if(reg_Page_url.contains("sign"))
					{
						System.out.println("Clicking on create wallet opened registration page");
					}
			} 
			//chrome
				else if (browser.equalsIgnoreCase("chrome")) { 
					System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
					driver= new ChromeDriver();				
					driver.get("https://popbitch.com/2019/11/royal-blush/");
					Thread.sleep(20000);
					WebDriverWait wait = new WebDriverWait(driver, 20);
					Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
					popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Login();
					WebElement register = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Not registered? Register now!")));	
					Boolean login_page_displayed= register.isDisplayed();
					if(login_page_displayed==true)
					{
						System.out.println("Clicking on Login from FUN opened Login page");
					}
			} 
			//edge
				else if (browser.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
				driver = new EdgeDriver();
			}	
	}

	@When("I enter a valid email and a valid password on the login page")
	@Test(priority=200)
	public void i_enter_a_valid_email_and_a_valid_password_on_the_login_page() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));	
		Login_Page_Elements login_page = new Login_Page_Elements(driver);
		login_page.Login_Process();
	}

	@When("I click on continue on login page")
	@Test(priority=201)
	public void i_click_on_continue_on_login_page() {
		Login_Page_Elements login_page = new Login_Page_Elements(driver);
		login_page.click_on_login_button();
	}

	@Then("I am successfully logged in to axate")
	@Test(priority=202)
	public void i_am_successfully_logged_in_to_axate() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="9.75";
		Assert.assertEquals(actual_current_balance, expected_current_balance);		
	}

	@Then("I am navigated to the same article")
	@Test(priority=203)
	public void i_am_navigated_to_the_same_article() {
		String actual_url= driver.getCurrentUrl();
	    String expected_url = "https://popbitch.com/2019/11/royal-blush/";
	    Assert.assertEquals(actual_url, expected_url);
	}
	
	
	
	
	
}
