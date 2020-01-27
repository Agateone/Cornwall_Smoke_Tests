package Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popbitch_Logged_Out_Wallet {

	WebDriver driver_Logged_out_wallet;

		By green_tab= By.id("agateposter");
		By Register_button= By.linkText("REGISTER");
		By Login_button= By.linkText("LOGIN");
	
		public Popbitch_Logged_Out_Wallet(WebDriver driver_Logged_out_wallet2) {				//constructor
			this.driver_Logged_out_wallet= driver_Logged_out_wallet2;
		}
		
		
	//Click on green tab
	public void Click_On_popbitch_agate_poster()	
		{
			WebDriverWait wait = new WebDriverWait(driver_Logged_out_wallet, 20);			
			WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("agateposter")));			
			Actions actions = new Actions(driver_Logged_out_wallet);
			actions.moveToElement(element);
			actions.click().perform();
		}
	
	
	//Click on Wallet Register Button
	public void Click_On_popbitch_wallet_register_button() throws InterruptedException	
		{	driver_Logged_out_wallet.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Logged_out_wallet, 20);
			driver_Logged_out_wallet.switchTo().frame("iframe__wallet");	
			WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(Register_button));				
			Actions actions = new Actions(driver_Logged_out_wallet);
			actions.moveToElement(element);
			actions.click().perform();
			driver_Logged_out_wallet.switchTo().defaultContent();
		}
		
	
	//Click on Wallet Login Button
			public void Click_On_popbitch_wallet_Login_button() throws InterruptedException	
				{	driver_Logged_out_wallet.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					WebDriverWait wait = new WebDriverWait(driver_Logged_out_wallet, 20);
					driver_Logged_out_wallet.switchTo().frame("iframe__wallet");	
					WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(Login_button));				
					Actions actions = new Actions(driver_Logged_out_wallet);
					actions.moveToElement(element);
					actions.click().perform();
					driver_Logged_out_wallet.switchTo().defaultContent();
				}
				
		
	

	
	
	
}
