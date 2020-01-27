package Stepdef.Popbitch;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
import Elements.Popbitch_Logged_Out_Wallet;
import Elements.Wallet_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class POPSMO31_Login_From_Wallet {
	
	WebDriver driver;
	
	
	@Given("I am a user of Axate and I am on the Login page wallet")
	@Test(priority=204)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_Login_page_wallet(String browser) throws InterruptedException {
		//firefox
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");		
			driver = new FirefoxDriver();
			driver.get("https://popbitch.com");
			Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(driver);
			w1.Click_On_popbitch_agate_poster();
			w1.Click_On_popbitch_wallet_register_button();			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
			String reg_Page_url= driver.getCurrentUrl();
			if(reg_Page_url.contains("sign"))
			{
				System.out.println("Clicking on create wallet opened registration page");
			}			
		}	
		//safari
			else if (browser.equalsIgnoreCase("safari")) { 
				driver= new SafariDriver();
				driver.manage().window().maximize();
				driver.get("http://popbitch.agate.one");
				Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(driver);
				w1.Click_On_popbitch_agate_poster();
				w1.Click_On_popbitch_wallet_register_button();			
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
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
				driver.get("https://popbitch.com");
				Thread.sleep(20000);
				Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(driver);
				w1.Click_On_popbitch_agate_poster();
				w1.Click_On_popbitch_wallet_Login_button();			
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
				String reg_Page_url= driver.getCurrentUrl();
				if(reg_Page_url.contains("sign"))
				{
					System.out.println("Clicking on Login  opened login page");
				}			
		} 
		//edge
			else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
			driver = new EdgeDriver();
		}			
	}
	
	
	@When("I enter a valid email and a valid password on the login page")
	@Test(priority=205)
	public void i_enter_a_valid_email_and_a_valid_password_on_the_login_page() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));	
		Login_Page_Elements login_page = new Login_Page_Elements(driver);
		login_page.Login_Process();
	}

	@When("I click on continue on login page")
	@Test(priority=206)
	public void i_click_on_continue_on_login_page() {
		Login_Page_Elements login_page = new Login_Page_Elements(driver);
		login_page.click_on_login_button();
	}

	@Then("I am successfully logged in to axate")
	@Test(priority=207)
	public void i_am_successfully_logged_in_to_axate() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="9.75";
		Assert.assertEquals(actual_current_balance, expected_current_balance);		
	}


	@Then("I am navigated to popbitch homepage")
	@Test(priority=208)
	public void i_am_navigated_to_popbitch_homepage() {
		String actual_url= driver.getCurrentUrl();
	    String expected_url = "https://popbitch.com/";
	    Assert.assertEquals(actual_url, expected_url);
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.quit();
	}

}
