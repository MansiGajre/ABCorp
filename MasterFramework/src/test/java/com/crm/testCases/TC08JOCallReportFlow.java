package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.CallReportJOFlow;
import ObjectRepository.LoginPage;

public class TC08JOCallReportFlow extends SetUp {
		public LoginPage login;
		public CallReportJOFlow jocallreport;
		@Test
		
public void JOCallReportFlow() throws Exception
{

//sheetName from Excel to pass the testdata
String sheetName = "JOCallReportFlow";
  
 //To check  testcase runmode from excel (Yes/No)
  if (!(CommonMethods.isTestRunnable("JOCallReportFlow"))) {

		throw new SkipException(
				"Skipping the test JOCallReportFlow as the Run mode is NO");

}
  
  //setUpTest to launch browser
	setUpTest(sheetName);
	//login to CRM
	login = new LoginPage(driver);
	login.CRMLogin(sheetName);
	
	
	jocallreport= new CallReportJOFlow(driver);
	jocallreport.CogentJO(sheetName);


}

	
}