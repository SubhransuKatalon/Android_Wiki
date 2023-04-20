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

Mobile.startApplication('bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c', true)

titleText = Mobile.getText(findTestObject('Wiki_Objects/android.widget.TextView - In the news'), 30)

println('Title of the section : ' + titleText)

Mobile.tap(findTestObject('Wiki_Objects/android.widget.TextView - Search Wikipedia'), 30)

Mobile.setText(findTestObject('Wiki_Objects/android.widget.EditText - Search'), 'Dummy', 30)

Mobile.tap(findTestObject('Wiki_Objects/android.widget.ImageButton'), 30)

//WebUI.verifyElementPresent(findTestObject('null'), 30)
//
//WebUI.verifyElementText(findTestObject('null'), 'In the news')
Mobile.closeApplication()

