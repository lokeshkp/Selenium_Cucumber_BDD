package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;
import utilities.WaitHelper;

public class CustomerSearchPage {

	public WebDriver driver;
	WaitHelper waitHelper;
	
	public CustomerSearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(how = How.ID, using = "SearchEmail") @CacheLookup WebElement txtEmail;
	@FindBy(how = How.ID, using = "SearchFirstName") @CacheLookup WebElement txtFirstName;
	@FindBy(how = How.ID, using = "SearchLastName") @CacheLookup WebElement txtLastName;
	@FindBy(how = How.ID, using = "SearchMonthOfBirth") @CacheLookup WebElement drpdobMonth;
	@FindBy(how = How.ID, using = "SearchDayOfBirth") @CacheLookup WebElement drpdobDay;
	@FindBy(how = How.ID, using = "SearchCompany") @CacheLookup WebElement txtCompany;
	@FindBy(how = How.XPATH, using = "//div[@class='k-multiselect-wrap k-floatwrap']") @CacheLookup WebElement txtCustomerRoles;
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Administrators')]") @CacheLookup WebElement listItemAdministrator;
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Registered')]") @CacheLookup WebElement listItemRegistered;
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Guests')]") @CacheLookup WebElement listItemGuests;
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Vendors')]") @CacheLookup WebElement listItemVendors;
	@FindBy(how = How.XPATH, using = "//button[@id='search-customers']") @CacheLookup WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "//table[@role='grid']") @CacheLookup WebElement tblSearchResults;
	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']") @CacheLookup WebElement table;
	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tr") @CacheLookup List<WebElement> tableRows;
	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tr/td") @CacheLookup List<WebElement> tableColumns;
	
	public void setEmail(String email) {
		waitHelper.WaitForElement(txtEmail, 20);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setFirstName(String fname) {
		waitHelper.WaitForElement(txtFirstName, 20);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		waitHelper.WaitForElement(txtLastName, 20);
		txtLastName.clear();
		txtLastName.sendKeys(lname);
	}
	
	public void clickSearch() {
		waitHelper.WaitForElement(btnSearch, 30);
		btnSearch.click();
	}
	
	public int getNoOfRows() {
		return (tableRows.size());
	}
	

	public int getNoOfColumns() {
		return (tableColumns.size());
	}
	
	public boolean searchCustomerByEmail(String email) {
		boolean flag = false;
		for(int i=1; i<getNoOfRows(); i++) {
			String emailid = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println("Extracted Email-"+emailid);
			if(emailid.equals(email)) {
				flag=true;
			}
		}
		
		return flag;
	}
	

	public boolean searchCustomerByName(String name) {
		boolean flag = false;
		for(int i=1; i<getNoOfRows(); i++) {
			String nameVal = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println("Extracted Name-"+nameVal);
			if(nameVal.contains(name)) {
				flag=true;
			}
		}
		
		return flag;
	}
}
