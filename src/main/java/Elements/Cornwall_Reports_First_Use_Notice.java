package Elements;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cornwall_Reports_First_Use_Notice {

	//Instantiate web driver
	WebDriver driver;
	//Cornwall First use Notice elements
	By green_tab= By.className("triangle__3TvaE");																	//green tab		
	By Cornwall_First_use_Login=By.xpath("//*[@id=\"first_use__btn_login\"]");												//login to agate
	By Cornwall_First_Use_CreateWallet= By.xpath("//*[@id=\"first_use__btn_pay\"]");
	By Cornwall_First_Use_I_Got_Digital_Subs = By.xpath("//*[@id=\"first_use__btn_subscribe\"]");
	By Cornwall_First_Use_Learn_More = By.xpath("/html/body/div/div/div/div/div/section/button[2]");	
	
	public Cornwall_Reports_First_Use_Notice(WebDriver driver1) {							//constructor
		this.driver= driver1;
		}
		
	public void click_on_green_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement svgobject = driver.findElement(green_tab);
		Actions builder = new Actions(driver);
		builder.click(svgobject).build().perform();						
	}
	
	public void Click_On_Cornwall_First_use_Login_button() throws InterruptedException {					
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
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
	
	public void Click_On_Cornwall_First_Use_CreateWallet() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
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

	
}
