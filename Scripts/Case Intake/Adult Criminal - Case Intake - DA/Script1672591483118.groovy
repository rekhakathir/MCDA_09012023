import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Enter User Name'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Enter Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on_Login button'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on Manage in the Menu'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on_Case Intake button'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Assigned To drop down'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Select Case Type-Adult Criminal'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on Case Intake button_Continue'))

WebUI.delay(5)

int random

random = ((Math.random() * 700000) as int)

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Enter__LEA'), random.toString())

WebUI.delay(3)

//WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Enter__LEA'), '763623')
WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/input__BeginDate'), 't-3')

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/input_Offense To Date_EndDate'), 't-2')

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/span_Adult and Family Services'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Select LEA_Adult and Family Services'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click On_Add Attachments'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Select Document Type'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Select Document Type_Police Report'))

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/input__DocumentSource'), 'Document Source')

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/input__DocumentName'), 'Document Title')

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/textarea_Notes_Note'), 'Notes - incident attachment')

WebUI.uploadFile(findTestObject('Adult Criminal - Case Intake - DA/Choose File'), GlobalVariable.Fileupload)

WebUI.click(findTestObject('Adult Criminal - Case Intake - DA/Incident attchment_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Adult Criminal - Case Intake - DA/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Next_button'))

WebUI.delay(3)

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('File Uploaded Successfully.', false)

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Select Intake type - Case Info Page'))

WebUI.click(findTestObject('Adult Criminal - Case Intake - DA/Select_Felony'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Next_button'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Select_Defendant'))

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Enter_Defendant_LastName'), 'balya')

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on_Known Person Search'))

WebUI.click(findTestObject('Adult Criminal - Case Intake - DA/Select known person search results - Defendant'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on_Custody Status dropdown list'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on_Custody'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on_Initiation Status dropdown list'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Click on_Arrest Warrant'))

not_run: WebUI.click(findTestObject('_Default Objects/Page Save'))

WebUI.scrollToPosition(50, 260)

WebUI.click(findTestObject('Adult Criminal - Case Intake - DA/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Next_button'))

WebUI.setText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Enter_Partial StatuteOffense Title_partialStatute'), 
    '107.718-e')

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/button_Statute Lookup'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/a_Select'))

WebUI.click(findTestObject('Adult Criminal - Case Intake - DA/button_Save_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/label_balya - pradeep'), 'balya - pradeep')

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Next_button'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/button_Add Assigned Staff'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Staff Type Dropdown'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Select_Unit'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Assigned To drop down'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/li_DV DDAs'))

WebUI.click(findTestObject('Adult Criminal - Case Intake - DA/button_Save'))

WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/Next_button'))

WebUI.scrollToPosition(50, 260)

//WebUI.executeJavaScript(GlobalVariable.Pagedown, null)
WebUI.click(findTestObject('Object Repository/Adult Criminal - Case Intake - DA/button_Submit'))

String text = WebUI.getText(findTestObject('Adult Criminal - Case Intake - DA/Case Created Successfully'))

not_run: println(text)

not_run: WebUI.verifyElementText(findTestObject('Adult Criminal - Case Intake - DA/Case Created Successfully'), 'Intake')

//WebUI.verifyMatch(text, '^Case .* created successfully', true, FailureHandling.STOP_ON_FAILURE)
not_run: WebUI.verifyMatch(text, '^Case #.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Adult Criminal - DA Case Level Screens/Case overview'), [:], FailureHandling.STOP_ON_FAILURE)

