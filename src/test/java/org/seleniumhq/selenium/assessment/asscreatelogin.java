package org.seleniumhq.selenium.assessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class asscreatelogin {
	
	@FindBy (id = "username")
	private WebElement usern;
	
	@FindBy (id = "password")
	private WebElement passw;
	
	@FindBy (id = "confirmPassword")
	private WebElement conpass;
	
	@FindBy (xpath = "//*[@id=\"adminRoleId_inputfileddiv\"]/div/input")
	private WebElement adminrole;
	
	@FindBy (id = "systemUserSaveBtn")
	private WebElement savebtn;
	
	public void createlogin(WebDriver driver) {
		usern.click();
		usern.sendKeys("markob");
		passw.click();
		passw.sendKeys("V0ldEm%t");
		conpass.sendKeys("V0ldEm%t");
		adminrole.click();
		adminrole.sendKeys(Keys.chord("g",Keys.ENTER));
		
	}
	
	public void savelogin() {
		savebtn.click();
	}

}
