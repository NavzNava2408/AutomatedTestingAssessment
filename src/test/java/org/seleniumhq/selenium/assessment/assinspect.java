package org.seleniumhq.selenium.assessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class assinspect {
	@FindBy (id = "first_name")
	private WebElement onename;
	
	
	public String nametext() {
		return onename.getText();
	}

}
