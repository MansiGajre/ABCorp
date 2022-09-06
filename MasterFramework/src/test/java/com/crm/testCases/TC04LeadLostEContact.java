package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.EContactLeadLost;
import ObjectRepository.LeadLost;
import ObjectRepository.LoginPage;


public class TC04LeadLostEContact extends SetUp {
	public LoginPage login;
	public EContactLeadLost leadl;
//	@Test
	public void LeadLostEContact() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadLostEContact";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadLostEContact"))) {

			throw new SkipException(
					"Skipping the test LeadLostEContact as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest(sheetName);
		//login to CRM
		login = new LoginPage(driver);
		login.CRMLogin(sheetName);
		
		
	  leadl= new EContactLeadLost(driver);
	  leadl.ELeadContact(sheetName);
	  
	  
	}

		
	}
