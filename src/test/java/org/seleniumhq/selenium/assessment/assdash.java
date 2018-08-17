package org.seleniumhq.selenium.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assdash {
	
	@FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
	private WebElement pim;
	
	@FindBy(id = "menu_pim_addEmployee")
	private WebElement addemp;
	
	@FindBy (xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
	private WebElement emplist;
	
	public void clickpim() {
	pim.click();
	}
	
	public void clickaddemp() {
		addemp.click();
	}
	
	public void clickemplist() {
		emplist.click();
	}

}
