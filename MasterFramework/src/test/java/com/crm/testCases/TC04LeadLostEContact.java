package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.base.SetUp;
import com.crm.pages.CRMLogin.EContactLeadLost;
import com.crm.pages.CRMLogin.LoginPage;


public class TC04LeadLostEContact extends SetUp {
	public LoginPage login;
	public EContactLeadLost leadl;
	@Test
	public void LeadLostEContact() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadLostEContact";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadLostEContact", sheetName))) {

			throw new SkipException(
					"Skipping the test LeadLostEContact as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest1(sheetName);
		//login to CRM
		login = new LoginPage();
		login.CRMLogin(sheetName);
		
		
	  leadl= new EContactLeadLost();
	  leadl.ELeadContact(sheetName);
	  
	  
	}

		
	}
