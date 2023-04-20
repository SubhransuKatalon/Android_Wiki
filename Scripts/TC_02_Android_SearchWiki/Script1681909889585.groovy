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
import internal.GlobalVariable
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Today
import org.openqa.selenium.Keys as Keys

DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
Date date = new Date();
String today = dateFormat.format(date);

println("Today's date is : " + today)

Mobile.startApplication('bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c', true)

Mobile.tap(findTestObject('Wiki_Objects/android.widget.TextView - Search Wikipedia'), 30)

Mobile.sendKeys(findTestObject('Object Repository/Wiki_Objects/android.widget.EditText - Search'), 'Dummy')

objectText = Mobile.getText(findTestObject('Wiki_Objects/android.widget.TextView - Dummy'), 30)

Mobile.verifyMatch(objectText, "Dummy", false)

Mobile.verifyElementText(findTestObject('Wiki_Objects/android.widget.TextView - Dummy'), 'Dummy')

Mobile.tap(findTestObject('Object Repository/Wiki_Objects/android.widget.ImageButton'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Wiki_Objects/android.widget.TextView - In the news'), 'In the news')

dateText = Mobile.getText(findTestObject('Object Repository/Wiki_Objects/android.widget.TextView - Date'), 30)

Mobile.verifyMatch(dateText, today, false)

Mobile.verifyElementText(findTestObject('Object Repository/Wiki_Objects/android.widget.TextView - Featured article'), 'Featured article')

Mobile.closeApplication()

