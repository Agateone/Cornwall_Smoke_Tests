package Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Popbitch_First_use_notice_login_live {
	

		WebDriver driver_Popbitch_First_use_notice_login_live;														//driver_PopbitchFirstUseNoticeElements
		
		//Popbitch First use Notice elements finding
		By green_tab= By.id("agateposter");																		//green tab
		By Nav_To_First_Use_Stories= By.xpath("//*[@id=\"menu-item-35878\"]/a");								//stories
		By Nav_To_First_Use_PremiumStory= By.linkText("III/ Max Factor");		//first premium story
		By First_use_Login=By.linkText("Log in to Agate");														//login to agate
		By First_Use_CreateWallet= By.xpath("/html/body/div/div/div/div/div/div/div[1]/button/span[3]");									//create wallet
		By First_Use_WhatIsAgate= By.linkText("What is Agate?");												//what is Agate
		
		


		public Popbitch_First_use_notice_login_live(WebDriver driver_Popbitch_First_use_notice_login_live2) {							//constructor
			this.driver_Popbitch_First_use_notice_login_live= driver_Popbitch_First_use_notice_login_live2;
			}
		
		
		public void Popbitch_premium_Story_Elements_Displayed()													//Check if all elements displayed on First use notice
		{
			Boolean Pop_First_Use_Notice_Create_Wallet_Displayed = driver_Popbitch_First_use_notice_login_live.findElement(First_Use_CreateWallet).isDisplayed();
			System.out.println(Pop_First_Use_Notice_Create_Wallet_Displayed);
			Boolean Pop_First_Use_Notice_Login_to_Agate_displayed = driver_Popbitch_First_use_notice_login_live.findElement(First_use_Login).isDisplayed();
			System.out.println(Pop_First_Use_Notice_Login_to_Agate_displayed);
			Boolean Pop_First_Use_Notice_What_Is_Agate_Displayed = driver_Popbitch_First_use_notice_login_live.findElement(First_Use_WhatIsAgate).isDisplayed();
			System.out.println(Pop_First_Use_Notice_What_Is_Agate_Displayed);
			}
		
		public  void Click_On_Popbitch_Stories_Menu() throws InterruptedException {	
			Thread.sleep(1000);
			driver_Popbitch_First_use_notice_login_live.findElement(Nav_To_First_Use_Stories).click();
			}
		
		public void Click_On_Popbitch_Premium_Story() throws InterruptedException {															//click on popbitch premium story	
			Thread.sleep(1000);
			driver_Popbitch_First_use_notice_login_live.findElement(Nav_To_First_Use_PremiumStory).click();
			}
		
		public void Click_On_Popbitch_First_Use_Notice_Login() throws InterruptedException {					//Login from popbitch First use Notice	
			Thread.sleep(1000);
			driver_Popbitch_First_use_notice_login_live.findElement(First_use_Login).click();
			}
		
		public void Click_On_Popbitch_First_Use_Notice_Create_Wallet() {										//Register from popbitch First use Notice
			driver_Popbitch_First_use_notice_login_live.findElement(First_Use_CreateWallet).click();
			}
			
		public void Click_On_Popbitch_First_Use_Notice_What_Is_Agate() {										//What is Agate from popbitch First use Notice
			driver_Popbitch_First_use_notice_login_live.findElement(First_Use_WhatIsAgate).click();
			}

		
		
		
		
		
		
		
		
		
		
		
	}

	
	

