package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.base.SetUp;
import com.crm.pages.CRMLogin.CallReportJOFlow;



public class TC08JOCallReportFlow extends SetUp {
		public LoginPage login;
		public CallReportJOFlow jocallreport;
		@Test
		
public void JOCallReportFlow() throws Exception
{

//sheetName from Excel to pass the testdata
String sheetName = "JOCallReportFlow";
  
 //To check  testcase runmode from excel (Yes/No)
  if (!(CommonMethods.isTestRunnable("JOCallReportFlow", sheetName))) {

		throw new SkipException(
				"Skipping the test JOCallReportFlow as the Run mode is NO");

}
  
  //setUpTest to launch browser
	setUpTest1(sheetName);
	//login to CRM
	login = new LoginPage();
	login.CRMLogin(sheetName);
	
	
	jocallreport= new CallReportJOFlow();
	jocallreport.CogentJO(sheetName);


}

	
}