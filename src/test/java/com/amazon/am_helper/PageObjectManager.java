package com.amazon.am_helper;



import org.openqa.selenium.WebDriver;
import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;
import com.amazon.pom.RegistrationPage;
import com.amazon.pom.WebTablePage;


public class PageObjectManager {

	public static WebDriver driver;
	
	private HomePage hm;

	private LoginPage lp;
	
	private WebTablePage web;
	
	private RegistrationPage reg;
    
	
   public static PageObjectManager pm = new PageObjectManager(driver);
   
   public static PageObjectManager Instance() {
	   return pm;
   }
	
	
	public HomePage getHomePage() {
		if (hm == null) {
			hm = new HomePage(driver);
		}
		return hm;

	}

	public LoginPage getLoginPage() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
	
	public WebTablePage getWebTablePage() {
		if(web == null) {
			web = new WebTablePage(driver);			
		}return web;
	}
	
	public RegistrationPage getRegistrationPage() {
		if(reg == null) {
			reg = new RegistrationPage(driver);			
		}return reg;
	}
	
	public PageObjectManager(WebDriver ldriver) {		
		this.driver = ldriver;
	}
}
