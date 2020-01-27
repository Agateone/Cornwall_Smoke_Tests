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
import Elements.Finish_Notice_elements;
import Elements.New_Pub_Notice;
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Register_Page_Elements1;
import Elements.Wallet_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POPSMO29_Free_period_on_2_publications {
	WebDriver driver;	
	String expected_free_period_date_pop;
	String expected_free_period_date_new;
	String expected_free_period_time_pop;
	String expected_free_period_time_new;
	String actual_free_period_time_pop;
	String actual_free_period_time_new;
	String actual_free_point_pop;
	String actual_free_point_new;
	
	
	
	String actual_free_period_pop;
	String actual_free_period_new;
	
	

	
			@Given("I am a user of Axate and I am on the registration page through popbitch FUN {string}")
			@Test(priority=191)
			@Parameters("browser")
			public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_popbitch_FUN(String browser) throws InterruptedException, IOException {
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
			@Test(priority=192)
			public void i_register_successfully_on_popbitch_with_one_pound() throws InterruptedException {
				Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
				Reg_page_elements.Registration_Step1();
				Reg_page_elements.voucher_process();
				Reg_page_elements.click_continue_on_reg_page2();
				Wallet_Elements w1 = new Wallet_Elements(driver);
				w1.Click_On_popbitch_staging_agate_poster();
				String actual_current_balance=w1.current_balance();
				String expected_current_balance="10.00";
				Assert.assertEquals(actual_current_balance, expected_current_balance);
				Finish_Notice_elements finish_notice = new Finish_Notice_elements(driver);
				Boolean Actual_result = finish_notice.Verify_finish_notice_appears();
				Boolean Expected_result= true;
				Assert.assertEquals(Actual_result, Expected_result);
			}
			@When("acheive free period on popbitch")
			@Test(priority=193)
			public void acheive_free_period_on_popbitch() throws InterruptedException {
				Thread.sleep(4000);
				Finish_Notice_elements finish = new Finish_Notice_elements(driver);
				finish.popbitch_click_ok_on_finish_notice();
				Wallet_Elements w1 = new Wallet_Elements(driver);
				w1.Click_On_popbitch_staging_agate_poster();
				String actual_current_balance=w1.current_balance();
				String expected_current_balance="9.75";
				Assert.assertEquals(actual_current_balance, expected_current_balance);
				//display date time of the first article read
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_YEAR, 7);
				Date DateTime_expected_free_period = calendar.getTime();
				expected_free_period_date_pop = sdf.format(DateTime_expected_free_period);	
				String expected_free_period_t= w1.get_expected_free_period_time();
				expected_free_period_time_pop= ("until "+expected_free_period_t + "\n" + expected_free_period_date_pop);
				System.out.print(expected_free_period_time_pop);
				Thread.sleep(2000);
			    driver.navigate().to("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
			   Thread.sleep(2000);				
				 actual_free_point_pop= w1.Free_point_free();
				String expected_free_point_pop= "Free";
				System.out.println("\n"+actual_free_point_pop);
				Assert.assertEquals(actual_free_point_pop, expected_free_point_pop);
				String actual_free_period_pop= w1.Get__free_period();			
				Assert.assertEquals(actual_free_period_pop, expected_free_period_time_pop);
		
		}
			
			@When("I navigate to a premium article on newbury")
			@Test(priority=194)
			public void i_navigate_to_a_premium_article_on_newbury() throws InterruptedException {
				Thread.sleep(2000);
			    driver.navigate().to("https://www.newburytoday.co.uk/news/news/27964/no-quantitative-need-for-additional-convenience-stores-in-thatcham.html");
			}
			@When("opt just charge me on the newpublication notice and click ok")
			@Test(priority=195)
			public void opt_just_charge_me_on_the_newpublication_notice_and_click_ok() throws InterruptedException, IOException {
				
				New_Pub_Notice new_pub = new New_Pub_Notice(driver);
				new_pub.newpub_charge_notice_click_continue();
				
			}
			@When("I display the datetime of the article read on newbury")
			@Test(priority=196)
			public void i_display_the_datetime_of_the_article_read_on_newbury() throws InterruptedException {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_YEAR, 1);
				Date DateTime_expected_free_period = calendar.getTime();
				expected_free_period_date_new = sdf.format(DateTime_expected_free_period);
				Wallet_Elements w1 = new Wallet_Elements(driver);
				 expected_free_period_time_new= w1.get_expected_free_period_time();
				expected_free_period_time_new= ("until "+expected_free_period_time_new + "\n" + expected_free_period_date_new);
				System.out.print(expected_free_period_time_new);
				Thread.sleep(2000);
				actual_free_point_new= w1.Free_point_free();
				String expected_free_point_new= "Free";
				System.out.println("\n"+actual_free_point_new);
				Assert.assertEquals(actual_free_point_new, expected_free_point_new);
				String actual_free_period_new= w1.Get__free_period();			
				Assert.assertEquals(actual_free_period_new, expected_free_period_time_new);
			}
			@Then("the free period on popbitch is seven days from the date time the first article was read on popbitch")
			@Test(priority=197)
			public void the_free_period_on_popbitch_is_seven_days_from_the_date_time_the_first_article_was_read_on_popbitch() throws InterruptedException {
	
			driver.navigate().to("https://popbitch.com/2019/10/iv-art-of-the-dyl/");
			Thread.sleep(4000);
			Wallet_Elements w1 = new Wallet_Elements(driver);
			w1.Click_On_popbitch_staging_agate_poster();
			Thread.sleep(4000);
			String actual_free_period_pop= w1.Get__free_period();
			Assert.assertEquals(actual_free_period_pop, expected_free_period_time_pop);
			System.out.print(actual_free_period_pop+ "\n"+expected_free_period_time_pop );
		
			
			}
			
			@Then("the free period on newbury is one day from the date time the first article was read on newbury")
			@Test(priority=198)
			public void the_free_period_on_newbury_is_one_days_from_the_date_time_the_first_article_was_read_on_newbury() throws InterruptedException {
			
			
			driver.get("https://www.newburytoday.co.uk/news/news/27964/no-quantitative-need-for-additional-convenience-stores-in-thatcham.html");
			Wallet_Elements w1 = new Wallet_Elements(driver);
			Thread.sleep(4000);
			w1.Click_On_popbitch_staging_agate_poster();
			String actual_free_period_new= w1.Get__free_period();
			
			
				Assert.assertEquals(actual_free_period_new, expected_free_period_time_new);
				System.out.print(actual_free_period_new+ "\n"+expected_free_period_time_new );
			}

	}

