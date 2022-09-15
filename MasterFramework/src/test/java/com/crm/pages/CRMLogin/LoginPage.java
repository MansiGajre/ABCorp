package com.crm.pages.CRMLogin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;



public class LoginPage extends TestListeners
{
	public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
	/*public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/
	
	//Login Page
	
	/*@FindBy(xpath="//input[@id='TxtName']") 		//Username field
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='TxtPassword']")   //Password field
	private WebElement password;
	
	@FindBy(xpath= "//input[@name='command']")   //Login button
	private WebElement loginBtn;
	
	@FindBy(xpath="//span[@id='TxtPassword-error']")   //Password error message when blank
	private WebElement passwordErrorMsg;
	
	@FindBy(xpath="//span[@id='TxtName-error']")   //Username error message when blank
	private WebElement usernameErrorMsg;
	
	@FindBy(xpath="//a[@class='header-profile__media min-wt-2 wt-2 ht-2 overflow-hidden']")   //Profile button
	private WebElement ProfileBtn;*/
	
	
	
	public void CRMLogin(String sheetName) throws Exception
	{
	
				extentInfo("Login for ", sheetName +" Intiated");
				ScreenShot.takeSnapShot("LoginPage", "Pass");
				CommonMethods.input("Username_XPATH",sheetName,"Username", 1);
				CommonMethods.input("password_XPATH",sheetName ,"Password", 1);
				CommonMethods.Click("loginBtn_XPATH");
				extentInfo("Sucessfully Login","");
	}
	

		
	
	/******************LOGOUT*************************/
	
/*	@FindBy(xpath="//div[@data-autoid='Logout']/a")
	private WebElement logOutBtn;*/
	public WebElement logOutBtn()
	{
		return logOutBtn();
	}
	
	public void Logout() throws Exception
	{
			CommonMethods.highLight("ProfileBtn_XPATH");
			CommonMethods.Click("ProfileBtn_XPATH");
			CommonMethods.highLight("logoutBtn_XPATH");
			CommonMethods.Click("logoutBtn_XPATH");
			log.info("Sucessfully logout..");
		
	}
	
}
