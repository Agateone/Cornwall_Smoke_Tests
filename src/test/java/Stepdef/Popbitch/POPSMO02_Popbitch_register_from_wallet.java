package Stepdef.Popbitch;

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
import Elements.Popbitch_Logged_Out_Wallet;
import Elements.Wallet_Elements;
import Elements.Register_Page_Elements1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POPSMO02_Popbitch_register_from_wallet {
	
	//Initiate driver
	WebDriver Popbitch_register_from_wallet_driver;
	
	//--------------------POPSMO02-----------------------
	//Given I am a user of Axate and I am on the registration page through popbitch wallet homepages 	
	
	@Given("I am a user of Axate and I am on the registration page through popbitch Wallet homepages {string}")
	@Test(priority=7)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_popbitch_Wallet_homepages(String browser) throws InterruptedException {	
	//firefox
	if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");		
		Popbitch_register_from_wallet_driver = new FirefoxDriver();
		Popbitch_register_from_wallet_driver.get("http://popbitch.com");
		Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(Popbitch_register_from_wallet_driver);
		w1.Click_On_popbitch_agate_poster();
		w1.Click_On_popbitch_wallet_register_button();			
		WebDriverWait wait = new WebDriverWait(Popbitch_register_from_wallet_driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
		String reg_Page_url= Popbitch_register_from_wallet_driver.getCurrentUrl();
		if(reg_Page_url.contains("sign"))
		{
			System.out.println("Clicking on create wallet opened registration page");
		}			
	}	
	//safari
		else if (browser.equalsIgnoreCase("safari")) { 
			Popbitch_register_from_wallet_driver= new SafariDriver();
			Popbitch_register_from_wallet_driver.manage().window().maximize();
			Popbitch_register_from_wallet_driver.get("http://popbitch.agate.one");
			Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(Popbitch_register_from_wallet_driver);
			w1.Click_On_popbitch_agate_poster();
			w1.Click_On_popbitch_wallet_register_button();			
			WebDriverWait wait = new WebDriverWait(Popbitch_register_from_wallet_driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
			String reg_Page_url= Popbitch_register_from_wallet_driver.getCurrentUrl();
			if(reg_Page_url.contains("sign"))
			{
				System.out.println("Clicking on create wallet opened registration page");
			}			
	} 
	//chrome
		else if (browser.equalsIgnoreCase("chrome")) { 
			System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
			Popbitch_register_from_wallet_driver= new ChromeDriver();				
			Popbitch_register_from_wallet_driver.get("http://popbitch.com");
			Thread.sleep(10000);
			Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(Popbitch_register_from_wallet_driver);
			w1.Click_On_popbitch_agate_poster();
			w1.Click_On_popbitch_wallet_register_button();			
			WebDriverWait wait = new WebDriverWait(Popbitch_register_from_wallet_driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
			String reg_Page_url= Popbitch_register_from_wallet_driver.getCurrentUrl();
			if(reg_Page_url.contains("sign"))
			{
				System.out.println("Clicking on create wallet opened registration page");
			}			
	} 
	//edge
		else if (browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
		Popbitch_register_from_wallet_driver = new EdgeDriver();
	}				
		}
		
	//When I enter all the required details on step one and click on continue
	@When("I enter all the required details on step one and click on continue")
	@Test(priority=8)
	public void i_enter_all_the_required_details_on_step_one_and_click_on_continue() throws InterruptedException {
	 
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(Popbitch_register_from_wallet_driver);
		Reg_page_elements.Registration_Step1();
		
	}

	
	//And I register a voucher and click on continue
	@When("top up with a valid card in steptwo with one pound and click on continue")
	@Test(priority=9)
	public void top_up_with_a_valid_card_in_steptwo_with_one_pound_and_click_on_continue() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(Popbitch_register_from_wallet_driver);
			Reg_page_elements.voucher_process();
			Reg_page_elements.click_continue_on_reg_page2();
	}
	
	
	//Then I get a funded axate wallet with one pound in it
	@Then("I get a funded axate wallet with one pound in it")
	@Test(priority=10)
	public void i_get_a_funded_axate_wallet_with_one_pound_in_it() throws InterruptedException {
		
		Wallet_Elements w1 = new Wallet_Elements(Popbitch_register_from_wallet_driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="10.00";
		Assert.assertEquals(actual_current_balance, expected_current_balance);		
	}
	
	//And navigated to popbitch.com
	@Then("navigated to popbitch.com")
	@Test(priority=11)
	public void navigated_to_popbitch_com() {
		String actual_url= Popbitch_register_from_wallet_driver.getCurrentUrl();
	    String expected_url = "https://popbitch.com/";
	    Assert.assertEquals(actual_url, expected_url);
	    Popbitch_register_from_wallet_driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    Popbitch_register_from_wallet_driver.quit();
	}

}