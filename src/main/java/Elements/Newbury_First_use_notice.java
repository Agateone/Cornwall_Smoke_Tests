package Elements;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newbury_First_use_notice {

	
	
	
	
	
	//Instantiate web driver
	WebDriver driver_newbury_First_Use_Notice;
	//Cornwall First use Notice elements
	By green_tab= By.className("triangle__3TvaE");																	//green tab		
	By newbury_First_use_Login=By.xpath("//*[@id=\"btn_login\"]");												//login to agate
	By newbury_First_Use_CreateWallet= By.xpath("//*[@id=\"btn_cta\"]");
	By newbury_First_Use_I_Got_Digital_Subs = By.xpath("//*[@id=\"first_use__btn_subscribe\"]");
	By newbury_First_Use_Learn_More = By.xpath("/html/body/div/div/div/div/div/section/button[2]");	
	
	public Newbury_First_use_notice(WebDriver driver_newbury_First_Use_Notice2) {							//constructor
		this.driver_newbury_First_Use_Notice= driver_newbury_First_Use_Notice2;
		}



	public void Click_On_newbury_First_use_Login_button() throws InterruptedException {					
		JavascriptExecutor js = (JavascriptExecutor)driver_newbury_First_Use_Notice;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		WebElement frame = 	driver_newbury_First_Use_Notice.findElement(By.xpath("//*[@id=\"iframe__inpage_notices\"]"));
		driver_newbury_First_Use_Notice.switchTo().frame(frame);
		WebElement newbury_First_use_Login= driver_newbury_First_Use_Notice.findElement(By.id("btn_login"));
		JavascriptExecutor executor = (JavascriptExecutor)driver_newbury_First_Use_Notice;
		executor.executeScript("arguments[0].click();", newbury_First_use_Login);		
		}


	public void Click_On_newbury_First_Use_CreateWallet() throws InterruptedException, IOException {						
		JavascriptExecutor js = (JavascriptExecutor)driver_newbury_First_Use_Notice;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);			
		WebElement frame = 	driver_newbury_First_Use_Notice.findElement(By.xpath("//*[@id=\"iframe__inpage_notices\"]"));
		driver_newbury_First_Use_Notice.switchTo().frame(frame);	
		WebElement newbury_First_Use_CreateWallet= driver_newbury_First_Use_Notice.findElement(By.xpath("//*[@id=\"btn_cta\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver_newbury_First_Use_Notice;
		executor.executeScript("arguments[0].click();", newbury_First_Use_CreateWallet);
		driver_newbury_First_Use_Notice.switchTo().defaultContent();
		}

	
	
	
	
}
