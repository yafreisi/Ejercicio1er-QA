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

WebUI.navigateToUrl('https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_em_signin%3Faction%3Dsign-out%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%2526ref_%253Dnavm_em_signin%26signIn%3D1%26useRedirectOnSuccess%3D1%26ref_%3Dnav_em_signout_0_1_1_39&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')

WebUI.setText(findTestObject('Object Repository/compras/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    GlobalVariable.correo)

WebUI.click(findTestObject('Object Repository/compras/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/compras/Page_Amazon Sign-In/input_Forgot your password_password'), 
    GlobalVariable.contrasena)

WebUI.click(findTestObject('Object Repository/compras/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.setText(findTestObject('Object Repository/compras/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_field-keywords'), 
    GlobalVariable.busca)

WebUI.click(findTestObject('Object Repository/compras/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/compras/Page_Amazon.com  mouse/span_Amazon Basics - Ratn inalmbrico para o_49771e'))

WebUI.click(findTestObject('Object Repository/compras/Page_Amazon.com Amazon Basics - Ratn inalmb_e134ba/input_Cantidad_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/compras/Page_Amazon.com Amazon Basics - Ratn inalmb_e134ba/input_US11.89_a-button-input'))

WebUI.click(findTestObject('Object Repository/compras/Page_Seleccionar una direccin de envo/a_Entregar a esta direccin Tamarindo'))

WebUI.click(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Amazon acepta las principales tarjeta_387d7f'))

WebUI.setText(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Nmero de tarjeta_addCreditCardNumber'), 
    GlobalVariable.noTarjeta)

WebUI.setText(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Nombre en la tarjeta_ppw-accountHolderName'), 
    GlobalVariable.NombreTarjeta)

WebUI.click(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/span_01'))

WebUI.click(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/a_04'))

WebUI.click(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/span_2022'))

WebUI.click(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/a_2024'))

WebUI.click(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Cancelar_ppw-widgetEventAddCreditCardEvent'))

WebUI.click(findTestObject('Object Repository/compras/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/div_Se ha producido un problema.El nmero de_222759'))

WebUI.delay(2)

WebUI.closeBrowser()

