package POM.SCR;
import Constants.ModuleConstants_SCR;
import Constants.ScreenConstants_SCR;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CommonUtilities.Common.ActionKeywords.WebKeywords;
import CommonUtilities.Common.ActionKeywords.WebKeywords.SelectType;
import ReportUtilities.Common.ReportCommon;
import Constants.ElementConstants;
import ReportUtilities.Model.TestCaseParam;
import ReportUtilities.Model.ExtentModel.*;
import TestSettings.TestRunSettings;
import CommonUtilities.Utilities.Util;

public class Initial_Screening {
private static final Logger logger =Logger.getLogger(Initial_Screening.class.getName());
private WebDriver driver;
ReportCommon exceptionDetails = new ReportCommon();
Util util = new Util();

String ModuleName = ModuleConstants_SCR._SCR;
String ScreenName = ScreenConstants_SCR.Initial_Screening;
public Initial_Screening(){ }
public Initial_Screening(WebDriver _driver,TestCaseParam testCaseParam) throws Exception { InitializePage(_driver,testCaseParam);}
 public void InitializePage(WebDriver _driver,TestCaseParam testCaseParam) throws Exception 
    {
    	 driver = _driver;
         PageFactory.initElements(driver, this);
         ReportCommon TestStepLogDetails = new ReportCommon(); 
         TestStepLogDetails.logModuleAndScreenDetails(testCaseParam, ModuleName, ScreenName);
    }

@FindBy(how = How.ID, using = "input-510")
public WebElement Date;

@FindBy(how = How.ID, using = "combobox-input-514")
public WebElement Time;

@FindBy(how = How.ID, using = "input-522")
public WebElement ScreeningName;

@FindBy(how = How.ID, using = "ReasonForCall")
public WebElement ReasonForCallDrpDwn;

@FindBy(how = How.ID, using = "//lightning-base-combobox-item[@data-value='Abuse/Neglect Referral']")
public WebElement ReasonForCallValue;

@FindBy(how = How.ID, using = "//div[@aria-label='Screening Narrative']//div[@class='slds-rich-text-editor__textarea slds-grid']")
public WebElement ScreeningNarrative;

@FindBy(how = How.ID, using = "//lightning-radio-group[@type='radio']//following-sibling::span[contains(text(),'Non-Mandated Reporter)')]")
public WebElement CallerType;

@FindBy(how = How.ID, using = "callback")
public WebElement CallBackRequiredDrpDwn;

@FindBy(how = How.ID, using = "//lightning-base-combobox-item[@data-value='Yes']")
public WebElement CallBackRequiredValue;

@FindBy(how = How.ID, using = "//button[text()='Save and Proceed']")
public WebElement SaveAndProceed;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _Date///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _Date(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> Date";
action.PageActionDescription = " ==> Date";
try {
WebKeywords.Instance().Click(driver,  Date,Data_Date, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _Date///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _Time///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _Time(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> Time";
action.PageActionDescription = " ==> Time";
try {
WebKeywords.Instance().Click(driver,  Time,Data_Time, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _Time///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _ScreeningName///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _ScreeningName(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> ScreeningName";
action.PageActionDescription = " ==> ScreeningName";
try {
WebKeywords.Instance().Click(driver,  ScreeningName,Data_ScreeningName, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _ScreeningName///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _ReasonForCallDrpDwn///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _ReasonForCallDrpDwn(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> ReasonForCallDrpDwn";
action.PageActionDescription = " ==> ReasonForCallDrpDwn";
try {
WebKeywords.Instance().Click(driver,  ReasonForCallDrpDwn,Data_ReasonForCallDrpDwn, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _ReasonForCallDrpDwn///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _ReasonForCallValue///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _ReasonForCallValue(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> ReasonForCallValue";
action.PageActionDescription = " ==> ReasonForCallValue";
try {
WebKeywords.Instance().Click(driver,  ReasonForCallValue,Data_ReasonForCallValue, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _ReasonForCallValue///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _ScreeningNarrative///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _ScreeningNarrative(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> ScreeningNarrative";
action.PageActionDescription = " ==> ScreeningNarrative";
try {
WebKeywords.Instance().Click(driver,  ScreeningNarrative,Data_ScreeningNarrative, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _ScreeningNarrative///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _CallerType///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _CallerType(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> CallerType";
action.PageActionDescription = " ==> CallerType";
try {
WebKeywords.Instance().Click(driver,  CallerType,Data_CallerType, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _CallerType///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _CallBackRequiredDrpDwn///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _CallBackRequiredDrpDwn(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> CallBackRequiredDrpDwn";
action.PageActionDescription = " ==> CallBackRequiredDrpDwn";
try {
WebKeywords.Instance().Click(driver,  CallBackRequiredDrpDwn,Data_CallBackRequiredDrpDwn, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _CallBackRequiredDrpDwn///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _CallBackRequiredValue///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _CallBackRequiredValue(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> CallBackRequiredValue";
action.PageActionDescription = " ==> CallBackRequiredValue";
try {
WebKeywords.Instance().Click(driver,  CallBackRequiredValue,Data_CallBackRequiredValue, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _CallBackRequiredValue///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  _SaveAndProceed///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void _SaveAndProceed(TestCaseParam testCaseParam,String TestData)throws Exception{
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = " ==> SaveAndProceed";
action.PageActionDescription = " ==> SaveAndProceed";
try {
WebKeywords.Instance().Click(driver,  SaveAndProceed,Data_SaveAndProceed, testCaseParam,action);
  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  _SaveAndProceed///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method Start ===>  ///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void (TestCaseParam testCaseParam,String iteration) throws Exception  {
PageDetails action = new PageDetails();
LocalDateTime StartTime= LocalDateTime.now();
action.PageActionName = "";
action.PageActionDescription = "";

boolean result=false;
try {
HashMap<String, ArrayList<String>> TestCaseData_SCR = util.GetScreenTCData(ScreenName, testCaseParam.TestCaseName,TestRunSettings.TestDataPath, TestRunSettings.TestDataMappingFileName ,TestRunSettings.TestDataMappingSheetName_SCR,iteration);


String Data_Date = TestCaseData_SCR.get("Data_Date").get(0);
String Data_Time = TestCaseData_SCR.get("Data_Time").get(0);
String Data_ScreeningName = TestCaseData_SCR.get("Data_ScreeningName").get(0);
String Data_ReasonForCallDrpDwn = TestCaseData_SCR.get("Data_ReasonForCallDrpDwn").get(0);
String Data_ReasonForCallValue = TestCaseData_SCR.get("Data_ReasonForCallValue").get(0);
String Data_ScreeningNarrative = TestCaseData_SCR.get("Data_ScreeningNarrative").get(0);
String Data_CallerType = TestCaseData_SCR.get("Data_CallerType").get(0);
String Data_CallBackRequiredDrpDwn = TestCaseData_SCR.get("Data_CallBackRequiredDrpDwn").get(0);
String Data_CallBackRequiredValue = TestCaseData_SCR.get("Data_CallBackRequiredValue").get(0);
String Data_SaveAndProceed = TestCaseData_SCR.get("Data_SaveAndProceed").get(0);

String VerifyData_Date = TestCaseData_SCR.get("VerifyData_Date").get(0);
String VerifyData_Time = TestCaseData_SCR.get("VerifyData_Time").get(0);
String VerifyData_ScreeningName = TestCaseData_SCR.get("VerifyData_ScreeningName").get(0);
String VerifyData_ReasonForCallDrpDwn = TestCaseData_SCR.get("VerifyData_ReasonForCallDrpDwn").get(0);
String VerifyData_ReasonForCallValue = TestCaseData_SCR.get("VerifyData_ReasonForCallValue").get(0);
String VerifyData_ScreeningNarrative = TestCaseData_SCR.get("VerifyData_ScreeningNarrative").get(0);
String VerifyData_CallerType = TestCaseData_SCR.get("VerifyData_CallerType").get(0);
String VerifyData_CallBackRequiredDrpDwn = TestCaseData_SCR.get("VerifyData_CallBackRequiredDrpDwn").get(0);
String VerifyData_CallBackRequiredValue = TestCaseData_SCR.get("VerifyData_CallBackRequiredValue").get(0);
String VerifyData_SaveAndProceed = TestCaseData_SCR.get("VerifyData_SaveAndProceed").get(0);

Date_method(testCaseParam,Data_Date);
Time_method(testCaseParam,Data_Time);
ScreeningName_method(testCaseParam,Data_ScreeningName);
ReasonForCallDrpDwn_method(testCaseParam,Data_ReasonForCallDrpDwn);
ReasonForCallValue_method(testCaseParam,Data_ReasonForCallValue);
ScreeningNarrative_method(testCaseParam,Data_ScreeningNarrative);
CallerType_method(testCaseParam,Data_CallerType);
CallBackRequiredDrpDwn_method(testCaseParam,Data_CallBackRequiredDrpDwn);
CallBackRequiredValue_method(testCaseParam,Data_CallBackRequiredValue);
SaveAndProceed_method(testCaseParam,Data_SaveAndProceed);

verifyDate(testCaseParam,VerifyData_Date);
verifyTime(testCaseParam,VerifyData_Time);
verifyScreeningName(testCaseParam,VerifyData_ScreeningName);
verifyReasonForCallDrpDwn(testCaseParam,VerifyData_ReasonForCallDrpDwn);
verifyReasonForCallValue(testCaseParam,VerifyData_ReasonForCallValue);
verifyScreeningNarrative(testCaseParam,VerifyData_ScreeningNarrative);
verifyCallerType(testCaseParam,VerifyData_CallerType);
verifyCallBackRequiredDrpDwn(testCaseParam,VerifyData_CallBackRequiredDrpDwn);
verifyCallBackRequiredValue(testCaseParam,VerifyData_CallBackRequiredValue);
verifySaveAndProceed(testCaseParam,VerifyData_SaveAndProceed);



  }
            catch (Exception e)
            {
                logger.error("Failed == " + action.PageActionDescription);
                exceptionDetails.logExceptionDetails(driver, testCaseParam, action.PageActionName, action.PageActionDescription, StartTime,e);
                throw e;
            }
 }
}
}

 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////Method End ===>  #*MainMethodName*#///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

