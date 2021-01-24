package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PnrStatusCheckObject {
	
	WebDriver driver;
	public PnrStatusCheckObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//div[@class='row']//div[@class='col-md-6']/input[@id='inputPnrNo']")
	WebElement pnrInputBox;
	
	//@FindBy(id = "modal1")
	@FindBy(xpath="//*[@id=\"modal1\"]")
	WebElement CheckPnrStatusButton;
	
	public WebElement getPnrInputBox() {
		return pnrInputBox;
	}
	
	public WebElement getCheckPnrStatusButton() {
		return CheckPnrStatusButton;
	}
}
