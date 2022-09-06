package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LeadLost;
import ObjectRepository.LoginPage;


public class TC02LeadLostFlow extends SetUp {
	public LoginPage login;
	public LeadLost leadf;
	@Test
	public void LeadLostFlow() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadLostFlow";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadLostFlow"))) {

			throw new SkipException(
					"Skipping the test LeadLostFlow as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest(sheetName);
		//login to CRM
		login = new LoginPage(driver);
		login.CRMLogin(sheetName);
		
		
	  leadf= new LeadLost(driver);
	  leadf.Client(sheetName);
	  
	  
	}

		
	}



