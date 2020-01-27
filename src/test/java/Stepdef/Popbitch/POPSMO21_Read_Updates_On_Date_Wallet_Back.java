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

import Elements.Finish_Notice_elements;
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Wallet_Elements;
import Elements.Register_Page_Elements1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class POPSMO21_Read_Updates_On_Date_Wallet_Back {
	WebDriver driver;
	Date DateTime_after_article_read;
	Date DateTime_expected_free_period;
	String expected_free_period;
	
	@Given("I am a user of Axate and I am on the registration page through popbitch FUN {string}")
	@Test(priority=127)
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
	@Test(priority=128)
	public void i_register_successfully_on_popbitch_with_one_pound() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
		Reg_page_elements.Registration_Step1();
		Reg_page_elements.voucher_process();
		Reg_page_elements.click_continue_on_reg_page2();
	}
	
	@When("I read an article on popbitch")
	@Test(priority=129)
	public void i_read_an_article_on_popbitch() throws InterruptedException, IOException {
		Thread.sleep(4000);
		Finish_Notice_elements finish = new Finish_Notice_elements(driver);
		finish.popbitch_click_on_authy_and_ok();
	}

	@When("I display the datetime of the article read")
	@Test(priority=130)
	public void i_display_the_datetime_of_the_article_read() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd YYYY");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 7);
		Date DateTime_expected_free_period = calendar.getTime();
		expected_free_period = sdf.format(DateTime_expected_free_period);		
	}
	
	@When("I open the wallet")
	@Test(priority=131)
	public void i_open_the_wallet() {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
	}

	@When("I flip the wallet")
	@Test(priority=132)
	public void i_flip_the_wallet() {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.flip_wallet();
	}
	
	@Then("the updates on date on the back of the wallet is sevendays from datetime noted when I read the first article")
	@Test(priority=133)
	public void the_updates_on_date_on_the_back_of_the_wallet_is_seven_days_from_datetime_noted_when_I_read_the_first_article() {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		String updates_on_date= w1.updates_on_date();		
		String updates_on_expected= "(updates on "+expected_free_period+")";
		Assert.assertEquals(updates_on_date, updates_on_expected);
		System.out.println(updates_on_date);
		System.out.println(updates_on_expected);
	}
	
}