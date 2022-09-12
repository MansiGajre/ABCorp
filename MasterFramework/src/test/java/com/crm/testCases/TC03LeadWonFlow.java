package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.LeadWon;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.base.SetUp;




public class TC03LeadWonFlow extends SetUp {
	public LoginPage login;
	public LeadWon leadw;
	@Test
	public void LeadWonFlow() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadWonFlow";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadWonFlow", sheetName))) {

			throw new SkipException(
					"Skipping the test LeadWonFlow as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest1(sheetName);
		//login to CRM
		login = new LoginPage();
		login.CRMLogin(sheetName);
		
		
	  leadw= new LeadWon();
	  leadw.Won(sheetName);
	  
	  
	}

		
	}



