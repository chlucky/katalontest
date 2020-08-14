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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.setText(findTestObject('Object Repository/Page_Google/input_Login_q'), 'firefox')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Hapus_btnK'))

WebUI.click(findTestObject('Object Repository/Page_firefox - Penelusuran Google/h3_Firefox - Lindungi kehidupan daring Anda_5081b8'))

WebUI.click(findTestObject('Object Repository/Page_Firefox - Lindungi kehidupan daring An_15a2bb/a_Monitor'))

WebUI.click(findTestObject('Object Repository/Page_Firefox Monitor/span_Lihat apakah Anda tersangkut dalam pem_546171'))

WebUI.click(findTestObject('Object Repository/Page_Firefox Monitor/div_Beranda_fx-monitor-logotype'))

WebUI.click(findTestObject('Object Repository/Page_Firefox Monitor/a_GitHub'))

WebUI.closeBrowser()

