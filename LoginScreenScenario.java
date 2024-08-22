package UITests.TestNG.SD;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Constants.PrjConstants;
import POM.SD.LoginScreen;
import POM.SD.SauceCheckout;
import POM.SD.SauceConfirmation;
import POM.SD.SauceDetails;
import POM.SD.SauceLogin;
import POM.SD.SauceProduct;
import TestSettings.SessionData;
import TestSettings.TestRunSettings;
import UITests.TestNG.Common.TestNGCommon;
import ReportUtilities.Common.ScreenshotCommon;
import CommonUtilities.Common.ActionKeywords.WebKeywords;
import CommonUtilities.Common.ActionKeywords.WebKeywords.SelectType;
import ReportUtilities.Common.ReportCommon;
import Constants.ElementConstants;
import ReportUtilities.Model.TestCaseParam;
import ReportUtilities.Model.ExtentModel.*;
import TestSettings.TestRunSettings;
import CommonUtilities.Utilities.Util;


public class LoginScreenScenario extends TestNGCommon {


	
	private WebDriver driver;
    String Browser = "";
    ScreenshotCommon SCM = new ScreenshotCommon();
    Util util = new Util();
    HashMap<String, ArrayList<String>> TestCaseData_Execution = new HashMap<String, ArrayList<String>>();
	ReportCommon TestStepDetails = new ReportCommon();
    TestCaseParam testCaseParam = new TestCaseParam();
    public LoginScreenScenario()
    {
    	

    }

    @BeforeMethod
    public void SetUp_Report()
    {
        Browser = TestRunSettings.Browser;
        testCaseParam.TestCaseName = "LoginScreen";
        testCaseParam.ModuleName = "SD";
        testCaseParam.Browser = Browser;
        testCaseParam.TestCaseDescription = testCaseParam.TestCaseName;
        InitializeTestCase(testCaseParam);
        driver = InitializeDriver();
        
    }
    
    @Test
    public void TestSauceHappyPath() throws Exception
    {

    	LoginScreen login = new LoginScreen(driver, testCaseParam);
    	login.Username(testCaseParam, "Auto_Hstaff1_ContraCosta_V1_SIT@nomail.ca.gov");
    	login.Password(testCaseParam, "Cares@40134756379322");
    	login.SignIn(testCaseParam, Browser);
    	login.SelectApp(testCaseParam, Browser);

    	
    }

    
    @AfterMethod
    public void TearDownMethod()
    {
    	EndTestCase(testCaseParam);
    	driver.quit();
    }

}
