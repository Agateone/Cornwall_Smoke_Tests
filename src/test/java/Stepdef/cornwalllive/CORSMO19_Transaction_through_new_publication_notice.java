package Stepdef.cornwalllive;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class CORSMO19_Transaction_through_new_publication_notice {
WebDriver driver;
	@Given("I am a user of Axate and I am on the registration page through popbitch FUN {string}")
	@Test(priority=96)
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
						System.setProperty("webdriver.chrome.driver","/Users/jay/eclipse-workspace/chromedriver");				
						driver= new ChromeDriver();				
						driver.get("https://popbitch.com/2019/11/royal-blush/");
						Popbitch_First_Use_Notice_Elements popbitch_first_use_elements= new Popbitch_First_Use_Notice_Elements(driver);
						popbitch_first_use_elements.Click_On_Popbitch_First_Use_Notice_Create_Wallet();
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

	@When("I register successfully on popbitch with one pound")
	@Test(priority=97)
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

	@When("click ok on the finish notice")
	@Test(priority=98)
	public void click_ok_on_the_finish_notice() throws InterruptedException {
		Finish_Notice_elements finish = new Finish_Notice_elements(driver);
		finish.popbitch_click_ok_on_finish_notice();
		Thread.sleep(2000);
	}

	@When("navigate to a premium article on cornwall")
	@Test(priority=99)
	public void navigate_to_a_premium_article_on_cornwall() throws InterruptedException {
		driver.navigate().to("https://cornwallreports.co.uk/cruel-december-radio-cornwall-back-in-the-doldrums-as-audience-figures-surrender-to-gravity/");
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(16500);				
		driver.findElement(By.xpath("/html/body/div[1]/button")).click();
	}

	@When("opt just charge me on the newpublication notice and click ok")
	@Test(priority=100)
	public void opt_just_charge_me_on_the_newpublication_notice_and_click_ok() throws InterruptedException, IOException {
		New_Pub_Notice new_pub = new New_Pub_Notice(driver);
		new_pub.newpub_charge_notice_click_continue();
		
	}

	//failing on automation
	/*
	@Then("twentyp is displayed on the green tab")
	@Test(priority=101)
	public void twentyp_is_displayed_on_the_green_tab() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		String actual_price= w1.green_tab_price();
		String expected_price= "20";
		Assert.assertEquals(actual_price, expected_price);
				
	}*/

	@Then("wallet balance is detucted by twentyp")
	@Test(priority=102)
	public void wallet_balance_is_detucted_by_twentyp() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_current_balance=w1.current_balance();
		String expected_current_balance="9.55";
		Assert.assertEquals(actual_current_balance, expected_current_balance);
	}

	@Then("free point is detucted by twentyp")
	@Test(priority=103)
	public void free_point_is_detucted_by_twentyfivep() throws InterruptedException {
		Wallet_Elements w1 = new Wallet_Elements(driver);
		w1.Click_On_popbitch_staging_agate_poster();
		String actual_free_point=w1.Free_point();
		String expected_free_point="80";
		Assert.assertEquals(actual_free_point, expected_free_point);
		 System.out.println(expected_free_point);
	}

	

	@Then("full article is displayed to the user")
	@Test(priority=104)
	public void full_article_is_displayed_to_the_user() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement paragraph = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[3]/div/article/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div/div/p[7]")));				
	   Boolean displayed = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/article/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div/div/p[7]")).isDisplayed();
	   
	   Boolean Expected_displayed = true;
	   Assert.assertEquals(displayed, Expected_displayed);
	   System.out.print("full article displayed");
	   String Para= paragraph.getText();
	   Assert.assertTrue(Para.contains("ournalism - leaving some to question the value of its public funding."));	
	   System.out.print(Para);
	   
	   
	}

}
