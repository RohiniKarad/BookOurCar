package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy (xpath="(//a[text()='Home'])[3]")
	private WebElement home;
	
	@FindBy (xpath="(//span[text()='Sign In'])[2]")
	private WebElement signIn;

	@FindBy (xpath="(//a[text()='Partner'])[2]")
	private WebElement partner;
	
	@FindBy (xpath ="(//input[@name='bookingType'])[1]")
	private WebElement single;
	
	@FindBy (xpath="(//input[@name='bookingType'])[2]")
	private WebElement returnTrip;
	
	@FindBy (xpath="(//div[contains(@class,'css')])[3]")
	private WebElement pickUp;
	
	@FindBy (xpath="(//div[contains(@class,'css')])[10]")
	private WebElement destination;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement pickupTime;
	
	@FindBy (xpath="(//input[@class='form-control'])[2]")
	private WebElement mobileNo;
	
	@FindBy (xpath="(//button[@type='button'])[2]")
	private WebElement searchCabs;
	
	
	
	
}
