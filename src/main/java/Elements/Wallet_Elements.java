package Elements;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wallet_Elements {

	WebDriver driver_Popbitch_Wallet_Elements_staging;

	//login page elements finding
	By green_tab= By.xpath("//*[@id=\"wallet\"]/span/div/div[2]/div/div[2]/svg");																	
	By Popbitch_Wallet_Elements_staging_current_total_balance= By.id("total_amount__currency__amount");	
	By Popbitch_Wallet_Elements_staging_current_wallet_balance= By.id("wallet_amount__currency__amount");
	By Popbitch_Wallet_Elements_staging_current_bonus_amount= By.id("bonus_amount__currency__amount");
	By Popbitch_Wallet_Elements_staging_topup_button= By.xpath("/html/body/div/div/div/div/div/div[1]/div/div[3]/button");									//password text box
	By Popbitch_Wallet_Elements_staging_publication_name= By.xpath("//*[@id=\"wallet\"]/div[2]/div/div[2]/p[1]");								//remember me check box
	By Popbitch_Wallet_Elements_staging_price_per_article= By.xpath("//*[@id=\"wallet__price_per_article__currency__amount\"]");								//sign in button
	By Popbitch_Wallet_Elements_staging_current_free_point_balance= By.id("gauge__per_article__currency__amount");
	By Popbitch_wallet_settings_button = By.id("wallet");
	By Popbitch_Account_button = By.xpath("/html/body/div/div/div/div/div/div[2]/section/div/ul/li[1]/a");
	public Wallet_Elements(WebDriver driver_Popbitch_Wallet_Elements_staging2) {				//constructor
		this.driver_Popbitch_Wallet_Elements_staging= driver_Popbitch_Wallet_Elements_staging2;
	}
	
	public void Click_On_popbitch_staging_agate_poster()	
	{
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("agateposter")));				
		Actions actions = new Actions(driver_Popbitch_Wallet_Elements_staging);
		actions.moveToElement(element);
		actions.click().perform();
	}
	
	
	public void Click_On_popbitch_wallet_Top_up() throws InterruptedException									//Click on topup in the wallet
	{	WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Popbitch_Wallet_Elements_staging_topup_button));
		driver_Popbitch_Wallet_Elements_staging.findElement(Popbitch_Wallet_Elements_staging_topup_button).click();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
	}

	public String current_balance() throws InterruptedException // current wallet balance
	{
		
				Thread.sleep(2000);
				driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
				String current_Balance = driver_Popbitch_Wallet_Elements_staging.findElement(Popbitch_Wallet_Elements_staging_current_total_balance).getText();
				driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
				return current_Balance;
				
	}
	
	
	
	public void flip_wallet()
	{
		
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");		
		WebElement settings = wait.until(ExpectedConditions.visibilityOfElementLocated(Popbitch_wallet_settings_button));
		Actions actions = new Actions(driver_Popbitch_Wallet_Elements_staging);
		actions.moveToElement(settings);
		actions.click().perform();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		
	}
	
	public void click_on_account()
	{
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");		
		WebElement account = wait.until(ExpectedConditions.visibilityOfElementLocated(Popbitch_Account_button));
		account.click();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
	}
	
	public String Free_point()throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Popbitch_Wallet_Elements_staging_current_free_point_balance));
		String current_Free_Point = driver_Popbitch_Wallet_Elements_staging.findElement(Popbitch_Wallet_Elements_staging_current_free_point_balance).getText();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return current_Free_Point;
		
	}
	
	
	public String Free_point_free()throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
		String current_Free_Point = driver_Popbitch_Wallet_Elements_staging.findElement(By.className("textInsideGauge_perArticle__rhWV2")).getText();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return current_Free_Point;
		
	}
	
	
	public String price_per_article_on_wallet() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");
		String Popbitch_wallet_price_per_article = driver_Popbitch_Wallet_Elements_staging.findElement(Popbitch_Wallet_Elements_staging_price_per_article).getText();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return Popbitch_wallet_price_per_article;
		
	}
	
	
	public String green_tab_price()
	{
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("__currency__amount")));	
		//WebElement element = driver_Popbitch_Wallet_Elements_staging.findElement(By.id("__currency__amount"));
		String price= element.getText();
		System.out.print(price);
		return price;
		
	}
	
	public String updates_on_date()
	{
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");		
		WebElement updates_on = driver_Popbitch_Wallet_Elements_staging.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/section/main/div/div[2]/div[1]/p[1]"));
		
		String updates_date= updates_on.getText();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
				return updates_date;		
	}
	
	public void Click_authy_OFF()
	{
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");				
		driver_Popbitch_Wallet_Elements_staging.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/section/main/div/div[2]/div[2]/div")).click();
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		
	}
	public String Get__free_period()
	{
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");			
		String free_ponint_date= driver_Popbitch_Wallet_Elements_staging.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div/div[4]/div[3]/div/p[2]")).getText();
		System.out.print(free_ponint_date);
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return free_ponint_date;
	}
	
	public String Wallet_Free_point_Date(){
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");		
		String free_ponint_date= driver_Popbitch_Wallet_Elements_staging.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div/div[4]/div[3]/div/p[2]/span/text()[2]")).getText();
		System.out.println(free_ponint_date);
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return free_ponint_date;
		
		
	}
	
	public String Wallet_Free_point_Time(){
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Wallet_Elements_staging, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__wallet")));
		driver_Popbitch_Wallet_Elements_staging.switchTo().frame("iframe__wallet");			
		String free_ponint_time= driver_Popbitch_Wallet_Elements_staging.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div/div[4]/div[3]/div/p[2]/span/text()[1]")).getText();
		System.out.println(free_ponint_time);
		driver_Popbitch_Wallet_Elements_staging.switchTo().defaultContent();
		return free_ponint_time;
	
	
}
	
	
	
	public String get_expected_free_period_time() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Calendar calendar = Calendar.getInstance();
		Date DateTime_expected_free_period = calendar.getTime();
		String expected_free_period_time = sdf.format(DateTime_expected_free_period);	
		return expected_free_period_time;
	}
	
	
}
