package testCases;
import org.testng.annotations.Test;

import pageobjects.HomePage;


public class Tc001AccountRegistrationPage extends BaseClass {
	
	@Test
	public void account_reg() {
		
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		hp.clickregister();
		
		
		
		
		
	}
	
	

}
