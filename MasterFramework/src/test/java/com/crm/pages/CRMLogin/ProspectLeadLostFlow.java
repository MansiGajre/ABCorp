package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtility.CommonMethods;
import CommonUtility.ScreenShot;
import CommonUtility.SetUp;

public class ProspectLeadLostFlow extends SetUp {
	public static Logger log =LogManager.getLogger(ProspectLeadLostFlow.class.getName());
	public ProspectLeadLostFlow(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Navigate to Client Object
	@FindBy(xpath="//i[@class='icon icon-obj7']")
	private WebElement ClientObject;
//Select View Category
	@FindBy(xpath="//select[@data-autoid=\"QueryCategoryId_ctrl\"]")
	private WebElement SelectView;
//Select Sub Category of View
	@FindBy(xpath="//select[@data-autoid=\"QueryViewId_ctrl\"]")
	private WebElement SubCategory;
//Click on view arrow
	@FindBy(xpath = "//a[@data-autoid='gridHF_View0']")
	private WebElement Arrowclick;
//Search Prospect
	@FindBy(xpath="//a[@class='ph-6 acd-link button-icon-text--icon flex items-center']")
	private WebElement ProspectSearch;

	@FindBy(xpath="//select[@data-autoid='undefined_ctrl']")
	private WebElement SearchBy;

	@FindBy(xpath="//input[@class='textbox field__item']")
	private WebElement SearchText;

//Select Prospect
	@FindBy(xpath="//a[@title=\"Prospect test 123\"]")
	private WebElement SelectProspect;

//Click on Lead tab
	@FindBy(xpath="//span[@data-autoid=\"tab_4\"]")
	private WebElement Leadtab;
	
//Click on New Lead
	@FindBy(xpath="//a[@title='New Lead']")
	private WebElement NewLead;
	
//Select from Existing Contact
	@FindBy(xpath="//select[@name=\"cust_353\"]")
	private WebElement ExistingContact;
	
//Enter FirstName
	@FindBy(xpath="//input[@data-autoid=\"FIRSTNAME_ctrl\"]")
	private WebElement FirstName;
	
//Enter LastName
	@FindBy(xpath="//input[@data-autoid='LASTNAME_ctrl']")
	private WebElement LastName;
	
//Enter Mobile Number
	@FindBy(xpath="//input[@data-autoid=\"LE_MOBILE_ctrl\"]")
	private WebElement MobileNumber;
	
//Select LeadSource
	@FindBy(xpath="//select[@data-autoid=\"LE_LEADSOURCE_ctrl\"]")
	private WebElement LeadSource;
	
//Select LeadPriority	
	@FindBy(xpath="//select[@data-autoid=\"LE_LEADRATING_ctrl\"]")
	private WebElement LeadPriority;
	
//Select CountryofBooking
	@FindBy(xpath="//select[@data-autoid=\"cust_720_ctrl\"]")
	private WebElement CountryofBooking;

//Select Product Category
	@FindBy(xpath="//input[@data-autoid=\"LE_PRODUCTCATEGORY_ctrl\"]")
	private WebElement ProductCategory;

//Select from PickProductCategory
	@FindBy(xpath="//div[@class=\"autocompletepicker\"]")
	private WebElement PickProductCategory;
	
//Select Product
	@FindBy(xpath="//select[@data-autoid=\"LE_PRODUCT_ctrl\"]")
	private WebElement Product;
	
//Select from Currency
	@FindBy(xpath="//a[@data-autoid=\"cust_543_srch\"]")
	private WebElement Currency;
//Enter Currency
	@FindBy(xpath = "//input[@data-autoid=\"Grid_SearchTextBox_ctrl\"]")
	private WebElement EnterCurrency;
	
//Search Currency
	@FindBy(xpath = "//a[@data-autoid='gridHF_cust_543']")
	private WebElement SearchCurrency;

//Select Currency
	@FindBy(xpath = "//div[@data-autoid=\"Level2_0\"]")
	private WebElement SelectCurrency;

//Enter Amount
	@FindBy(xpath = "//input[@data-autoid=\"cust_402_ctrl\"]")
	private WebElement Amount;

//Enter Net Expected Revenue
	@FindBy(xpath = "//input[@data-autoid=\"cust_406_ctrl\"]")
	private WebElement NetExpectedRevenue;
	
//Select Tenor
	@FindBy(xpath = "//select[@data-autoid=\"cust_358_ctrl\"]")
	private WebElement Tenor;

//Enter Due Date
	@FindBy(xpath="//input[@data-autoid=\"cust_91_ctrl\"]")
	private WebElement DueDate;
	
//Enter Rate Offered
	@FindBy(xpath = "//input[@data-autoid=\"cust_87_ctrl\"]")
	private WebElement RateOffered;

//Save Lead in New Lead status
	@FindBy(xpath="(//span[@class=\"ff-regular\"])[2]")
	private WebElement Savelead;
	
//Toggle Leadview
	@FindBy(xpath = "//a[@data-autoid=\"btn_toggle\"]")
	private WebElement Toggleview;

//Edit NewLead
	@FindBy(xpath = "(//span[@class=\"acd-btn-circle__icon\"])[1]")
	private WebElement EditLead;

//Lead Processing
	@FindBy(xpath = "(//span[@class=\"ml2 truncate f12\"])[2]")
	private WebElement Leadprocessing;

//Appointment fixed status
	@FindBy(xpath="//span[@class=\"running\"]")
	private WebElement AppointmentFixed;
	
//Enter Appointment date	
	@FindBy(xpath="(//input[@data-autoid=\"cust_202_ctrl\"])[1]")
	private WebElement Appointmentdate;

//Enter Appointment Time
	@FindBy(xpath = "(//input[@data-autoid=\"cust_202_ctrl\"])[2]")
	private WebElement Appointmenttime;
	
//Save Lead in Appointment fixed status
	@FindBy(xpath = "//a[@data-autoid=\"FlowNext\"]")
	private WebElement Saveappointment;
	
//Document collected status
	@FindBy(xpath = "//span[@class=\"unlocked\"]")
	private WebElement Documentcollected;
	
//Save Lead in Document collected status
	@FindBy(xpath="(//span[@class=\"ff-regular\"])[2]")
	private WebElement SaveDocument;
		
//Lead Closure
	@FindBy(xpath = "//div[@class=\"nav-ribbon__item unlocked\"]")
	private WebElement LeadClosure;

//Lead Lost Reason
	@FindBy(xpath = "//select[@name=\"cust_99\"]")
	private WebElement LeadLostreason;

//Save Lead in lead lost status
	@FindBy(xpath="(//span[@class=\"ff-regular\"])[2]")
	private WebElement Saveleadlost;
public void NTBLeadLost(String sheetName) throws Exception
{
			Thread.sleep(2000);
		//Navigate to Client Object
			CommonMethods.highLight(ClientObject);
			CommonMethods.Click(ClientObject);
			//CommonMethods.ExWait(ClientSearch);
			Thread.sleep(20000);
			//Search Prospect
			CommonMethods.scrollByVisibilityofElement(SelectView);
			CommonMethods.selectByText(SelectView, sheetName, "View", 1);
			CommonMethods.selectByText(SubCategory, sheetName, "View Sub Category", 1);
			CommonMethods.Click(Arrowclick);
			Thread.sleep(2000);
			CommonMethods.highLight(ProspectSearch);
			CommonMethods.Click(ProspectSearch);
			CommonMethods.highLight(SearchBy);
			CommonMethods.Click(SearchBy);
			CommonMethods.selectByText(SearchBy, sheetName, "SearchBy", 1);
			CommonMethods.input(SearchText, sheetName, "ProspectName",1);
			Thread.sleep(10000);
		//Select Prospect
			CommonMethods.highLight(SelectProspect);
			CommonMethods.Click(SelectProspect);
		//Click on Leads tab
			CommonMethods.highLight(Leadtab);
			CommonMethods.Click(Leadtab);
			Thread.sleep(10000);
			CommonMethods.scrollByVisibilityofElement(NewLead);
			CommonMethods.highLight(NewLead);
			CommonMethods.Click(NewLead);
			Thread.sleep(10000);
		//Select from Existing Contact
			CommonMethods.selectByText(ExistingContact, sheetName, "Select from Existing Contact", 1);
		//Enter FirstName
			CommonMethods.scrollByVisibilityofElement(FirstName);
			Thread.sleep(2000);
			CommonMethods.input(FirstName, sheetName, "First Name", 1);
		//Enter LastName
			CommonMethods.input(LastName, sheetName, "Last Name", 1);
		//Enter Mobile Number	
			CommonMethods.scrollByVisibilityofElement(MobileNumber);
			CommonMethods.input(MobileNumber, sheetName, "Mobile No.", 1);
		//Select LeadSource
			Thread.sleep(2000);
			CommonMethods.selectByText(LeadSource, sheetName, "Lead Source", 1);
		//Select LeadPriority
			Thread.sleep(2000);
			CommonMethods.selectByText(LeadPriority, sheetName, "Lead Priority", 1);
		//Select CountryofBooking
			CommonMethods.selectByText(CountryofBooking, sheetName, "Country of Booking", 1);
			CommonMethods.scrollByVisibilityofElement(ProductCategory);
		//Select Product Category
			CommonMethods.input(ProductCategory,sheetName,"Product Category",1);
			Thread.sleep(10000);
		//Select from PickProductCategory
			CommonMethods.Click(PickProductCategory);
			Thread.sleep(10000);
		//Select Product
			CommonMethods.selectByText(Product, sheetName, "Product", 1);
			Thread.sleep(10000);
		//Select from Currency
			CommonMethods.Click(Currency);
			Thread.sleep(2000);
		//Enter Currency
			CommonMethods.input(EnterCurrency, sheetName, "Currency", 1);
		//Enter SearchCurrency
			CommonMethods.Click(SearchCurrency);
			Thread.sleep(2000);
		//Select Currency
			CommonMethods.Click(SelectCurrency);
			Thread.sleep(2000);
		//Enter Amount
			CommonMethods.input(Amount, sheetName, "Amount", 1);
		//Enter Net Expected Revenue
			CommonMethods.input(NetExpectedRevenue, sheetName, "Net Expected Revenue", 1);
			Thread.sleep(10000);
		//Select Tenor
			CommonMethods.selectByText(Tenor, sheetName, "Tenor", 1);
		//Enter Rate Offered
			CommonMethods.input(RateOffered, sheetName, "Rate Offered", 1);
		//Enter Due Date
			CommonMethods.input(DueDate, sheetName, "Due Date", 1);
		//Save Lead in New Lead status		
			Thread.sleep(5000);
			CommonMethods.Click(Savelead);
		//Toggle Leadview
			CommonMethods.Click(Toggleview);
			CommonMethods.scrollByVisibilityofElement(EditLead);
		//Edit New Lead
			CommonMethods.Click(EditLead);
		//Lead Processing
			CommonMethods.Click(Leadprocessing);
			Thread.sleep(5000);
		//Appointment fixed status
			CommonMethods.Click(AppointmentFixed);
			Thread.sleep(500);
		//Enter Appointment Date
			CommonMethods.input(Appointmentdate, sheetName, "Appointment Date", 1);
		//Enter Appointment Time
			CommonMethods.input(Appointmenttime, sheetName, "Appointment Time", 1);
		//Save Lead in Appointment fixed status
			CommonMethods.Click(Saveappointment);
		//Toggle Leadview
			CommonMethods.Click(Toggleview);
			CommonMethods.scrollByVisibilityofElement(EditLead);
			CommonMethods.Click(EditLead);
		//Document collected status
			CommonMethods.Click(Documentcollected);
			Thread.sleep(5000);
			CommonMethods.Click(SaveDocument);
			Thread.sleep(2000);
			CommonMethods.Click(Toggleview);
			CommonMethods.scrollByVisibilityofElement(EditLead);
			CommonMethods.Click(EditLead);
		//Lead Closure	
			Thread.sleep(1000);
			CommonMethods.Click(LeadClosure);
			Thread.sleep(1000);
		//Lead Lost Reason
			CommonMethods.selectByText(LeadLostreason, sheetName, "Lead Lost Reason", 1);
			CommonMethods.Click(Saveleadlost);
}

}