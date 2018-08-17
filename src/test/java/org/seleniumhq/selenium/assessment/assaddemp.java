package org.seleniumhq.selenium.assessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class assaddemp {
	
	@FindBy(id = "firstName")
	private WebElement firstN;
	
	@FindBy (id = "middleName")
	private WebElement middleN;
	
	@FindBy (id = "lastName")
	private WebElement lastN;
	
	@FindBy (id = "employeeId")
	private WebElement empId;
	
	@FindBy (xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
	private WebElement location;
	
	@FindBy (xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement createlogin;
	
	public void addemployee(WebDriver driver) {
		firstN.click();
		firstN.sendKeys("Mark");

		middleN.click();
		middleN.sendKeys("Brian");
		
		lastN.click();
		lastN.sendKeys("Thomas");

		empId.click();
		empId.sendKeys("1745");

		location.click();
		location.sendKeys(Keys.chord("l",Keys.ENTER));
	}
	
	public void createlogindeets() {
		createlogin.click();
	}

}
