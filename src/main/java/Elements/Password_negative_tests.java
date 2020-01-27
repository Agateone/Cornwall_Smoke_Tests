package Elements;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

public class Password_negative_tests {

	
	 WebDriver driver_Password_negative_tests;

	//login page elements finding
	By green_tab= By.id("agateposter");																					
	By Register_Page_email= By.id("email");																															//email text box
	By Register_Page_password= By.id("password");																													//password text box
	By Register_Page_Confirm_Password= By.id("password_confirmation");																									//confirm password textbox
	By Register_Page_topup_3= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/section[1]/div/div[2]/label[1]");
	By Register_Page_topup_5= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/section[1]/div/div[2]/label[2]");											//top up 5 button
	By Register_Page_topup_8= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/section[1]/div/div[2]/label[3]");											//top up 5 button
	By Register_Page_pay_by_card=By.className("braintree-option__label");	//card payment button
	By Register_Page_Card_Number= By.name("credit-card-number");			//card number text box
	By Register_Page_Card_Expiry_Date= By.id("expiration");																											//card expiration date textbox
	By Register_Page_Terms_conditions_Checkbox= By.id("terms");																								//Terms & conditions check box
	By Register_Page_Privacy_checkbox= By.id("privacy");																										//privacy check box
	By Register_Page_marketing_checkbox= By.id("marketing_rejection");																									//marketing check box																						//over sixteen check box
	By Register_Page_Register_Button= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/button")	;																									// Register button
	By Register_Page_Find_out_more_cookies= By.linkText("Find out more");	
	
	By Register_Page_Voucher = By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/button[1]/div");
	//find out more link
	
	By Register_Page_country = By.id("country");
	By Register_page_2_Continue = By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[2]/div[2]/div/form/button[2]/div/span");
	

	public Password_negative_tests(WebDriver driver_Password_negative_tests2) {			//constructor
		this.driver_Password_negative_tests= driver_Password_negative_tests2;
	}

	/*public void Register_Page_Elements_Displayed()										//Elements Display
	{
		Boolean Login_Page_Email_Box_Displayed = driver_Login_Page_Elements.findElement(Login_Page_email).isDisplayed();
		System.out.println(Login_Page_Email_Box_Displayed);
		Boolean Login_Page_Password_box_Displayed = driver_Login_Page_Elements.findElement(Login_Page_password).isDisplayed();
		System.out.println(Login_Page_Password_box_Displayed);
		Boolean Login_Page_Remember_Me_Button_Displayed = driver_Login_Page_Elements.findElement(Login_Page_remember_me).isDisplayed();
		System.out.println(Login_Page_Remember_Me_Button_Displayed);
		Boolean Login_Page_Login_Button_Displayed = driver_Login_Page_Elements.findElement(Login_Page_Login_Button).isDisplayed();
		System.out.println(Login_Page_Login_Button_Displayed);
		Boolean Login_Page_Register_Button_Displayed = driver_Login_Page_Elements.findElement(Login_Page_register).isDisplayed();
		System.out.println(Login_Page_Register_Button_Displayed);
		Boolean Login_Page_Forgot_Password_Link_Displayed = driver_Login_Page_Elements.findElement(Login_Page_forgot_password).isDisplayed();
		System.out.println(Login_Page_Forgot_Password_Link_Displayed);
		Boolean Login_Page_Cookies_FindoutMore_Link_Displayed = driver_Login_Page_Elements.findElement(Login_Page_cookies_findoutmore).isDisplayed();
		System.out.println(Login_Page_Cookies_FindoutMore_Link_Displayed);
	}*/


	public void Registration_Process() throws InterruptedException, IOException  {		//enter values to Register page elements and hit Register
		
		FileReader file = new FileReader("/Users/jay/Desktop/auto.txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(file);
		String inputData = br.readLine();
		
		
		driver_Password_negative_tests.findElement(Register_Page_email).sendKeys(inputData);
		Thread.sleep(1000);
		driver_Password_negative_tests.findElement(Register_Page_password).sendKeys("ajjukanna");
		Thread.sleep(400);
		driver_Password_negative_tests.findElement(Register_Page_Confirm_Password).sendKeys("ajjuka");
		driver_Password_negative_tests.findElement(Register_Page_Confirm_Password).clear();
		driver_Password_negative_tests.findElement(Register_Page_Confirm_Password).sendKeys("ajjukanna");
		driver_Password_negative_tests.findElement(Register_Page_Terms_conditions_Checkbox).click();
		Thread.sleep(400);
		driver_Password_negative_tests.findElement(Register_Page_Privacy_checkbox).click();
		Thread.sleep(400);
		driver_Password_negative_tests.findElement(Register_Page_marketing_checkbox).click();
		Thread.sleep(400);
		Thread.sleep(400);
		driver_Password_negative_tests.findElement(Register_Page_Register_Button).click();
		Thread.sleep(10000);
		
		driver_Password_negative_tests.findElement(Register_Page_topup_3).click();
		Thread.sleep(2000);
		driver_Password_negative_tests.findElement(Register_Page_pay_by_card).click();
		System.out.println("\n"+"clciked on credit card"+"\n");
		Thread.sleep(2000);
		driver_Password_negative_tests.switchTo().frame("braintree-hosted-field-number");
		
		driver_Password_negative_tests.findElement(Register_Page_Card_Number).sendKeys("4111111111111111");
		Thread.sleep(400);
		driver_Password_negative_tests.switchTo().defaultContent();
		driver_Password_negative_tests.switchTo().frame("braintree-hosted-field-expirationDate");
		driver_Password_negative_tests.findElement(Register_Page_Card_Expiry_Date).sendKeys("0319");
		Thread.sleep(400);
		driver_Password_negative_tests.switchTo().defaultContent();
		
		driver_Password_negative_tests.findElement(Register_page_2_Continue).click();
		
		System.out.println("\n"+"Registered with the email "+ inputData +"\n");
		
	}



	/*public void Capture_Login_Details() {											//display values of login page elements
		String Login_Page_email_value = driver_Login_Page_Elements.findElement(Login_Page_email).getAttribute("value");
		System.out.println(Login_Page_email_value);
		String Login_Page_password_value= driver_Login_Page_Elements.findElement(Login_Page_password).getAttribute("value");
		System.out.println(Login_Page_password_value);
		driver_Login_Page_Elements.findElement(Login_Page_remember_me).isSelected();
	}
			
	public void Click_On_Register_From_Login_Page()									//Click Register from login page
	{
		driver_Login_Page_Elements.findElement(Login_Page_register).click();
	}

	public void Click_on_Forgot_Password_link()										//Click on Forgot password from login page
	{
		driver_Login_Page_Elements.findElement(Login_Page_forgot_password).click();
	}

	public void Click_On_Login_Page_Find_out_More()
	{								//Find out more of cookies from login page
		driver_Login_Page_Elements.findElement(Login_Page_cookies_findoutmore).click();
	}
*/
	
	}
	
