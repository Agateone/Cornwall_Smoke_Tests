package Elements;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Authorise_charge_notice_popbitch {
	//Initiate web driver
	WebDriver driver_Authorise_charge_notice_popbitch;
	//get elements 
	By Authorise_charge_notice_popbitch_on= By.className("switch__1WB6F false");	
	By Authorise_charge_notice_popbitch_on_continue_reading=By.id("agate_payNow");
	//constructor
	public Authorise_charge_notice_popbitch(WebDriver driver_Authorise_charge_notice_popbitch2) 
	{
	this.driver_Authorise_charge_notice_popbitch= driver_Authorise_charge_notice_popbitch2;
	}
	//Function to switch authorise charge button to on 
	public void authorise_charge_on()
	{
	driver_Authorise_charge_notice_popbitch.switchTo().frame("iframe__inpage_notices");
	driver_Authorise_charge_notice_popbitch.findElement(Authorise_charge_notice_popbitch_on).click();
	driver_Authorise_charge_notice_popbitch.switchTo().defaultContent();
	}
	//Function to click on continue of authorise charge notice
	public void authorise_charge_notice_click_continue() throws IOException, InterruptedException{
	//switch to frame
	WebElement frame =driver_Authorise_charge_notice_popbitch.findElement((By.id("iframe__inpage_notices")));
	WebDriverWait wait = new WebDriverWait(driver_Authorise_charge_notice_popbitch,5);
	wait.until(ExpectedConditions.visibilityOf(frame));
	driver_Authorise_charge_notice_popbitch.switchTo().frame(frame);
	//authorise charge on
	WebElement authy_on= driver_Authorise_charge_notice_popbitch.findElement(Authorise_charge_notice_popbitch_on_continue_reading);
	wait.until(ExpectedConditions.visibilityOf(authy_on));
	authy_on.click();
	//continue reading button
	WebElement continue_reading= driver_Authorise_charge_notice_popbitch.findElement(Authorise_charge_notice_popbitch_on_continue_reading);
	wait.until(ExpectedConditions.visibilityOf(continue_reading));
	continue_reading.click();
	driver_Authorise_charge_notice_popbitch.switchTo().defaultContent();
}
}