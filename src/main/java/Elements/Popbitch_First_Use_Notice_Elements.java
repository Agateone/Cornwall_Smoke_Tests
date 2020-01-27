package Elements;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Popbitch_First_Use_Notice_Elements {

	WebDriver driver_PopbitchFirstUseNoticeElements;														//driver_PopbitchFirstUseNoticeElements
	
	//Popbitch First use Notice elements finding
	By green_tab= By.className("triangle__3TvaE");																	//green tab
	By Nav_To_First_Use_Stories= By.xpath("//*[@id=\"menu-item-35878\"]/a");								//stories
	By Nav_To_First_Use_PremiumStory= By.xpath("//*[@id=\"post-37523\"]/div/div[2]/header/h2/a");	//first premium story
	By First_use_Login=By.id("btn_login");							//login to agate
	By First_Use_CreateWallet= By.id("btn_cta");									//create wallet
	By First_Use_WhatIsAgate= By.linkText("What is Agate?");												//what is Agate
	
	

	//Constructor
	public Popbitch_First_Use_Notice_Elements(WebDriver driver_PopbitchFirstUseNoticeElements2) {							//constructor
		this.driver_PopbitchFirstUseNoticeElements= driver_PopbitchFirstUseNoticeElements2;
		}
	
	
	//Click on create wallet
	public void Click_On_Popbitch_First_Use_Notice_Create_Wallet() throws InterruptedException {	
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver_PopbitchFirstUseNoticeElements, 20);	
		WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__inpage_notices")));	
		driver_PopbitchFirstUseNoticeElements.switchTo().frame(frame);	
		WebElement Create_wallet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_cta")));
		((JavascriptExecutor) driver_PopbitchFirstUseNoticeElements).executeScript("arguments[0].scrollIntoView(true);", Create_wallet);
		Actions actions = new Actions(driver_PopbitchFirstUseNoticeElements);
		actions.moveToElement(Create_wallet).click().perform();			
		driver_PopbitchFirstUseNoticeElements.switchTo().defaultContent();	
		driver_PopbitchFirstUseNoticeElements.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}	
	
	//click on login button on popbitch FUN
	public void Click_On_Popbitch_First_Use_Notice_Login() throws InterruptedException {					//Login from popbitch First use Notice	
		WebDriverWait wait = new WebDriverWait(driver_PopbitchFirstUseNoticeElements, 20);	
		WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__inpage_notices")));	
		driver_PopbitchFirstUseNoticeElements.switchTo().frame(frame);	
		WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_login")));
		((JavascriptExecutor) driver_PopbitchFirstUseNoticeElements).executeScript("arguments[0].scrollIntoView(true);", Login);
		Actions actions = new Actions(driver_PopbitchFirstUseNoticeElements);
		actions.moveToElement(Login).click().perform();			
		driver_PopbitchFirstUseNoticeElements.switchTo().defaultContent();	
		driver_PopbitchFirstUseNoticeElements.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
	
	
	public boolean First_use_notice_displayed() throws InterruptedException
	{		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver_PopbitchFirstUseNoticeElements, 20);	
		WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframe__inpage_notices")));	
		driver_PopbitchFirstUseNoticeElements.switchTo().frame(frame);	
		WebElement Create_wallet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_cta")));
		((JavascriptExecutor) driver_PopbitchFirstUseNoticeElements).executeScript("arguments[0].scrollIntoView(true);", Create_wallet);
		Boolean displayed= Create_wallet.isDisplayed();
		return displayed;
		
	}
	
	
	
	
	
	
	public void click_on_green_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement svgobject = driver_PopbitchFirstUseNoticeElements.findElement(green_tab);
		Actions builder = new Actions(driver_PopbitchFirstUseNoticeElements);
		builder.click(svgobject).build().perform();
						
	}
	
	public void Popbitch_premium_Story_create_wallet__Displayed()													//Check if all elements displayed on First use notice
	{
		Boolean Pop_First_Use_Notice_Create_Wallet_Displayed = driver_PopbitchFirstUseNoticeElements.findElement(First_Use_CreateWallet).isDisplayed();
		if(Pop_First_Use_Notice_Create_Wallet_Displayed==true)
		{
			System.out.println("create wallet button present");
		}
		else
		{
			
			System.out.println("create wallet button not present, please check ");
			
		}
		}
	
	
	
	
	
	
		
	public void Click_On_Popbitch_First_Use_Notice_What_Is_Agate() {	
		//What is Agate from popbitch First use Notice
		driver_PopbitchFirstUseNoticeElements.findElement(First_Use_WhatIsAgate).click();
		}

	
	
	
	
	
	
	
	
	
	
	
}
