package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LeadLost;
import ObjectRepository.LeadWon;
import ObjectRepository.LoginPage;


public class TC03LeadWonFlow extends SetUp {
	public LoginPage login;
	public LeadWon leadw;
	@Test
	public void LeadWonFlow() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadWonFlow";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadWonFlow"))) {

			throw new SkipException(
					"Skipping the test LeadWonFlow as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest(sheetName);
		//login to CRM
		login = new LoginPage(driver);
		login.CRMLogin(sheetName);
		
		
	  leadw= new LeadWon(driver);
	  leadw.Won(sheetName);
	  
	  
	}

		
	}



