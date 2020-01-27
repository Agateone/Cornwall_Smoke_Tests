package Elements;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Cricketer_first_use_notice_Elements {

WebDriver driver;														//driver
	
	//Cricketer First use Notice elements finding
	By green_tab= By.className("triangle__3TvaE");																	//green tab
								//stories
	
	By Cricketer_First_use_Login=By.xpath("/html/body/div/div/div/div/section/section[2]/button[1]");												//login to agate
	By Cricketer_First_Use_CreateWallet= By.xpath("//*[@id=\"first_use__btn_pay\"]");
	By Cricketer_First_Use_I_Got_Digital_Subs = By.xpath("/html/body/div/div/div/div/section/section[2]/button[2]");
	By Cricketer_First_use_Login_button = By.xpath("/html/body/div/div/div/div/section/section[2]/button[1]");
	By Cricketer_First_Use_Subscribe_to_cricketers_magazine = By.xpath("/html/body/div/div/div/div/section/section[2]/button[3]");
	By Cricketer_First_Use_Learn_More = By.xpath("/html/body/div/div/div/div/section/button[2]");
	By Cricketer_First_use_Pop_Up_Price_Per_Article = By.xpath("//*[@id=\"__currency__amount\"]");
	By Cricketer_First_use_Pop_Up_Free_point = By.xpath("//*[@id=\"__currency__amount\"]");
	By Cricketer_First_use_Pop_Up_Free_Period = By.xpath("/html/body/div/div/div/div/section/section[1]/p[2]/text()[2]");
	By Cricketer_first_use_Learn_More_Here = By.linkText("here");
	By Cricketer_First_Use_learn_more_faq= By.linkText("our FAQs");
	By Cricketer_First_Use_Learn_More_Cricketer_Magazine_digital_subscription = By.xpath("/html/body/div/div/div/div/section/section[3]/div/p[4]/text()");
	By Cricketer_First_Use_Learn_More_reaction = By.linkText("reaction.life");
	By Cricketer_First_Use_Learn_More_popbitch = By.linkText("popbitch.com");
	By Cricketer_First_Use_Learn_More_TNE = By.linkText("theneweuropean.co.uk");
	By Cricketer_First_Use_Learn_More_completefrance = By.linkText("reaction.life");
			
	
	


	public Cricketer_first_use_notice_Elements(WebDriver driver_Cricketer_first_use_notice2) {							//constructor
		this.driver= driver_Cricketer_first_use_notice2;
		}
	
	public void click_on_green_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement svgobject = driver.findElement(green_tab);
		Actions builder = new Actions(driver);
		builder.click(svgobject).build().perform();
						
	}
	
	
	
	
		
		
		
	
	//Clicking on buttons and links
	
	public void Click_On_Cricketer_First_use_Login_button() throws InterruptedException {					
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__inpage_notices")));	
		driver.switchTo().frame(frame);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_login")));
		WebElement yourelement= driver.findElement(By.id("btn_login"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", yourelement);				
		driver.switchTo().defaultContent();	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		
		}
	
	public void Click_On_Cricketer_First_Use_CreateWallet() throws InterruptedException {					
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__inpage_notices")));	
		driver.switchTo().frame(frame);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_cta")));	
		WebElement yourelement= driver.findElement(By.id("btn_cta"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", yourelement);				
		driver.switchTo().defaultContent();	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
	
	public void Click_On_Cricketer_First_Use_I_Got_Digital_Subs() throws InterruptedException {					
		Thread.sleep(4000);
		driver.findElement(Cricketer_First_Use_I_Got_Digital_Subs).click();
		}
	
	public void Click_On_Cricketer_First_Use_Subscribe_to_cricketers_magazine() throws InterruptedException {										
		Thread.sleep(2000);
		
		driver.findElement(Cricketer_First_Use_Subscribe_to_cricketers_magazine).click();
		}
		
	public void Click_On_Cricketer_First_Use_Learn_More() {										
		driver.findElement(Cricketer_First_Use_Learn_More).click();
		}

	public void Click_On_Cricketer_first_use_Learn_More_Here() {										
		driver.findElement(Cricketer_first_use_Learn_More_Here).click();
		}
	
	public void Click_On_Cricketer_First_Use_learn_more_faq() {										
		driver.findElement(Cricketer_First_Use_learn_more_faq).click();
		}
	
	
	public void Click_On_Cricketer_First_Use_Learn_More_reaction() {										
		driver.findElement(Cricketer_First_Use_Learn_More_reaction).click();
		}
	
	public void Click_On_Cricketer_First_Use_Learn_More_popbitch() {										
		driver.findElement(Cricketer_First_Use_Learn_More_popbitch).click();
		}
	
	
	public void Cricketer_First_Use_Learn_More_TNE() {										
		driver.findElement(Cricketer_First_Use_Learn_More_popbitch).click();
		}
	
	

	//getting Price per articles and free points and environments
	
	public String Cricketer_First_use_get_price_per_article() 
	{										
		String Cricketer_First_use_Price_Per_Article_text= driver.findElement(Cricketer_First_use_Pop_Up_Price_Per_Article).getText();
	return 	Cricketer_First_use_Price_Per_Article_text;	
	}

	public String Cricketer_first_use_get_free_point() 
	{										
		String Cricketer_frist_use_free_point_text= driver.findElement(Cricketer_First_use_Pop_Up_Free_point).getText();
	return 	Cricketer_frist_use_free_point_text;	
	}
	
	public String Cricketer_first_use_get_free_period() 
	{										
		String Cricketer_frist_use_free_period_Text= driver.findElement(Cricketer_First_use_Pop_Up_Free_Period).getText();
	return 	Cricketer_frist_use_free_period_Text;	
	}
	
	public String Cricketer_First_Use_Learn_More_Cricketer_Magazine() 
	{										
		String Cricketer_First_Use_Learn_More_Cricketer_Magazine_digital_subscription_Text= driver.findElement(Cricketer_First_Use_Learn_More_Cricketer_Magazine_digital_subscription).getText();
	return 	Cricketer_First_Use_Learn_More_Cricketer_Magazine_digital_subscription_Text;	
	}
	
	
	
	public String Cricketer_First_Use_Learn_More_digital_subscription() 
	{										
		String Cricketer_First_Use_Learn_More_digital_subscription_Text= driver.findElement(Cricketer_First_Use_Learn_More_Cricketer_Magazine_digital_subscription).getText();
	return 	Cricketer_First_Use_Learn_More_digital_subscription_Text;	
	}
	
	
	//getting texts on buttons and lables
	
	public String Cricketer_First_use_Login_spell_check() 
	{		
		String Cricketer_First_use_Login_spell_check= driver.findElement(Cricketer_First_use_Login).getText();
	return 	Cricketer_First_use_Login_spell_check;	
	}

	public String Cricketer_First_use_pay_per_article_spell_check() 
	{										
		String Cricketer_First_use_pay_per_article_spell_check= driver.findElement(Cricketer_First_use_Login).getText();
	return 	Cricketer_First_use_pay_per_article_spell_check;	
	}
	
	
	public String Cricketer_First_Use_I_Got_Digital_Subs_spell_check() 
	{										
		String Cricketer_First_Use_I_Got_Digital_Subs_spell_check= driver.findElement(Cricketer_First_Use_I_Got_Digital_Subs).getText();
	return 	Cricketer_First_Use_I_Got_Digital_Subs_spell_check;	
	}
	
	public String Cricketer_First_Use_Learn_More_Spell_check() 
	{										
		String Cricketer_First_Use_Learn_More_Spell_check= driver.findElement(Cricketer_First_Use_Learn_More).getText();
	return 	Cricketer_First_Use_Learn_More_Spell_check;	
	}
	
	public String Cricketer_First_Use_Subscribe_to_cricketers_magazine_Spell_check() 
	{										
		String Cricketer_First_Use_Subscribe_to_cricketers_magazine_Spell_check= driver.findElement(Cricketer_First_Use_Subscribe_to_cricketers_magazine).getText();
	return 	Cricketer_First_Use_Subscribe_to_cricketers_magazine_Spell_check;	
	}
	

}
