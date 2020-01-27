package Elements;


import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Register_Page_Elements1 {
	 public static String  randomEmail;
	
	 WebDriver driver_Register_Page_Elements;

	//login page elements finding
	By green_tab= By.id("agateposter");																					
	By Register_Page_email= By.id("email");																															//email text box
	By Register_Page_password= By.id("password");																													//password text box
	By Register_Page_Confirm_Password= By.id("password_confirmation");																									//confirm password textbox
	By Register_Page_topup_3= By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[2]");
	By Register_Page_topup_5= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[3]");											//top up 5 button
	By Register_Page_topup_1= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]");											//top up 5 button
	By Register_Page_pay_by_card=By.className("braintree-option__label");	//card payment button
	By Register_Page_Card_Number= By.id("credit-card-number");		//card number text box
	By Register_Page_Card_Expiry_Date= By.id("expiration");																											//card expiration date textbox
	By Register_Page_Terms_conditions_Checkbox= By.id("terms");																								//Terms & conditions check box
	By Register_Page_Privacy_checkbox= By.id("privacy");																										//privacy check box
	By Register_Page_marketing_checkbox= By.id("marketing_rejection");																									//marketing check box																						//over sixteen check box
	By Register_Page_Register_Button= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button")	;																									// Register button
	By Register_Page_Find_out_more_cookies= By.linkText("Find out more");	
	By Register_Page_cvv= By.id("cvv");
	By Register_Page_postcode=By.id("postal-code");
	By Register_Page_Voucher = By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/button[1]/div");
	
	By Register_Page_country = By.id("country");
	By Register_Page_state = By.id("state");
	By Register_Page_zip_code = By.id("zipcode");
	By Register_page_2_Continue = By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[2]/div");
	

	public Register_Page_Elements1(WebDriver driver_Register_Page_Elements2) {			//constructor
		this.driver_Register_Page_Elements= driver_Register_Page_Elements2;
	}
	
	public static String randomEmail() {
        return "jay" + UUID.randomUUID().toString() + "+test@gmail.com";   
	}

	public void Registration_Step1() throws InterruptedException {
		
		randomEmail = randomEmail();	
	
		driver_Register_Page_Elements.findElement(Register_Page_email).sendKeys(randomEmail);
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_password));
		driver_Register_Page_Elements.findElement(Register_Page_password).sendKeys("Ajjukanna1$$");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Confirm_Password));
		driver_Register_Page_Elements.findElement(Register_Page_Confirm_Password).sendKeys("Ajjukanna1$$");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Terms_conditions_Checkbox));
		Thread.sleep(6000);
		driver_Register_Page_Elements.findElement(Register_Page_Terms_conditions_Checkbox).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Privacy_checkbox));
		Thread.sleep(6000);
		driver_Register_Page_Elements.findElement(Register_Page_Privacy_checkbox).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_marketing_checkbox));
		Thread.sleep(6000);
		driver_Register_Page_Elements.findElement(Register_Page_marketing_checkbox).click();
		Thread.sleep(20000);
		
		driver_Register_Page_Elements.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button")).click();
		System.out.println("\n"+"Registered with the email "+ randomEmail +"\n");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_pay_by_card));
		
		}
	
	
	public void Registration_Step2() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_pay_by_card));
		driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();	
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Card_Number));
		driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("5573617070265811");
		driver_Register_Page_Elements.switchTo().defaultContent();
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Card_Expiry_Date));
		driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("1121");
		driver_Register_Page_Elements.switchTo().defaultContent();		
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-cvv");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_cvv));
		driver_Register_Page_Elements.findElement(Register_Page_cvv).sendKeys("690");
		driver_Register_Page_Elements.switchTo().defaultContent();	
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-postalCode");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_postcode));
		driver_Register_Page_Elements.findElement(Register_Page_postcode).sendKeys("E35QX");		
		Thread.sleep(3000);
		driver_Register_Page_Elements.switchTo().defaultContent();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_page_2_Continue));
		driver_Register_Page_Elements.findElement(Register_page_2_Continue).click();		
		System.out.println("\n"+"Registered with the email "+ randomEmail +"\n");		
	}
	
	public void click_continue_on_reg_page2() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_page_2_Continue));
		driver_Register_Page_Elements.findElement(Register_page_2_Continue).click();
	}
	
	public void Registration_Step2_without_continue() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_pay_by_card));
		driver_Register_Page_Elements.findElement(Register_Page_pay_by_card).click();
		
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-number");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Card_Number));
		driver_Register_Page_Elements.findElement(Register_Page_Card_Number).sendKeys("5573617070265811");
		driver_Register_Page_Elements.switchTo().defaultContent();
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-expirationDate");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_Card_Expiry_Date));
		driver_Register_Page_Elements.findElement(Register_Page_Card_Expiry_Date).sendKeys("1121");
		driver_Register_Page_Elements.switchTo().defaultContent();		
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-cvv");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_cvv));
		driver_Register_Page_Elements.findElement(Register_Page_cvv).sendKeys("690");
		driver_Register_Page_Elements.switchTo().defaultContent();	
		driver_Register_Page_Elements.switchTo().frame("braintree-hosted-field-postalCode");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_postcode));
		driver_Register_Page_Elements.findElement(Register_Page_postcode).sendKeys("E35QX");		
		Thread.sleep(3000);
		driver_Register_Page_Elements.switchTo().defaultContent();	
	}
	
	public void select_country_spain() throws InterruptedException{
	
	Select country = new Select(driver_Register_Page_Elements.findElement(Register_Page_country));
	country.selectByVisibleText("Spain");	
	}
	
	public void select_country_US() throws InterruptedException{
		
		Select country = new Select(driver_Register_Page_Elements.findElement(Register_Page_country));
		country.selectByVisibleText("United States");	
		}
	
	public boolean State_displayed_when_selected_us() {
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_state));
		//Select state = new Select(driver_Register_Page_Elements.findElement(Register_Page_state));
		Boolean State_displayed= driver_Register_Page_Elements.findElement(Register_Page_state).isDisplayed();
		return State_displayed;
	}
	
public void select_state_Alaska() throws InterruptedException{
	WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_state));
		Select state = new Select(driver_Register_Page_Elements.findElement(Register_Page_state));
		state.selectByVisibleText("Alaska");
	
		}


public void voucher_process() throws InterruptedException
{
	
	
	driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div")).click();
	Thread.sleep(2000);
	driver_Register_Page_Elements.findElement(By.id("voucher_code")).sendKeys("jay1111");
	Thread.sleep(1000);
	driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/button[1]/div/span")).click();
	Thread.sleep(3000);
	driver_Register_Page_Elements.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/section[1]/div/div[2]/label[1]")).click();
	Thread.sleep(1000);
	
}
public boolean Zipcode_displayed_when_selected_us() {
	WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_zip_code));
	//Select state = new Select(driver_Register_Page_Elements.findElement(Register_Page_state));
	Boolean zipcode_displayed= driver_Register_Page_Elements.findElement(Register_Page_zip_code).isDisplayed();
	return zipcode_displayed;
}
	public void enter_zipcode_for_alaska()
	{
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		WebElement zipcode= wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_zip_code));
		zipcode.sendKeys("99833");
		
	}
	public void click_on_pound_3() throws InterruptedException{	
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_topup_3));
		driver_Register_Page_Elements.findElement(Register_Page_topup_3).click();
	}
	

	public void click_on_pound_5() throws InterruptedException{	
		WebDriverWait wait = new WebDriverWait(driver_Register_Page_Elements, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Page_topup_5));
		driver_Register_Page_Elements.findElement(Register_Page_topup_5).click();
	}
}