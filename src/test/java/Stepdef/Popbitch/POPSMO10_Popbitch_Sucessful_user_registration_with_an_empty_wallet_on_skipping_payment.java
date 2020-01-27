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

import Elements.Add_Funds_Notice;
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Wallet_Elements;
import Elements.Register_Page_Elements1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POPSMO10_Popbitch_Sucessful_user_registration_with_an_empty_wallet_on_skipping_payment{


WebDriver Popbitch_add_funds;
	
	@Given("I am a user of Axate and I am on the registration page through popbitch FUN")
	@Test(priority=48)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_popbitch_FUN(String browser) throws InterruptedException {
		
		System.out.println("Started executing - POPSMO10_Popbitch_Sucessful_user_registration_with_an_empty_wallet_on_skipping_payment");
		
		//firefox
		if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");	
			Popbitch_add_funds = new FirefoxDriver();
			Popbitch_add_funds.get("https://popbitch.com/2019/11/royal-blush/");
			Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(Popbitch_add_funds);
			popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
			WebDriverWait wait = new WebDriverWait(Popbitch_add_funds, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
			String reg_Page_url= Popbitch_add_funds.getCurrentUrl();
			if(reg_Page_url.contains("sign"))
			{
				System.out.println("Clicking on create wallet opened registration page");
			}			
		}	
		//safari
			else if (browser.equalsIgnoreCase("safari")) { 
				Popbitch_add_funds= new SafariDriver();
				Popbitch_add_funds.manage().window().maximize();
				try {
					Popbitch_add_funds.get("http://popbitch.agate.one/2017/10/the-harder-they-fall-2/");					
				}
				catch(Exception e)
				{
					System.out.println("Couldnt open popbitch staging");
				}
				Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(Popbitch_add_funds);
				Popbitch_add_funds.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
				String reg_Page_url= Popbitch_add_funds.getCurrentUrl();
				if(reg_Page_url.contains("sign"))
				{
					System.out.println("Clicking on create wallet opened registration page");
				}
				Popbitch_add_funds.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} 
		//chrome
			else if (browser.equalsIgnoreCase("chrome")) { 
				System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
				Popbitch_add_funds= new ChromeDriver();				
				Popbitch_add_funds.get("https://popbitch.com/2019/11/royal-blush/");
				Thread.sleep(10000);
				Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(Popbitch_add_funds);
				Thread.sleep(5000);
				popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
				Thread.sleep(20000);
	} 
		//edge
			else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
			Popbitch_add_funds = new EdgeDriver();
		}	
	}
	
	@When("I enter all the required details on step one and click on continue")
	@Test(priority=49)
	public void i_enter_all_the_required_details_on_step_one_and_click_on_continue() throws InterruptedException {	 
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(Popbitch_add_funds);
		Reg_page_elements.Registration_Step1();
		System.out.println("registered with a random email");
		
	}		

	@When("I skip the payment and navigating to a premium article on popbitch")
	@Test(priority=50)
	public void i_skip_the_payment_and_navigating_to_a_premium_article_on_popbitch() {
		WebDriverWait wait = new WebDriverWait(Popbitch_add_funds, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("braintree-option__label")));
		Popbitch_add_funds.get("https://popbitch.com/2019/11/royal-blush/");
		String reg_Page_url= Popbitch_add_funds.getCurrentUrl();
		if(reg_Page_url.contains("https://popbitch.com/2019/11/royal-blush/"))
		{
			System.out.println("skipped payment and navigated to URL");
		}
		
	}

	@Then("I get an unfunded axate wallet with zero pounds in it")
	@Test(priority=51)
	public void i_get_an_unfunded_axate_wallet_with_zero_pounds_in_it() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(Popbitch_add_funds);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="0.00";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
		System.out.println("Wallet topped up with 0.00 pounds");
	}

	@Then("an ADD funds notice is displayed")
	@Test(priority=52)
	public void an_ADD_funds_notice_is_displayed() {
		Add_Funds_Notice add1= new Add_Funds_Notice(Popbitch_add_funds);
		Boolean Actual = add1.Add_funds_notice_displayed();
		Boolean expected= true;
		Assert.assertEquals(Actual, expected);
		System.out.println("Add funds notice displayed");
		Popbitch_add_funds.quit();
}
}
