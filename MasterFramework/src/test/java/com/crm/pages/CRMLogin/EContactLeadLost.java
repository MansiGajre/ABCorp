package ObjectRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtility.CommonMethods;
import CommonUtility.ScreenShot;
import CommonUtility.SetUp;
//Existing Contact Lead Lost flow
public class EContactLeadLost extends SetUp {
	public static Logger log =LogManager.getLogger(LeadLost.class.getName());
	public EContactLeadLost(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//Navigate to Client Object
	@FindBy(xpath="//i[@class='icon icon-obj7']")
	private WebElement ClientObject;
	
//Search Client
	@FindBy(xpath="//a[@class='ph-6 acd-link button-icon-text--icon flex items-center']")
	private WebElement ClientSearch;

	@FindBy(xpath="//select[@data-autoid='undefined_ctrl']")
	private WebElement SearchBy;
	
	@FindBy(xpath="//input[@class='textbox field__item']")
	private WebElement SearchText;
	
//Select Client
	@FindBy(xpath="//span[text()=\"Mansi Client\"]")
	private WebElement SelectClient;
	
//Click on Leads and deals tab
	@FindBy(xpath="//span[text()=\"Lead & Deals\"]")
	private WebElement LeadsandDealstab;
	
//Click on New Lead
	@FindBy(xpath="//a[@title='New Lead']")
	private WebElement NewLead;
	
//Select from Existing Contact
	@FindBy(xpath="//select[@name=\"cust_353\"]")
	private WebElement ExistingContact;

	
//Select Existing Contact from list
	@FindBy(xpath = "//a[@data-autoid=\"cust_340_srch\"]")
	private WebElement SelectContact;
	
//Enter contact name
	@FindBy(xpath="//input[@data-autoid=\"Grid_SearchTextBox_ctrl\"]")
			private WebElement Contactname;
	//Search contact
	@FindBy(xpath="//a[@class=\"filterGroup__button acid-btn acid-btn--outline-brand\"]")
			private WebElement Searchcontact;
	//Pick contact
	@FindBy(xpath = "//div[@title='test Contact']")
	private WebElement Pickcontact;
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
	public void ELeadContact(String sheetName) throws Exception
	{
				Thread.sleep(2000);
			//Navigate to Client Object
				CommonMethods.highLight(ClientObject);
				CommonMethods.Click(ClientObject);
				ScreenShot.takeSnapShot("LeadLost", "Pass");
				//CommonMethods.ExWait(ClientSearch);
				Thread.sleep(10000);
				CommonMethods.scrollByVisibilityofElement(ClientSearch);
			//Search Client
				CommonMethods.highLight(ClientSearch);
				CommonMethods.Click(ClientSearch);
				CommonMethods.highLight(SearchBy);
				CommonMethods.Click(SearchBy);
				CommonMethods.selectByText(SearchBy, sheetName, "SearchBy", 1);
				CommonMethods.input(SearchText, sheetName, "ClientName",1);
				Thread.sleep(10000);
			//Select Client
				CommonMethods.highLight(SelectClient);
				CommonMethods.Click(SelectClient);
			//Click on Leads and deals tab
				CommonMethods.highLight(LeadsandDealstab);
				CommonMethods.Click(LeadsandDealstab);
				Thread.sleep(10000);
				CommonMethods.scrollByVisibilityofElement(NewLead);
				CommonMethods.highLight(NewLead);
				CommonMethods.Click(NewLead);
				Thread.sleep(10000);
			//Select from Existing Contact
				CommonMethods.selectByText(ExistingContact, sheetName, "Select from Existing Contact", 1);
			//Select Existing Contact from list
				CommonMethods.Click(SelectContact);
				Thread.sleep(5000);
			//Enter Contact Name
				CommonMethods.input(Contactname, sheetName, "Account Contact", 1);
			//Search Contact
				CommonMethods.Click(Searchcontact);
			//Pick Contact
				CommonMethods.Click(Pickcontact);
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



	