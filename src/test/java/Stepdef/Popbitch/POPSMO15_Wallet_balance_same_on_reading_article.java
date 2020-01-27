package Stepdef.Popbitch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import Elements.Popbitch_First_Use_Notice_Elements;
import Elements.Register_Page_Elements1;
import Elements.Wallet_Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POPSMO15_Wallet_balance_same_on_reading_article {


		
		
		
	WebDriver driver;
	String popbitch_wallet_balance;
	String reaction_wallet_balance;
	String cornwall_wallet_balance;
	String Cricketer_wallet_balance;
		String maidenhead_wallet_balance;
		String slough_wallet_balance;
		String windsor_wallet_balance;
		String grantham_wallet_balance;
		String Newbury_wallet_balance;
		String Scifi_wallet_balance;
		String Examiner_wallet_balance;
		
		@Given("I am a user of Axate and I am on the registration page through popbitch FUN {string}")
		@Test(priority=74)
		@Parameters("browser")
		public void i_am_a_user_of_Axate_and_I_am_on_the_registration_page_through_popbitch_FUN(String browser) throws InterruptedException {
			//firefox
					if(browser.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver","C:/Users/Administrator/Desktop/geckodriver.exe");		
						driver = new FirefoxDriver();
						driver.get("https://popbitch.com/2019/11/royal-blush/");
						Popbitch_First_Use_Notice_Elements maidenhead_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
						maidenhead_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
						WebDriverWait wait = new WebDriverWait(driver, 20);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));	
						String reg_Page_url= driver.getCurrentUrl();
						if(reg_Page_url.contains("https://account-staging.agate.io/my-agate/sign-up?mp=333768&pub_id=mad&publication_name=Maidenhead%20Advertiser%20Staging&url_from=http%3A%2F%2Fstaging.maidenhead-advertiser.co.uk%2Fnews%2Fremember-when%2F137862%2Fremember-remember-when-the-ghosts-and-guys-of-november.html"))
						{
							System.out.println("Clicking on create wallet opened registration page");
						}			
					}	
					//safari
						else if (browser.equalsIgnoreCase("safari")) { 
							driver= new SafariDriver();
							driver.manage().window().maximize();
							try {
								driver.get("http://staging.maidenhead-advertiser.co.uk/news/remember-when/137862/remember-remember-when-the-ghosts-and-guys-of-november.html");					
							}
							catch(Exception e)
							{
								System.out.println("Couldnt open maidenhead staging");
							}
							Popbitch_First_Use_Notice_Elements maidenhead_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
							maidenhead_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
							String reg_Page_url= driver.getCurrentUrl();
							if(reg_Page_url.contains("sign"))
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

		@When("I register successfully on popbitch with three pound")
		@Test(priority=75)
		public void i_register_successfully_on_popbitch_with_three_pound() throws InterruptedException {
			Register_Page_Elements1 Reg_page_elements = new Register_Page_Elements1(driver);
			Reg_page_elements.Registration_Step1();
			Reg_page_elements.voucher_process();
			Thread.sleep(4000);
			Reg_page_elements.click_continue_on_reg_page2();
		}


		@When("I read an article on popbitch")
		@Test(priority=76)
		public void i_read_an_article_on_popbitch() throws InterruptedException {
			
			Thread.sleep(6000);
			Finish_Notice_elements finish = new Finish_Notice_elements(driver);
			finish.popbitch_click_ok_on_finish_notice();
			
		}
		
		@When("I check in wallet balance on Popbitch")
		@Test(priority=77)
		public void i_check_in_wallet_balance_on_popbitch() throws InterruptedException {
			Wallet_Elements w1 = new Wallet_Elements(driver);
			w1.Click_On_popbitch_staging_agate_poster();
			popbitch_wallet_balance=w1.current_balance();
		}

		
	@When("I navigate to reaction")
	@Test(priority=78)
	public void i_navigate_to_reaction() {
	    driver.get("https://reaction.life/why-are-the-tories-not-marmalising-magic-grandpa-and-the-marxist-maniacs/");
	}

	@When("I check in wallet balance on reaction")
	@Test(priority=79)
	public void i_check_in_wallet_balance_on_reaction() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		reaction_wallet_balance=w1.current_balance();
	}

	@When("I navigate to cricketer")
	@Test(priority=80)
	public void i_navigate_to_cricketer() {
		driver.get("https://www.thecricketer.com/Topics/premimum_features/englishman_in_antigua_johnny_grave_is_in_charge_of_west_indies_cricket_trying_to_lead_a_renaissance_and_beating_joe_roots_men_did_no_harm.html");
	}

	@When("I check in wallet balance on cricketer")
	@Test(priority=81)
	public void i_check_in_wallet_balance_on_cricketer() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		Cricketer_wallet_balance=w1.current_balance();
	}

	@When("I navigate to cornwall")
	@Test(priority=82)
	public void i_navigate_to_cornwall() throws InterruptedException {
		driver.get("https://cornwallreports.co.uk/cruel-december-radio-cornwall-back-in-the-doldrums-as-audience-figures-surrender-to-gravity/");
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(16500);				
		driver.findElement(By.xpath("/html/body/div[1]/button")).click();
	}

	@When("I check in wallet balance on cornwall")
	@Test(priority=83)
	public void i_check_in_wallet_balance_on_cornwall() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		cornwall_wallet_balance=w1.current_balance();
	}

	@When("I navigate to maidenhead")
	@Test(priority=84)
	public void i_navigate_to_maidenhead() {
		driver.get("https://www.maidenhead-advertiser.co.uk/news/remember-when/152676/remember-when-neighbours-star-draws-a-crowd-and-protests-over-m4-widening.html");
	}

	@When("I check in wallet balance on maidenhead")
	@Test(priority=85)
	public void i_check_in_wallet_balance_on_maidenhead() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		maidenhead_wallet_balance=w1.current_balance();
	}

	@When("I navigate to slough")
	@Test(priority=86)
	public void i_navigate_to_slough() {
	    driver.get("https://www.sloughexpress.co.uk/news/remember-when/152309/remember-when-a-champion-jockey-american-footballers-and-a-world-record.html");
	}

	@When("I check in wallet balance on slough")
	@Test(priority=87)
	public void i_check_in_wallet_balance_on_slough() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		slough_wallet_balance=w1.current_balance();
	}

	@When("I navigate to windsor")
	@Test(priority=88)
	public void i_navigate_to_windsor() {
driver.get("https://www.windsorexpress.co.uk/news/remember-when/152676/remember-when-neighbours-star-draws-a-crowd-and-protests-over-m4-widening.html");
	}

	@When("I check in wallet balance on windsor")
	@Test(priority=89)
	public void i_check_in_wallet_balance_on_windsor() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		windsor_wallet_balance=w1.current_balance();
	}

	@When("I navigate to grantham")
	@Test(priority=90)
	public void i_navigate_to_grantham() throws InterruptedException {
		driver.get("https://www.granthamjournal.co.uk/news/stowaway-crab-rescued-from-grantham-train-9078953/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);	
	}

	@When("I check in wallet balance on grantham")
	@Test(priority=91)
	public void i_check_in_wallet_balance_on_grantham() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		grantham_wallet_balance=w1.current_balance();					
	}

	
	@When("I navigate to newbury")
	@Test(priority=92)
	public void i_navigate_to_newbury() throws InterruptedException {
		driver.get("https://www.newburytoday.co.uk/news/news/27964/no-quantitative-need-for-additional-convenience-stores-in-thatcham.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);			
	}

	@When("I check in wallet balance on newbury")
	@Test(priority=93)
	public void i_check_in_wallet_balance_on_newbury() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		Newbury_wallet_balance=w1.current_balance();
	}

	@When("I navigate to scifi")
	@Test(priority=94)
	public void i_navigate_to_scifi() {
		driver.get("https://www.scifinow.co.uk/interviews/scary-stories-to-tell-in-the-dark-director-andre-ovredal-on-horror-anticipation-and-smuggling-illegal-vhs-tapes/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	@When("I check in wallet balance on scifi")
	@Test(priority=95)
	public void i_check_in_wallet_balance_on_scifi() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		Scifi_wallet_balance=w1.current_balance();
	}

	@When("I navigate to examiner")
	@Test(priority=96)
	public void i_navigate_to_examiner() {
		driver.get("https://www.examinerlive.co.uk/news/man-groped-schoolgirl-half-age-14655205");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	@When("I check in wallet balance on examiner")
	@Test(priority=97)
	public void i_check_in_wallet_balance_on_examiner() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		Examiner_wallet_balance=w1.current_balance();
	}

	@Then("the wallet balance is same across the publications")
	@Test(priority=98)
	public void the_wallet_balance_is_same_across_the_publications() {
	   String Expected = "9.75";

	   Assert.assertEquals(popbitch_wallet_balance, Expected);
	   System.out.println(popbitch_wallet_balance);
	   Assert.assertEquals(reaction_wallet_balance, Expected);
	   System.out.println(reaction_wallet_balance);
	   Assert.assertEquals(cornwall_wallet_balance, Expected);
	   System.out.println(cornwall_wallet_balance);
	   Assert.assertEquals(Cricketer_wallet_balance, Expected);
	   System.out.println(Cricketer_wallet_balance);
	   Assert.assertEquals(maidenhead_wallet_balance, Expected);
	   System.out.println(maidenhead_wallet_balance);
	   Assert.assertEquals(slough_wallet_balance, Expected);
	   System.out.println(slough_wallet_balance);
	   Assert.assertEquals(windsor_wallet_balance, Expected);
	   System.out.println(windsor_wallet_balance);
	   Assert.assertEquals(grantham_wallet_balance, Expected);
	   System.out.println(grantham_wallet_balance);
	   Assert.assertEquals(Newbury_wallet_balance, Expected);
	   System.out.println(Newbury_wallet_balance);
	   Assert.assertEquals(Scifi_wallet_balance, Expected);
	   System.out.println(Scifi_wallet_balance);
	   Assert.assertEquals(Examiner_wallet_balance, Expected);
	   System.out.println(Examiner_wallet_balance);
	   driver.quit();
	}





}
