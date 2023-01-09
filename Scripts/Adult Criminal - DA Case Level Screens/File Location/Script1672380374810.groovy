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

WebUI.click(findTestObject('Object Repository/File Location/Page_CMP NextGen/a_File Location'))

WebUI.click(findTestObject('Object Repository/File Location/Page_CMP NextGen/button_Add File Location'))

WebUI.click(findTestObject('Object Repository/File Location/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_0d15f5'))

WebUI.click(findTestObject('Object Repository/File Location/Page_CMP NextGen/span_DV Unit'))

WebUI.setText(findTestObject('Object Repository/File Location/Page_CMP NextGen/input__FileLocationDate'), 't+1')

WebUI.click(findTestObject('Object Repository/File Location/Page_CMP NextGen/span_Choose_ui-multiselect-trigger-icon ui-_e60519'))

WebUI.click(findTestObject('Object Repository/File Location/Page_CMP NextGen/div_Choose_ui-chkbox-box ui-widget ui-corne_d11469'))

WebUI.setText(findTestObject('Object Repository/File Location/Page_CMP NextGen/textarea_Archive Control_Notes'), 'Notes')

WebUI.click(findTestObject('_Default Objects/Popup Window Save button'))

not_run: WebUI.verifyElementText(findTestObject('File Location/Page_CMP NextGen/div_File Location saved Failed'), 'File Location saved  successfully.')

