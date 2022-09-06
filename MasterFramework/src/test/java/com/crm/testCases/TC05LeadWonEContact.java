package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.EContactLeadWon;
import ObjectRepository.LoginPage;


public class TC05LeadWonEContact extends SetUp {
	public LoginPage login;
	public EContactLeadWon leadW;
//	@Test
	public void LeadWonEContact() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadWonEContact";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadWonEContact"))) {

			throw new SkipException(
					"Skipping the test LeadWonEContact as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest(sheetName);
		//login to CRM
		login = new LoginPage(driver);
		login.CRMLogin(sheetName);
		
		
	  leadW= new EContactLeadWon(driver);
	  leadW.LeadContactWon(sheetName);
	  
	  
	}

		
	}
