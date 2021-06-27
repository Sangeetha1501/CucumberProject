package com.amazon.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.am_helper.PageObjectManager;
import com.amazon.am_helper.ScenarioContext;
import com.baseclass.BaseClass;
import com.enums.Context;

import junit.framework.Assert;

public class RegistrationPage extends BaseClass {

	public WebDriver driver;

	// locators
	@FindBy(className = "login")
	private WebElement signInLink;

	@FindBy(id = "email_create")
	private WebElement emailBox;

	@FindBy(id = "SubmitCreate")
	private WebElement createButton;

	@FindBy(id = "id_gender1")
	private WebElement genderId;

	@FindBy(id = "customer_firstname")
	private WebElement customer1stName;

	@FindBy(id = "customer_lastname")
	private WebElement customerLastName;

	@FindBy(id = "passwd")
	private WebElement psswd;

	@FindBy(id = "days")
	private WebElement birthDay;

	@FindBy(id = "months")
	private WebElement birthMonth;

	@FindBy(id = "years")
	private WebElement birthYear;

	@FindBy(id = "firstname")
	private WebElement addressFirstName;

	@FindBy(id = "lastname")
	private WebElement addressLastName;

	@FindBy(id = "address1")
	private WebElement address1;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "id_state")
	private WebElement state;

	@FindBy(id = "postcode")
	private WebElement postcode;

	@FindBy(id = "id_country")
	private WebElement country;

	@FindBy(id = "phone_mobile")
	private WebElement mobileNumber;

	@FindBy(id = "submitAccount")
	private WebElement accountSubmitButton;

	@FindBy(className = "info-account")
	private WebElement accountConfirmation;

	@FindBy(xpath = "//a[@class='account']//span")
	private WebElement profileConfirmation;
	
	@FindBy(id = "email")
	private WebElement enterEmail;
    
	@FindBy(id = "passwd")
	private WebElement enterPswd;
	
	@FindBy(id = "SubmitLogin")
	private WebElement logIn;
	
	@FindBy(className = "logout")
	private WebElement logOut;
		
	// getters
	public WebElement getSingInLink() {
		return signInLink;
	}

	public WebElement getEmailField() {
		return emailBox;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getPsswd() {
		return psswd;
	}

	public WebElement getCustomerLastName() {
		return customerLastName;
	}

	public WebElement getBirthDay() {
		return birthDay;
	}

	public WebElement getCustomerFirstName() {
		return customer1stName;
	}

	public WebElement getBirthMonth() {
		return birthMonth;
	}

	public WebElement getBirthYear() {
		return birthYear;
	}

	public WebElement getGender() {
		return genderId;
	}

	public WebElement getAddressFirstName() {
		return addressFirstName;
	}

	public WebElement getAddressLastName() {
		return addressLastName;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getZipcode() {
		return postcode;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getAccountSubmitButton() {
		return accountSubmitButton;
	}

	public RegistrationPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public void fillRegistrationDetails(String firstName, String lastName, String Password, String Address1,
			String State, String ZipCode, String Country, String City, String contactNumber) {
		elementClick(genderId);
		inputValuestoElement(customer1stName, firstName);
		ScenarioContext.Instance().setContext(Context.Profile1stName, customer1stName.getAttribute("value"));
		inputValuestoElement(customerLastName, lastName);
		ScenarioContext.Instance().setContext(Context.ProfileLastName, customerLastName.getAttribute("value"));
		inputValuestoElement(psswd, Password);
		selectValuesfromDD(birthDay, "value", "30");
		selectValuesfromDD(birthMonth, "value", "12");
		selectValuesfromDD(birthYear, "value", "1993");
		inputValuestoElement(addressFirstName, firstName);
		inputValuestoElement(addressLastName, lastName);
		inputValuestoElement(address1, Address1);
		inputValuestoElement(city, City);
		selectValuesfromDD(state, "visibletext", State);
		inputValuestoElement(postcode, ZipCode);
		selectValuesfromDD(country, "visibletext", Country);
		inputValuestoElement(mobileNumber, contactNumber);
	}

	public boolean verifyUserCreated() {
		String firstName = (String) ScenarioContext.Instance().getContext(Context.Profile1stName);
		String lastName = (String) ScenarioContext.Instance().getContext(Context.ProfileLastName);
		org.junit.Assert.assertEquals(profileConfirmation.getText(), firstName + " " + lastName);
		String confirmationMessage = accountConfirmation.getText();
		if (confirmationMessage.contains("Welcome to your account")) {
			return true;
		} else {
			return false;
		}

	}

	public Map<String, String> captureDataFromExcelBasedOnColumn(String fileName, String sheetName)
			throws Exception {
		try {
			Map<String, String> credentials = new HashMap<String, String>();
			File f = new File(
					System.getProperty("user.dir") + "\\src\\test\\reource\\ExcelData\\" + fileName + ".xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			Sheet sheet = wb.getSheet(sheetName);
			int rows = sheet.getPhysicalNumberOfRows() - 1;
			Row row = sheet.getRow(0);
			int column = row.getPhysicalNumberOfCells() - 1;
			for (int i = 1; i <= rows; i++) {			
			for (int j = 0; j <= column; j++) {
				String userName = sheet.getRow(i).getCell(j).toString();
				String rawPassword = sheet.getRow(i).getCell(j+1).toString();
			    String Password = rawPassword.replaceAll("[.0]+$", "");
			    credentials.put(userName, Password);
			    break;
			}
		}			
			System.out.println(credentials);
			wb.close();
			return credentials;			
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public void writeStatusToExcel(String fileName, String sheetName, String userName, String status) throws IOException {
		File f = new File(
				System.getProperty("user.dir") + "\\src\\test\\reource\\ExcelData\\" + fileName + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheet(sheetName);
		int rows = sheet.getPhysicalNumberOfRows() - 1;
		for(int i=0; i<=rows; i++) {
			if(sheet.getRow(i).getCell(0).toString().equals(userName)) {
				sheet.getRow(i).getCell(2).setCellValue(status);
			}
			FileOutputStream fout = new FileOutputStream(f);
			wb.write(fout);
			fout.close();
		}
		
	}
	
	public void sendCredentialsToLogin() throws InterruptedException, IOException {
		Object credentials = ScenarioContext.Instance().getContext(Context.credentialList);
        @SuppressWarnings("unchecked")
		Set<Entry<String, String>> credentialMap = ((Map<String, String>) credentials).entrySet();
        for(Entry<String, String> credentialValues : credentialMap) {
        	String userName = credentialValues.getKey();
        	enterEmail.sendKeys(userName);
        	String passWord = credentialValues.getValue();
        	enterPswd.sendKeys(passWord);
        	Thread.sleep(2000);
        	BaseClass.elementClick(logIn);
        	try {
				String confirmationMessage = accountConfirmation.getText();
				if (confirmationMessage.contains("Welcome to your account")) {
					writeStatusToExcel("LoginData", "Sheet1",userName,"Pass");
					BaseClass.elementClick(logOut);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				writeStatusToExcel("LoginData", "Sheet1",userName,"Fail");
        		driver.navigate().refresh();
        		Thread.sleep(2000);
        		BaseClass.elementClear(enterEmail);
			}
        }
	}
}
