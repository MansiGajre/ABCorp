package com.crm.testCases;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.base.SetUp;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.ProspectLeadWon;

public class TC06ProspectLeadWon extends SetUp {
	public LoginPage login;
	public ProspectLeadWon Prospectleadw;
@Test
	public void ProspectLeadWon() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "ProspectLeadWon";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("ProspectLeadWon", sheetName))) {

			throw new SkipException(
					"Skipping the test ProspectLeadWon as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest1(sheetName);
		//login to CRM
		login = new LoginPage();
		login.CRMLogin(sheetName);
		
		
		Prospectleadw= new ProspectLeadWon();
		Prospectleadw.NTBLeadWon(sheetName);
		//login.Logout();
	  
	}

		
	}
