package com.crm.testCases;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.EContactLeadWon;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.base.SetUp;


public class TC05LeadWonEContact extends SetUp {
	public LoginPage login;
	public EContactLeadWon leadW;
	@Test
	public void LeadWonEContact() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "LeadWonEContact";
	  
	 //To check  testcase runmode from excel (Yes/No)
	  if (!(CommonMethods.isTestRunnable("LeadWonEContact", sheetName))) {

			throw new SkipException(
					"Skipping the test LeadWonEContact as the Run mode is NO");
		
		}
	//setUpTest to launch browser
		setUpTest1(sheetName);
		//login to CRM
		login = new LoginPage();
		login.CRMLogin(sheetName);
		
		
	  leadW= new EContactLeadWon();
	  leadW.LeadContactWon(sheetName);
	  
	  
	}

		
	}
