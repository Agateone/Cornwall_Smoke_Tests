package Stepdef.cornwalllive;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class CORSMO02_Cornwall_register_from_wallet {
	
	//Initiate driver
	WebDriver driver;
	
	//--------------------CORSMO02-----------------------
	//Given I am a user of Axate and I am on the registration page through Cornwall wallet homepages 	
	
	@Given("I am a user of Axate and I am on the registration page through Cornwall Wallet homepages {string}")
	@Test(priority=7)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_Cornwall_Wallet_homepages(String browser) throws InterruptedException {	
		System.out.println("Executing CORSMO02_Cornwall_register_from_wallet");
		
	//chrome
		 if (browser.equalsIgnoreCase("chrome")) { 
			System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
			driver= new ChromeDriver();				
			driver.get("https://cornwallreports.co.uk/cruel-december-radio-cornwall-back-in-the-doldrums-as-audience-figures-surrender-to-gravity/");
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[1]/button")).click();
			Thread.sleep(5000);
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
			System.out.println("1 of 5");
	} 
					
		}
		
	//When I enter all the required details on step one and click on continue
	@When("I enter all the required details on step one and click on continue")
	@Test(priority=8)
	public void i_enter_all_the_required_details_on_step_one_and_click_on_continue() throws InterruptedException {
	 
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
		Reg_page_elements.Registration_Step1();
		System.out.println("2 of 5");
		
	}

	
	//And I register a voucher and click on continue
	@When("top up with a valid card in steptwo with one pound and click on continue")
	@Test(priority=9)
	public void top_up_with_a_valid_card_in_steptwo_with_one_pound_and_click_on_continue() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
			Reg_page_elements.voucher_process();
			Reg_page_elements.click_continue_on_reg_page2();
			System.out.println("3 of 5");
	}
	
	
	//Then I get a funded axate wallet with one pound in it
	@Then("I get a funded axate wallet with one pound in it")
	@Test(priority=10)
	public void i_get_a_funded_axate_wallet_with_one_pound_in_it() throws InterruptedException {
		
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="10.00";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
		System.out.println("4 of 5");
	}
	
	//And navigated to Cornwall.com
	@Then("navigated to Cornwall.com")
	@Test(priority=11)
	public void navigated_to_Cornwall_com() {
		String actual_url= driver.getCurrentUrl();
	    String expected_url = "https://cornwallreports.co.uk/cruel-december-radio-cornwall-back-in-the-doldrums-as-audience-figures-surrender-to-gravity/";
	    Assert.assertEquals(actual_url, expected_url);
	    System.out.println("5 of 5");
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.quit();
	}

}