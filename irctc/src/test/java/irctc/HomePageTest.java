package irctc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import pageObject.HomePageObject;
import pageObject.PnrStatusCheckObject;

public class HomePageTest extends BrowserInvoke {
	
	HomePageObject hpObj;
	@Test
	public void homePageNavigate() throws IOException {
		driver = initializeDriver();
		String baseUrl = getUrl();
		driver.get(baseUrl);
		//Closing Alert box on the home page
		hpObj = new HomePageObject(driver);
		hpObj.getCloseAlertBox().click();
		
		
	}
	
	@Test
	public void navigateToPnrStatusCheck() {
		//navigate to pnr status check page
		
		hpObj.getPnrStatusCheckPageLink().click();
	}
	

}
