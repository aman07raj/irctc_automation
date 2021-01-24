package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author AMAN RAJ
 *
 */
public class HomePageObject {

	
	  WebDriver driver; 
	  public HomePageObject(WebDriver driver) 
	  { 
		  this.driver =driver; 
		  PageFactory.initElements(driver, this); 
	  }
	 

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement closeAlertBox;

	@FindBy(xpath = "//div[@class='main-back']//div[@class='col-sm-6 remove-padding']"
			+ "//div[@class='text-center pull-left']"
			+ "//a[contains(@href,'http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en')]")
	public WebElement pnrStatusCheckPageLink;

	public WebElement getCloseAlertBox() {
		return closeAlertBox;
	}

	public WebElement getPnrStatusCheckPageLink() {
		return pnrStatusCheckPageLink;
	}

}
