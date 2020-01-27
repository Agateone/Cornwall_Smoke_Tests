package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_Funds_Notice {

	
	
		WebDriver driver_Add_Funds;
	
		
		By Add_Funds_Button= By.xpath("/html/body/div/div/div/div/div/div/div/button/span[2]");
		
	
		
		public Add_Funds_Notice(WebDriver driver_Add_Funds2) 
		{
		this.driver_Add_Funds= driver_Add_Funds2;
		}
	
		public void click_on_add_funds_button()
		{
			driver_Add_Funds.switchTo().frame("iframe__inpage_notices");
			driver_Add_Funds.findElement(Add_Funds_Button).click();
			driver_Add_Funds.switchTo().defaultContent();
		}
	

public Boolean Add_funds_notice_displayed()
{
	driver_Add_Funds.switchTo().frame("iframe__inpage_notices");
	Boolean add_funds= driver_Add_Funds.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/button")).isDisplayed();
	driver_Add_Funds.switchTo().defaultContent();
	return add_funds;
}
}
