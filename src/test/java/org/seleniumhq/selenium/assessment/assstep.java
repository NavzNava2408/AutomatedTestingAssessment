package org.seleniumhq.selenium.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class assstep {
	
	static WebDriver driver;
	
	public static ExtentReports report;
	public ExtentTest test;
	
	static {
		report = new ExtentReports(asscon.reportpath, true);
		report.flush();
		}
	
	@Before
	public void setup() {
		report = new ExtentReports(asscon.reportpath, false);
		System.setProperty("webdriver.chrome.driver", asscon.driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Given("^the login page$")
	public void the_login_page() {
		driver.get(asscon.url);
	}

	@When("^I login$")
	public void i_login() {
		test = report.startTest("Successfully creating employee and login details");
		test.log(LogStatus.INFO, "login page loaded");
		assloginpage alp = PageFactory.initElements(driver, assloginpage.class);
		alp.typeun(driver);
		alp.typepass(driver);
		alp.clicklogin();
		test.log(LogStatus.INFO, "Menu button clicked");
	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab() {
		assdash ad = PageFactory.initElements(driver, assdash.class);
		ad.clickpim();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, "PIM tab clicked");
	}

	@When("^then the Add Employee Tab$")
	public void then_the_Add_Employee_Tab() {
		assdash ad = PageFactory.initElements(driver, assdash.class);
		ad.clickaddemp();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, "Add Employee tab clicked");
	}

	@When("^I fill out the Add Employee Details correctly$")
	public void i_fill_out_the_Add_Employee_Details_correctly() {
		assaddemp aae = PageFactory.initElements(driver, assaddemp.class);
		aae.addemployee(driver);
		test.log(LogStatus.INFO, "Added employee details");
	}

	@When("^I choose to create Login Details by clicking the appropriate button$")
	public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() {
		assaddemp aae = PageFactory.initElements(driver, assaddemp.class);
		aae.createlogindeets();
		test.log(LogStatus.INFO, "Clicked create login button");
	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly() {
		asscreatelogin acl = PageFactory.initElements(driver, asscreatelogin.class);
		acl.createlogin(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, "Added login details");
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button() {
		asscreatelogin acl = PageFactory.initElements(driver, asscreatelogin.class);
		acl.savelogin();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, "Clicked save button");
	}

	@Then("^I can search for the Employee I have just created$")
	public void i_can_search_for_the_Employee_I_have_just_created(){
		assdash ad = PageFactory.initElements(driver, assdash.class);
		ad.clickemplist();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		assemplist ael = PageFactory.initElements(driver, assemplist.class);
		ael.search(driver);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if("Mark Brian Thomas".equals(ael.listfirsttxt())) {
			test.log(LogStatus.PASS, "Successfully creating employee and login details");
		} else {
			test.log(LogStatus.FAIL, "Successfully creating employee and login details");
		}
		report.endTest(test);
		
		
		
		
	}

	@Then("^select them for inspection$")
	public void select_them_for_inspection() {
		test = report.startTest("Clicking for inspection");
		assemplist ael = PageFactory.initElements(driver, assemplist.class);
		ael.inspect();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assinspect ai = PageFactory.initElements(driver, assinspect.class);
		if ("Mark".equals(ai.nametext())) {
			test.log(LogStatus.PASS, "Clicking for inspection");
		} else {
			test.log(LogStatus.FAIL, "Clicking for inspection");
		}
	}
	
	@After
	public void teardown() {
		driver.quit();
		report.flush();
	}

}
