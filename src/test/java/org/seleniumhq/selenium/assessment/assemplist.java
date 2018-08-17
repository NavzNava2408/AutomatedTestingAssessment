package org.seleniumhq.selenium.assessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class assemplist {
	
	@FindBy (id = "employee_name_quick_filter_employee_list_value")
	private WebElement searchname;
	
	@FindBy (xpath = "//*[@id=\"employeeListTable\"]/tbody/tr/td[3]")
	private WebElement firstinlist;
	
	@FindBy (id = "quick_search_icon")
	private WebElement searchbtn;
	
	
	
	public void search(WebDriver driver) {
		searchname.click();
		searchname.sendKeys(Keys.chord("mark brian",Keys.ENTER));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchbtn.click();
		
	}
	
	public String listfirsttxt() {
		return firstinlist.getText();
	}
	
	public void inspect() {
		firstinlist.click();
	}

}
