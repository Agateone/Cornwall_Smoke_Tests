/*package Stepdef.Popbitch;

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
import Elements.Popbitch_Finish_Notice_elements;
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Popbitch_Wallet_Elements;
import Elements.Register_Page_Elements1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POPSMO09_Popbitch_successfull_signup_with_5_pounds {
	
	WebDriver Popbitch_successfull_signup_with_3_pounds_driver;
	
	@Given("I am a user of Axate and I am on the registration page through popbitch FUN")
	@Test(priority=41)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_popbitch_FUN(String browser) throws InterruptedException {
		//firefox
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");	
			Popbitch_successfull_signup_with_3_pounds_driver = new FirefoxDriver();
			Popbitch_successfull_signup_with_3_pounds_driver.get("http://popbitch.agate.one/2017/10/the-harder-they-fall-2/");
			Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(Popbitch_successfull_signup_with_3_pounds_driver);
			popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
			WebDriverWait wait = new WebDriverWait(Popbitch_successfull_signup_with_3_pounds_driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
			String reg_Page_url= Popbitch_successfull_signup_with_3_pounds_driver.getCurrentUrl();
			if(reg_Page_url.contains("sign"))
			{
				System.out.println("Clicking on create wallet opened registration page");
			}			
		}	
		//safari
			else if (browser.equalsIgnoreCase("safari")) { 
				Popbitch_successfull_signup_with_3_pounds_driver= new SafariDriver();
				Popbitch_successfull_signup_with_3_pounds_driver.manage().window().maximize();
				try {
					Popbitch_successfull_signup_with_3_pounds_driver.get("http://popbitch.agate.one/2017/10/the-harder-they-fall-2/");					
				}
				catch(Exception e)
				{
					System.out.println("Couldnt open popbitch staging");
				}
				Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(Popbitch_successfull_signup_with_3_pounds_driver);
				popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
				String reg_Page_url= Popbitch_successfull_signup_with_3_pounds_driver.getCurrentUrl();
				if(reg_Page_url.contains("sign"))
				{
					System.out.println("Clicking on create wallet opened registration page");
				}
		} 
		//chrome
			else if (browser.equalsIgnoreCase("chrome")) { 
				System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
				Popbitch_successfull_signup_with_3_pounds_driver= new ChromeDriver();				
				Popbitch_successfull_signup_with_3_pounds_driver.get("http://popbitch.agate.one/2017/10/the-harder-they-fall-2/");
				Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(Popbitch_successfull_signup_with_3_pounds_driver);
				popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
				WebDriverWait wait = new WebDriverWait(Popbitch_successfull_signup_with_3_pounds_driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
				String reg_Page_url= Popbitch_successfull_signup_with_3_pounds_driver.getCurrentUrl();
				if(reg_Page_url.contains("https://account-qa.axate.io/my-agate/sign-up"))
				{
					System.out.println("Clicking on create wallet opened registration page");
				}
		} 
		//edge
			else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
			Popbitch_successfull_signup_with_3_pounds_driver = new EdgeDriver();
		}	
	}
	
	@When("I enter all the required details on step one and click on continue")
	@Test(priority=42)
	public void i_enter_all_the_required_details_on_step_one_and_click_on_continue() throws InterruptedException {	 
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(Popbitch_successfull_signup_with_3_pounds_driver);
		Reg_page_elements.Registration_Step1();
		
	}	
	
	@When("I click on five pounds on regpage two")
	@Test(priority=43)
	public void i_click_on_five_pounds_on_regpage_two() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(Popbitch_successfull_signup_with_3_pounds_driver);
		Reg_page_elements.click_on_pound_5();
	}
	
	
	
	@When("enter valid card details and click on continue")
	@Test(priority=44)
	public void enter_valid_card_details_and_click_on_continue() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(Popbitch_successfull_signup_with_3_pounds_driver);
		Reg_page_elements.Registration_Step2();
	}
	
	@Then("I get a funded axate wallet with five pounds in it")
	@Test(priority=45)
	public void i_get_a_funded_axate_wallet_with_five_pounds_in_it() throws InterruptedException {

		Popbitch_Wallet_Elements w1 = new Popbitch_Wallet_Elements(Popbitch_successfull_signup_with_3_pounds_driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="5.00";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
	}
	
	
	@Then("navigated to the same article")
	@Test(priority=46)
	public void navigated_to_the_same_article() {
	    String actual_url= Popbitch_successfull_signup_with_3_pounds_driver.getCurrentUrl();
	    String expected_url = "http://popbitch.agate.one/2017/10/the-harder-they-fall-2/";
	    Assert.assertEquals(actual_url, expected_url);	
	}
	
	
	@Then("finish notice appears")
	@Test(priority=47)
	public void finish_notice_appears() throws InterruptedException {
		Popbitch_Finish_Notice_elements finish_notice = new Popbitch_Finish_Notice_elements(Popbitch_successfull_signup_with_3_pounds_driver);
		Boolean Actual_result = finish_notice.Verify_finish_notice_appears();
		Boolean Expected_result= true;
		Assert.assertEquals(Actual_result, Expected_result);
		Popbitch_successfull_signup_with_3_pounds_driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Popbitch_successfull_signup_with_3_pounds_driver.quit();
	}
	

	
}*/