package com.crm.testCases;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.LeadLost;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.base.SetUp;


public class TC02LeadLostFlow extends SetUp {
	public LoginPage login;
	public LeadLost leadf;
	@Test
	public void LeadLostFlow() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadLostFlow";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadLostFlow", sheetName))) {

			throw new SkipException(
					"Skipping the test LeadLostFlow as the Run mode is NO");
		
		}
		/*//setUpTest to launch browser
		setUpTest1(sheetName);*/
		//login to CRM
		login = new LoginPage();
		login.CRMLogin(sheetName);
		
		
	  leadf= new LeadLost();
	  leadf.Client(sheetName);
	  
	  
	}

		
	}



