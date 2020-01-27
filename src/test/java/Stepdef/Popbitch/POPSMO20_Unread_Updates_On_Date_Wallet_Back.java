package Stepdef.Popbitch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
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
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Wallet_Elements;
import Elements.Register_Page_Elements1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class POPSMO20_Unread_Updates_On_Date_Wallet_Back {
	
	WebDriver driver;
	
	@Given("I am a user of Axate and I am on the registration page through popbitch FUN {string}")
	@Test(priority=122)
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
	@Test(priority=123)
	public void i_register_successfully_on_popbitch_with_one_pound() throws InterruptedException {
		Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
		Reg_page_elements.Registration_Step1();
		Reg_page_elements.voucher_process();
		Reg_page_elements.click_continue_on_reg_page2();
		

	
	}

	@When("I open the wallet")
	@Test(priority=124)
	public void i_open_the_wallet() {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
	}

	@When("I flip the wallet")
	@Test(priority=125)
	public void i_flip_the_wallet() {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.flip_wallet();
	}

	@Then("the updates on date on the back of the wallet is sevendaysdays from current datetime")
	@Test(priority=126)
	public void the_updates_on_date_on_the_back_of_the_wallet_is_sevendaysdays_from_current_datetime() {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		String updates_on_date= w1.updates_on_date();		
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd YYYY");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 7);
		Date futureDateTime = calendar.getTime();
		String formattedfutureDate = sdf.format(futureDateTime);
		String freeperiod_expiry= "(updates on "+formattedfutureDate+")";
		Assert.assertEquals(updates_on_date, freeperiod_expiry);
		System.out.println(updates_on_date);
		System.out.println(freeperiod_expiry);
		
		
		
		
	}

}
