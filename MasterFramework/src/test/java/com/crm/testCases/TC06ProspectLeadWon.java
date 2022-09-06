package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
import ObjectRepository.ProspectLeadWon;


public class TC06ProspectLeadWon extends SetUp {
	public LoginPage login;
	public ProspectLeadWon Prospectleadwon;
@Test
	public void ProspectLeadWon() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "ProspectLeadWon";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("ProspectLeadWon"))) {

			throw new SkipException(
					"Skipping the test ProspectLeadWon as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest(sheetName);
		//login to CRM
		login = new LoginPage(driver);
		login.CRMLogin(sheetName);
		
		
		Prospectleadwon= new ProspectLeadWon(driver);
		Prospectleadwon.NTBLeadWon(sheetName);
		//login.Logout();
	  
	}

		
	}
