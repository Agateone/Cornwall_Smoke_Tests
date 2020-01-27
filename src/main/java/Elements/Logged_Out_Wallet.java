package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logged_Out_Wallet {
	
	WebDriver driver;
	
	
	//login page elements finding
		By green_tab= By.id("Page-1");													
		By Register_button_logged_out_wallet= By.xpath("/html/body/div/div/div/div/div/span[1]/a");
		By Login_button_logged_out_wallet= By.id("wallet_amount__currency__amount");
		

		public Logged_Out_Wallet(WebDriver driver1) {				//constructor
			this.driver= driver1;
		}
	
		
		
		
		
		public void Click_on_agate_green_tab()									//Click on the green tab to open the wallet
		{
			driver.findElement(green_tab).click();
		}
		
		
		public void Click_on_register_button_on_loggedout_wallet() throws InterruptedException									//Click on register button on the wallet
		{	Thread.sleep(3000);
		driver.switchTo().frame("iframe__wallet");
		
		driver.findElement(Register_button_logged_out_wallet).click();
		driver.switchTo().defaultContent();
		}

		public void Click_on_Login_button_on_loggedout_wallet() throws InterruptedException									//Click on Login Button on the wallet
		{	Thread.sleep(3000);
			driver.switchTo().frame("iframe__wallet");
		
		driver.findElement(Login_button_logged_out_wallet).click();
		driver.switchTo().defaultContent();
		}



}
