//doesnt apply 
/*package Stepdef.Popbitch;

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
import Elements.Register_Page_Elements1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POPSMO04_Popbitch_Payment_system_loads_on_one_pound {
	
	WebDriver Popbitch_Payment_system_loads_on_one_pound_driver;
	
	@Given("I am a user of Axate and I am on the registration page through popbitch Wallet homepages")
	@Test(priority=19)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_popbitch_Wallet_homepages(String browser) throws InterruptedException {
		//firefox
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");		
			Popbitch_Payment_system_loads_on_one_pound_driver = new FirefoxDriver();
			Popbitch_Payment_system_loads_on_one_pound_driver.get("http://popbitch.agate.one");
			Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(Popbitch_Payment_system_loads_on_one_pound_driver);
			w1.Click_On_popbitch_agate_poster();
			w1.Click_On_popbitch_wallet_register_button();			
			WebDriverWait wait = new WebDriverWait(Popbitch_Payment_system_loads_on_one_pound_driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
			String reg_Page_url= Popbitch_Payment_system_loads_on_one_pound_driver.getCurrentUrl();
			if(reg_Page_url.contains("sign"))
			{
				System.out.println("Clicking on create wallet opened registration page");
			}			
		}	
		//safari
			else if (browser.equalsIgnoreCase("safari")) { 
				Popbitch_Payment_system_loads_on_one_pound_driver= new SafariDriver();
				Popbitch_Payment_system_loads_on_one_pound_driver.manage().window().maximize();
				Popbitch_Payment_system_loads_on_one_pound_driver.get("http://popbitch.agate.one");
				Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(Popbitch_Payment_system_loads_on_one_pound_driver);
				w1.Click_On_popbitch_agate_poster();
				w1.Click_On_popbitch_wallet_register_button();			
				WebDriverWait wait = new WebDriverWait(Popbitch_Payment_system_loads_on_one_pound_driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
				String reg_Page_url= Popbitch_Payment_system_loads_on_one_pound_driver.getCurrentUrl();
				if(reg_Page_url.contains("sign"))
				{
					System.out.println("Clicking on create wallet opened registration page");
				}			
		} 
		//chrome
			else if (browser.equalsIgnoreCase("chrome")) { 
				System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
				Popbitch_Payment_system_loads_on_one_pound_driver= new ChromeDriver();				
				Popbitch_Payment_system_loads_on_one_pound_driver.get("http://popbitch.agate.one");
				Popbitch_Logged_Out_Wallet w1= new Popbitch_Logged_Out_Wallet(Popbitch_Payment_system_loads_on_one_pound_driver);
				w1.Click_On_popbitch_agate_poster();
				w1.Click_On_popbitch_wallet_register_button();			
				WebDriverWait wait = new WebDriverWait(Popbitch_Payment_system_loads_on_one_pound_driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
				String reg_Page_url= Popbitch_Payment_system_loads_on_one_pound_driver.getCurrentUrl();
				if(reg_Page_url.contains("sign"))
				{
					System.out.println("Clicking on create wallet opened registration page");
				}			
		} 
		//edge
			else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
			Popbitch_Payment_system_loads_on_one_pound_driver = new EdgeDriver();
		}			
	}
	
	
	@When("I enter all the required details on step one and click on continue")
	@Test(priority=20)
	public void i_enter_all_the_required_details_on_step_one_and_click_on_continue() throws InterruptedException {	 
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(Popbitch_Payment_system_loads_on_one_pound_driver);
		Reg_page_elements.Registration_Step1();
		
	}	
	
	@When("I click on one pound on regpage two")
	@Test(priority=21)
	public void i_click_on_one_pound_on_regpage_two() {
		System.out.println("clicked on one pound on reg page 2");  
	}

	@Then("payment system displays card option")
	@Test(priority=22)
	public void payment_system_displays_card_option() {
		WebDriverWait wait = new WebDriverWait(Popbitch_Payment_system_loads_on_one_pound_driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("braintree-option__label")));
		Boolean Actual_result = Popbitch_Payment_system_loads_on_one_pound_driver.findElement(By.className("braintree-option__label")).isDisplayed();
		Boolean Expected_result = true;
		Assert.assertEquals(Actual_result, Expected_result);
		
	}

	@Then("payment system displays paypal option")
	@Test(priority=23)
	public void payment_system_displays_paypal_option() {
		WebDriverWait wait = new WebDriverWait(Popbitch_Payment_system_loads_on_one_pound_driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("braintree-option__label")));
		Boolean Actual_result = Popbitch_Payment_system_loads_on_one_pound_driver.findElement(By.className("braintree-option__label")).isDisplayed();
		Boolean Expected_result = true;
		Assert.assertEquals(Actual_result, Expected_result);		
		Popbitch_Payment_system_loads_on_one_pound_driver.quit();
}
}
*/