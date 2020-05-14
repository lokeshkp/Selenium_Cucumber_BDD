package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.BasePage;
import pageObjects.CustomerSearchPage;
import pageObjects.CustomersAddPage;
import pageObjects.LoginPage;

public class Steps extends BasePage{

	static String email = randomeString()+"@gmail.com";

	@Before
	public void setup() throws IOException {
		
		//Reading Config.properties file
		properties = new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		properties.load(fis);
		String browser = properties.getProperty("browser");
		
		// logger init	
		logger = Logger.getLogger("CRM Application");
		PropertyConfigurator.configure("log4j.properties");
		
		if(browser.equals("chrome")) {		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		loginPage = new LoginPage(driver);
		logger.info("Lanuched Browser");
	}


	/**
	 *  Login Feature Step definitions
	 */

	@When("User opens URL {string}")
	public void user_opens_URL(String URL) {
		logger.info("Openin URl-"+URL);
		driver.get(URL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String uname, String pasword) {
		logger.info("Entering "+uname +"and"+ pasword);
		loginPage.setUserName(uname);
		loginPage.setPassword(pasword);
	}

	@When("Click on Login")
	public void click_on_Login() {
		loginPage.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String pageTitle) {

		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(true);
		}else {
			Assert.assertEquals(pageTitle,driver.getTitle());
		}		
	}

	@When("User click log out link")
	public void user_click_log_out_link() throws InterruptedException {
		Thread.sleep(3000);
		loginPage.clickLogout();
	}

	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	}



	/**
	 *   Customer Feature Step definitions
	 */


	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {
		custAddPage = new CustomersAddPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", custAddPage.getPageTitle());

	}

	@When("User click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		custAddPage.clickOnCustomersMenu();
	}

	@When("Click on customers menu item")
	public void click_on_customers_menu_item() throws InterruptedException {
		custAddPage.clickOnCustomersMenuItem();
	}

	@When("Click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		Thread.sleep(2000);
		custAddPage.clickOnAddnew();
	}

	@Then("User can View Add new customer page")
	public void user_can_View_Add_new_customer_page() throws InterruptedException {
		Assert.assertEquals("Add a new customer / nopCommerce administration", custAddPage.getPageTitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		custAddPage.setEmail(email);
		custAddPage.setPassword("test123");
		custAddPage.setFirstName("Lokesh");
		custAddPage.setLastName("Kondepudi");
		custAddPage.setGender("Male");
		custAddPage.setDob("7/05/2020");
		custAddPage.setCompanyName("KP-Tech");
		custAddPage.setCustomerRoles("Guest");
		Thread.sleep(3000);
		custAddPage.setManagerOfVendor("Vendor 2");
		custAddPage.setAdminContent("Its for Testing..");
	}

	@When("Click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		custAddPage.clickOnSave();
	}

	@Then("User can view Confirmation message {string}")
	public void user_can_view_Confirmation_message(String acknolwdge) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	}




	/**
	 *   Customer Search By EmailID
	 */

	@When("Enter customer Email")
	public void enter_customer_Email() {
		custSearchPage = new CustomerSearchPage(driver);
		custSearchPage.setEmail("victoria_victoria@nopCommerce.com");
	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
		custSearchPage.clickSearch();
		Thread.sleep(3000);
	}

	@Then("User should found Email in the Search table")
	public void user_should_found_Email_in_the_Search_table() throws InterruptedException {
		boolean status = custSearchPage.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Thread.sleep(3000);
		Assert.assertTrue(status);
	}



	/**
	 *   Customer Search By Name
	 */

	@When("Enter customer FirstName")
	public void enter_customer_FirstName() {
		custSearchPage = new CustomerSearchPage(driver);
		custSearchPage.setFirstName("Victoria");
	}

	@When("Enter customer LastName")
	public void enter_customer_LastName() {
		custSearchPage.setLastName("Terces");
	}

	@Then("User should found Name in the Search table")
	public void user_should_found_Name_in_the_Search_table() {
		boolean status = custSearchPage.searchCustomerByName("Victoria");
		Assert.assertTrue(status);
	}
}
