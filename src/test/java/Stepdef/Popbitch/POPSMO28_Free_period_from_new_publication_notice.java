package Stepdef.Popbitch;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import Elements.New_Pub_Notice;
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Reaction_Finish_Notice_elements;
import Elements.Reaction_first_use_notice;
import Elements.Register_Page_Elements1;
import Elements.Wallet_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class POPSMO28_Free_period_from_new_publication_notice {
	WebDriver driver;
	String expected_free_period_date;
	String expected_free_period_time;
	String actual_free_period_time;
	@Given("I am a user of Axate and I am on the registration page through reaction FUN {string}")
	@Test(priority=181)
	@Parameters("browser")
	public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_reaction_FUN(String browser) throws InterruptedException, IOException {
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
				driver.get("https://reaction.life/labours-last-gasp/");
				Thread.sleep(10000);
				Reaction_first_use_notice reaction = new Reaction_first_use_notice(driver);
				reaction.Click_On_Reaction_First_Use_CreateWallet();
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
				String reg_Page_url= driver.getCurrentUrl();
				if(reg_Page_url.contains("https://account.agate.io/my-agate/sign-up?"))
				{
					System.out.println("Clicking on create wallet opened registration page");
				}
		} 
		//edge
			else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","/Users/jay/eclipse-workspace/chromedriver"); 
			driver = new EdgeDriver();
		}	
	}

	@When("I register successfully on reaction with one pound")
	@Test(priority=182)
	public void i_register_successfully_on_reaction_with_one_pound() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
		Reg_page_elements.Registration_Step1();
		Reg_page_elements.voucher_process();
		Reg_page_elements.click_continue_on_reg_page2();
		Thread.sleep(4000);
		/*Wallet_Elements w1 = new Wallet_Elements(driver);	
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="10.00";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
		Finish_Notice_elements finish_notice = new Finish_Notice_elements(driver);
		Boolean Actual_result = finish_notice.Verify_finish_notice_appears();
		Boolean Expected_result= true;
		Assert.assertEquals(Actual_result, Expected_result);*/
	}
	@When("optjust charge me on the finish notice and click ok")
	@Test(priority=183)
	public void opt_just_charge_me_on_the_finish_notice_and_click_ok() throws InterruptedException, IOException {
		Thread.sleep(2000);
		Reaction_Finish_Notice_elements finish = new Reaction_Finish_Notice_elements(driver);
		finish.popbitch_click_ok_on_finish_notice();
		
	}
	
	@When("I navigate to a premium article on popbitch")
	@Test(priority=184)
	public void i_navigate_to_a_premium_article_on_popbitch() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
		
	}
	@When("I opt just charge me on the newpublication  notice and click ok")
	@Test(priority=185)
	public void i_opt_just_cahrge_me_on_the_newpublication_notice_and_click_ok() throws InterruptedException, IOException {
		New_Pub_Notice new_pub = new New_Pub_Notice(driver);
		new_pub.newpub_charge_notice_click_continue();
	}
	
	@When("I display the datetime of the article read")
	@Test(priority=186)
	public void i_display_the_datetime_of_the_article_read() {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 7);
		Date DateTime_expected_free_period = calendar.getTime();
		expected_free_period_date = sdf.format(DateTime_expected_free_period);	
		String expected_free_period_t= w1.get_expected_free_period_time();
		expected_free_period_time= ("until "+expected_free_period_t + "\n" + expected_free_period_date);
		System.out.print(expected_free_period_time);
	}
	
	
	@Then("twentyfivep is deducted from the wallet")
	@Test(priority=187)
	public void twentyfivep_is_deducted_from_the_wallet_after_first_article() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);		
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="9.45";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
	}
		
	
	
	
	@When("I navigate to second premium article on popbitch")
	@Test(priority=188)
	public void i_navigate_to_second_premium_article_on_popbitch() throws InterruptedException {
		Thread.sleep(2000);
	    driver.navigate().to("https://popbitch.com/2019/11/royal-blush/");
	    
	}
	

	
	@Then("twentyfivep is deducted from the wallet")
	@Test(priority=189)
	public void twentyfivep_is_deducted_from_the_wallet() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);		
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="9.20";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
	}
	
	
	@Then("free period is acheived with free on the free point")
	@Test(priority=190)
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
