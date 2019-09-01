import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitabisa.com/login')

WebUI.setText(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/input_Masuk Ke Akun Anda_username'), 
    'testd6881@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/input_Masuk Ke Akun Anda_password'), 
    'CrybQI50eYbeFOIrIxw7xw==')

WebUI.click(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/button_MASUK'))

WebUI.click(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/img_Bantu siapa hari ini_style__ListImageCanvas-sc-1sl4ulh-2 fzrOdo'))

WebUI.click(findTestObject('Object Repository/donate/Page_Kitabisa - Proteksi Kesehatan Berbasis Tolong Menolong/button_DONASI SEKARANG'))

WebUI.setText(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/input_Rp_amount'), 
    '20.000')

WebUI.click(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/svg_PILIH_svg-inline--fa fa-chevron-down fa-w-14'))

WebUI.click(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/img_Dompet Kebaikan_style__VendorImg-sc-1wfxixd-3 iIDfCC'))

WebUI.click(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/button_LANJUTKAN PEMBAYARAN'))

WebUI.click(findTestObject('Object Repository/donate/Page_Kitabisacom - Indonesias Fundraising Platform/h2_Instruksi Pembayaran'))

WebUI.closeBrowser()

