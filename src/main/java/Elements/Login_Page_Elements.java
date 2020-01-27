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

public class Login_Page_Elements {
WebDriver driver_Login_Page_Elements;

//login page elements finding
By green_tab= By.id("agateposter");																					
By Login_Page_email= By.id("email");											//email text box
By Login_Page_password= By.id("password");										//password text box
By Login_Page_remember_me= By.name("remember");									//remember me check box
By Login_Page_Login_Button= By.id("signInSubmit");								//sign in button
By Login_Page_register= By.linkText("Not registered? Register now!");			//Register link
By Login_Page_forgot_password= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/form/div[6]/div/a[2]");			//forgot password link
By Login_Page_cookies_findoutmore=By.linkText("Find out more");					//find out more cookies link

public Login_Page_Elements(WebDriver driver_Login_Page_Elements2) {				//constructor
	this.driver_Login_Page_Elements= driver_Login_Page_Elements2;
}

public void Click_On_Register_From_Login_Page()									//Click Register from login page
{									
	WebDriverWait wait = new WebDriverWait(driver_Login_Page_Elements, 20);				
	WebElement Register = wait.until(ExpectedConditions.visibilityOfElementLocated(Login_Page_register));
	((JavascriptExecutor) driver_Login_Page_Elements).executeScript("arguments[0].scrollIntoView(true);", Register);
	Actions actions = new Actions(driver_Login_Page_Elements);
	actions.moveToElement(Register).click().perform();		
	driver_Login_Page_Elements.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}



public void Login_Process() throws IOException, InterruptedException {	//enter values to login page elements and hit submit	
	WebDriverWait wait = new WebDriverWait(driver_Login_Page_Elements, 20);		
	wait.until(ExpectedConditions.visibilityOfElementLocated(Login_Page_email));
	driver_Login_Page_Elements.findElement(Login_Page_email).sendKeys("jayashree.kamineni90+live@gmail.com");
	driver_Login_Page_Elements.findElement(Login_Page_password).sendKeys("Ajjukanna1$$");
	driver_Login_Page_Elements.findElement(Login_Page_remember_me).click();
	}

public void click_on_login_button()
{	WebDriverWait wait = new WebDriverWait(driver_Login_Page_Elements, 20);		
	wait.until(ExpectedConditions.visibilityOfElementLocated(Login_Page_Login_Button));
	driver_Login_Page_Elements.findElement(Login_Page_Login_Button).click();
}

public void Capture_Login_Details() {											//display values of login page elements
	String Login_Page_email_value = driver_Login_Page_Elements.findElement(Login_Page_email).getAttribute("value");
	System.out.println(Login_Page_email_value);
	String Login_Page_password_value= driver_Login_Page_Elements.findElement(Login_Page_password).getAttribute("value");
	System.out.println(Login_Page_password_value);
	driver_Login_Page_Elements.findElement(Login_Page_remember_me).isSelected();
}
		


public void Click_on_Forgot_Password_link()										//Click on Forgot password from login page
{
	driver_Login_Page_Elements.findElement(Login_Page_forgot_password).click();
}

public void Click_On_Login_Page_Find_out_More()
{								//Find out more of cookies from login page
	driver_Login_Page_Elements.findElement(Login_Page_cookies_findoutmore).click();
}

}
