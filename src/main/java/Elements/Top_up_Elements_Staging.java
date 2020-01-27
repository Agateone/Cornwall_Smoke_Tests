package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Top_up_Elements_Staging {

	WebDriver driver_Top_up_Elements_Staging;

	//login page elements finding
	By Top_up_Elements_Staging_rechage_with_3= By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[1]/div/div/div[2]/label[1]");
	By Top_up_Elements_Staging_rechage_with_5= By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[1]/div/div/div[2]/label[2]");
	By Top_up_Elements_Staging_rechage_with_8= By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[1]/div/div/div[2]/label[3]");
	By Top_up_Elements_Staging_select_card= By.xpath("//*[@id=\"braintree--dropin__a35c13e0-8bfb-41cb-a2b1-1a63f694f452\"]/div[1]/div[6]/div[2]/div/div[1]/div[2]");	
	By Top_up_Elements_Staging_card_number= By.name("credit-card-number");
	By Top_up_Elements_Staging_choose_another_way = By.xpath("//*[@id=\"braintree--dropin__1dc5b519-c470-4a86-bcc8-0483ed288227\"]/div[1]/div[7]/span");
	By Top_up_Elements_Staging_card_expiry_date= By.name("expiration");
	By Top_up_Elements_Staging_topup_button= By.id("submit-button");
	

	public Top_up_Elements_Staging(WebDriver driver_Top_up_Elements_Staging2) {				//constructor
		this.driver_Top_up_Elements_Staging= driver_Top_up_Elements_Staging2;
	}
	
	public void Click_On_3_recharge() throws InterruptedException									//Click on the green tab to open the wallet
	{   Thread.sleep(3000);
	//driver_Top_up_Elements_Staging.manage().window().maximize();
		driver_Top_up_Elements_Staging.findElement(Top_up_Elements_Staging_rechage_with_3).click();
		Thread.sleep(5000);
	}
	
	
	public void topup_process_from_wallet_staging_popbitch() throws InterruptedException									//Click on topup in the wallet
	{	
		//Thread.sleep(8000);
		//driver_Top_up_Elements_Staging.findElement(Top_up_Elements_Staging_choose_another_way).click();
		//Thread.sleep(3000);
		//driver_Top_up_Elements_Staging.switchTo().frame("braintree-hosted-field-number");
		//driver_Top_up_Elements_Staging.findElement(Top_up_Elements_Staging_card_number).sendKeys("4111111111111111");		
		//driver_Top_up_Elements_Staging.switchTo().defaultContent();
		//driver_Top_up_Elements_Staging.switchTo().frame("braintree-hosted-field-expirationDate");
		//driver_Top_up_Elements_Staging.findElement(Top_up_Elements_Staging_card_expiry_date).sendKeys("0319");
		//driver_Top_up_Elements_Staging.switchTo().defaultContent();
		
		driver_Top_up_Elements_Staging.findElement(Top_up_Elements_Staging_topup_button).click();		
		
	}
	
	/*public void top_up_opened_in_a_new_window()
	{
		
		Boolean lable_3_displayed = driver_Top_up_Elements_Staging.findElement(Top_up_Elements_Staging_rechage_with_3).isDisplayed();
		if(lable_3_displayed==true)
		{
			System.out.println("top up screen opened in a new window");
			
		}
		
		
	}*/
	
	
	
	
}
