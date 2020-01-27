package Stepdef.Popbitch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Elements.Authorise_charge_notice_popbitch;
import Elements.Finish_Notice_elements;
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Wallet_Elements;
import Elements.Register_Page_Elements1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POPSMO27_Popbitch_Free_Period_From_Authoirse_Charge_Notice {
	WebDriver driver;
	String expected_free_period_date;
	String expected_free_period_time;
	String actual_free_period_time;
	
	@Given("I am a user of Axate and I am on the registration page through popbitch FUN {string}")
	@Test(priority=169)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_popbitch_FUN(String browser) throws InterruptedException {
		//firefox
				if(browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");		
					driver = new FirefoxDriver();
					driver.get("https://popbitch.com/2019/11/royal-blush/");
					Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
					popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
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
						try {
							driver.get("https://popbitch.com/2019/11/royal-blush/");					
						}
						catch(Exception e)
						{
							System.out.println("Couldnt open popbitch staging");
						}
						Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
						popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
						String reg_Page_url= driver.getCurrentUrl();
						if(reg_Page_url.contains("https://account.agate.io/my-agate/sign-up?"))
						{
							System.out.println("Clicking on create wallet opened registration page");
						}
				} 
				//chrome
					else if (browser.equalsIgnoreCase("chrome")) { 
						System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");				
						driver= new ChromeDriver();				
						driver.get("https://popbitch.com/2019/11/royal-blush/");
						Thread.sleep(10000);
						Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
						Thread.sleep(5000);
						popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
						Thread.sleep(20000);
			} 
				//edge
					else if (browser.equalsIgnoreCase("Edge")) {
					System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
					driver = new EdgeDriver();
				}	
	}

	@When("I register successfully on popbitch with one pound")
	@Test(priority=170)
	public void i_register_successfully_on_popbitch_with_one_pound() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
		Reg_page_elements.Registration_Step1();
		Reg_page_elements.voucher_process();
		Reg_page_elements.click_continue_on_reg_page2();
	}
	
	@When("opt Ask me everytime on the finish notice and click ok")
	@Test(priority=171)
	public void opt_Ask_me_everytime_on_the_finish_notice_and_click_ok() throws InterruptedException, IOException {
		Finish_Notice_elements finish = new Finish_Notice_elements(driver);
		finish.popbitch_click_on_authy_and_ok();
	}

	@When("click ok on the authorise charge notice")
	@Test(priority=172)
	public void click_ok_on_the_authorise_charge_notice_for_first_Article() throws IOException, InterruptedException {
		 Authorise_charge_notice_popbitch authy = new Authorise_charge_notice_popbitch(driver);
		    authy.authorise_charge_notice_click_continue();
		    Thread.sleep(4000);
	}
	
	@When("twenty fivep is detucted from the wallet")
	@Test(priority=173)
	public void twenty_fivep_is_detucted_from_the_wallet() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);		
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="9.75";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
	}

	@When("I display the datetime of the article read")
	@Test(priority=174)
	public void i_display_the_datetime_of_the_article_read() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 7);
		Date DateTime_expected_free_period = calendar.getTime();
		expected_free_period_date = sdf.format(DateTime_expected_free_period);	
		String expected_free_period_t= w1.get_expected_free_period_time();
		expected_free_period_time= ("until "+expected_free_period_t + "\n" + expected_free_period_date);
		System.out.print(expected_free_period_time);
		Thread.sleep(2000);
	}
	
	@When("twenty fivep is detucted from the free point")
	@Test(priority=175)
	public void twenty_fivep_is_detucted_from_the_free_point() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_free_point=w1.Free_point();
		String expected_free_point="25";
		Assert.assertEquals(actual_free_point, expected_free_point);
	}

	@When("I navigate to second premium article on popbitch")
	@Test(priority=176)
	public void i_navigate_to_second_premium_article_on_popbitch() throws InterruptedException {
		Thread.sleep(2000);
	    driver.navigate().to("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
	    Thread.sleep(2000);
	}
	
	@When("click ok on the authorise charge notice")
	@Test(priority=177)
	public void click_ok_on_the_authorise_charge_notice_of_second_article() throws IOException, InterruptedException {
		Authorise_charge_notice_popbitch authy = new Authorise_charge_notice_popbitch(driver);
	    authy.authorise_charge_notice_click_continue();
	}
	/*
	@Then("wallet tab displays twentyfivep")
	@Test(priority=178)
	public void wallet_tab_displays_twentyfivep() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		String actual_price= w1.green_tab_price();
		String expected_price= "25";
		Assert.assertEquals(actual_price, expected_price);
	}*/
	
	@Then("twentyfivep is deducted from the wallet")
	@Test(priority=179)
	public void twentyfivep_is_deducted_from_the_wallet() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);		
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="9.50";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
	}
	
	@Then("free period is acheived with free on the free point")
	@Test(priority=180)
	public void free_period_is_acheived_with_free_on_the_free_point() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		
		String actual_free_point= w1.Free_point_free();
		String expected_free_point= "Free";
		System.out.println("\n"+actual_free_point);
		Assert.assertEquals(actual_free_point, expected_free_point);
		String actual_free_period= w1.Get__free_period();
	
		Assert.assertEquals(actual_free_period, expected_free_period_time);
	}
}
