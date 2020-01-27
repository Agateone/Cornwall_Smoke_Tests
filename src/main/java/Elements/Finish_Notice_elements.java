package Elements;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Finish_Notice_elements {
//Instantiate web driver	
	
	WebDriver driver_Popbitch_Finish_Notice_elements;
//Get all finish notice elements of popbitch
	
	By Popbitch_Finish_Notice_authorise_me_button= By.className("switchWrapper__10FCJ");
	By Popbitch_Finish_Notice_marketing_check_box= By.name("marketing_checkbox__21G4O");			
	By Popbitch_Finish_Notice_ok_button= By.id("finish_button");
	By Popbitch_Finish_Notice_learn_more=By.linkText("Learn more");
	
	
//constructor
	
	public Finish_Notice_elements(WebDriver driver_Popbitch_Finish_Notice_elements2) 
	{
	this.driver_Popbitch_Finish_Notice_elements= driver_Popbitch_Finish_Notice_elements2;
	}
	
	//click Off on finish notice and click ok
	public void popbitch_click_on_authy_and_ok() throws InterruptedException, IOException {				
		WebDriverWait wait = new WebDriverWait(driver_Popbitch_Finish_Notice_elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"iframe__popup_notices\"]")));
		WebElement frame = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"iframe__popup_notices\"]"));		
		driver_Popbitch_Finish_Notice_elements.switchTo().frame(frame);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish_notice__auto_charge__switch\"]")));
		WebElement authorise_button = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"finish_notice__auto_charge__switch\"]"));		
		JavascriptExecutor executor1 = (JavascriptExecutor) driver_Popbitch_Finish_Notice_elements;
		executor1.executeScript("arguments[0].click();", authorise_button);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish_button\"]")));
		driver_Popbitch_Finish_Notice_elements.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement authorise = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"finish_button\"]"));		
		JavascriptExecutor executor = (JavascriptExecutor) driver_Popbitch_Finish_Notice_elements;
		executor.executeScript("arguments[0].click();", authorise);
		driver_Popbitch_Finish_Notice_elements.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver_Popbitch_Finish_Notice_elements.switchTo().defaultContent();
	}
	
	
	
	public void popbitch_click_ok_on_finish_notice() throws InterruptedException {
		
Thread.sleep(4000);
		WebElement frame = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("/html/body/div[1]/div/span[3]/div/div/iframe"));
		
		driver_Popbitch_Finish_Notice_elements.switchTo().frame(frame);	
		Thread.sleep(4000);
		WebElement authorise = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"finish_button\"]"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver_Popbitch_Finish_Notice_elements;
		executor.executeScript("arguments[0].click();", authorise);
		
		driver_Popbitch_Finish_Notice_elements.switchTo().defaultContent();
		
	}
//verify that the finish notice appears
	
	public Boolean Verify_finish_notice_appears() throws InterruptedException
	{	
		
		WebElement frame = driver_Popbitch_Finish_Notice_elements.findElement(By.xpath("//*[@id=\"iframe__popup_notices\"]"));
		driver_Popbitch_Finish_Notice_elements.switchTo().frame(frame);
		Boolean Actual_result = driver_Popbitch_Finish_Notice_elements.findElement(Popbitch_Finish_Notice_ok_button).isEnabled();
		driver_Popbitch_Finish_Notice_elements.switchTo().defaultContent();
		return Actual_result;
	}

//Click on popbitch finish notice OK button
	
	/*public void click_on_popbitch_finish_Notice_ok() throws InterruptedException, IOException
	{	Thread.sleep(3000);
	system.out.println("clck on popbich 
		driver_Popbitch_Finish_Notice_elements.switchTo().frame("iframe__popup_notices");
		driver_Popbitch_Finish_Notice_elements.findElement(Popbitch_Finish_Notice_ok_button).click();
		driver_Popbitch_Finish_Notice_elements.switchTo().defaultContent();
		Thread.sleep(8000);
		String screenshot_name= "Popbitch_Finish_notice_click_on_button_authorise_charge_appears";
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File scrFile = ((TakesScreenshot)driver_Popbitch_Finish_Notice_elements).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile, new File("/Users/jay/Desktop/api/"+screenshot_name +"_"+timestamp+"_"+"jpg" ));
	}	*/
}
