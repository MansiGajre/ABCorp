package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
import ObjectRepository.ProspectLeadLostFlow;



public class TC07ProspectLeadLost extends SetUp {
	public LoginPage login;
	public ProspectLeadLostFlow Prospectleadl;
@Test
	public void ProspectLeadLost() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "ProspectLeadLost";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("ProspectLeadLost"))) {

			throw new SkipException(
					"Skipping the test ProspectLeadLost as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest(sheetName);
		//login to CRM
		login = new LoginPage(driver);
		login.CRMLogin(sheetName);
		
		
		Prospectleadl= new ProspectLeadLostFlow(driver);
		Prospectleadl.NTBLeadLost(sheetName);
	  
	  
	}

		
	}
