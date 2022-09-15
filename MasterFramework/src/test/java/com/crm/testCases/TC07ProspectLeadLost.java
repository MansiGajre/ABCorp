package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.base.SetUp;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.ProspectLeadLostFlow;


public class TC07ProspectLeadLost extends SetUp {
	public LoginPage login;
	public ProspectLeadLostFlow Prospectleadl;
@Test
	public void ProspectLeadLost() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "ProspectLeadLost";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("ProspectLeadLost", sheetName))) {

			throw new SkipException(
					"Skipping the test ProspectLeadLost as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest1(sheetName);
		//login to CRM
		login = new LoginPage();
		login.CRMLogin(sheetName);
		
		
		Prospectleadl= new ProspectLeadLostFlow();
		Prospectleadl.NTBLeadLost(sheetName);
	  
	  
	}

		
	}
