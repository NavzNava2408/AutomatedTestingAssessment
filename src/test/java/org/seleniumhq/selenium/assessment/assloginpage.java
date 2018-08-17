package org.seleniumhq.selenium.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class assloginpage {
	
	@FindBy(id = "txtUsername")
	private static WebElement username;
	
	@FindBy(id = "txtPassword")
	private static WebElement password;
	
	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	private static WebElement login;
	
	public void clicklogin() {
		login.click();
	}
	
	public void typeun(WebDriver driver) {
		username.click();
		username.sendKeys("Admin");
	}
	
	public void typepass(WebDriver driver) {
		password.click();
		password.sendKeys("AdminAdmin");
	}
	

}
