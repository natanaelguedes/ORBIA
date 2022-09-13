package Atividade2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastrarAgroEspecialista {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\natan\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.orbia.ag/Account/LogOn?returnUrl=%2F&payload=dkVyaDgvaTEwYW8wdXBwUnlDaHVsTUNpcm9RazJDV0JmQU94UkdZZlVZTXhWakRKSGNEN2h3U3p2Q3kwbndqb2xvcFFEY1B5cytQc0Y3T1hQMDRWU3p0VEFJWWx5RzVZTFgxV1Z6aVhWWkE9");
	    driver.findElement(By.id("IdentificationDocument")).click();
	    driver.findElement(By.id("IdentificationDocument")).click();
	    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=IdentificationDocument | ]]
	    driver.findElement(By.id("cell")).click();
	    driver.findElement(By.id("continueRegisterCell")).click();
	    driver.findElement(By.xpath("//button[@id='btnModalMFAExplicaFecharWhatsapp']/p")).click();
	    driver.get("https://www.orbia.ag/Account/DadosPessoais?returnUrl=/");
	    //ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
	    driver.findElement(By.id("Email")).clear();
	    driver.findElement(By.id("Email")).sendKeys("titechgeo@gmail.com");
	    driver.findElement(By.id("EmailConfirma")).clear();
	    driver.findElement(By.id("EmailConfirma")).sendKeys("titechgeo@gmail.com");
	    driver.findElement(By.id("BirthDate")).click();
	    driver.findElement(By.id("Name")).click();
	    driver.findElement(By.id("Name")).clear();
	    driver.findElement(By.id("Name")).sendKeys("Natanael Guedes Silva");
	    driver.findElement(By.id("NickName")).clear();
	    driver.findElement(By.id("NickName")).sendKeys("Natan");
	    driver.findElement(By.id("Password")).click();
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("yoY4^yEp)6");
	    driver.findElement(By.xpath("//a[@id='mostra-senha']/span")).click();
	    driver.findElement(By.id("PasswordConfirma")).click();
	    driver.findElement(By.id("PasswordConfirma")).clear();
	    driver.findElement(By.id("PasswordConfirma")).sendKeys("yoY4^yEp)6");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='México'])[2]/following::section[2]")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='México'])[2]/following::section[2]")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.get("https://www.orbia.ag/Account/BayerPlantedArea?returnUrl=/");
	    driver.findElement(By.id("avaliableCropDropDown")).click();
	    new Select(driver.findElement(By.id("avaliableCropDropDown"))).selectByVisibleText("Fruticultura");
	    driver.findElement(By.id("cropSize")).click();
	    driver.findElement(By.id("cropSize")).clear();
	    driver.findElement(By.id("cropSize")).sendKeys("5");
	    driver.findElement(By.id("addCrop")).click();
	    driver.findElement(By.xpath("//div[@id='RegistrosAreaPlantada']/div[2]/div/div/select")).click();
	    new Select(driver.findElement(By.xpath("//div[@id='RegistrosAreaPlantada']/div[2]/div/div/select"))).selectByVisibleText("Citrus");
	    driver.findElement(By.xpath("//div[@id='RegistrosAreaPlantada']/div[2]/div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='RegistrosAreaPlantada']/div[2]/div[2]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='RegistrosAreaPlantada']/div[2]/div[2]/div/div/input")).sendKeys("8");
	    driver.findElement(By.xpath("//form[@id='saveCropForm']/div[3]/button")).click();
	    driver.get("https://www.orbia.ag/Account/CadastroRegiaoETermos?returnUrl=%2F");
	    driver.findElement(By.xpath("//div[@id='stateDropDown_chosen']/a/span")).click();
	    driver.findElement(By.xpath("//div[@id='stateDropDown_chosen']/div/ul/li[6]")).click();
	    driver.findElement(By.xpath("//div[@id='cityDropDown_chosen']/a/span")).click();
	    driver.findElement(By.xpath("//div[@id='cityDropDown_chosen']/div/ul/li[4]")).click();
	    driver.findElement(By.xpath("//form[@id='formCadastroRegiaoETermos']/div[2]/div/div/label/span")).click();
	    driver.findElement(By.xpath("//form[@id='formCadastroRegiaoETermos']/div[2]/div[2]/div/label/span")).click();
	    driver.findElement(By.xpath("//form[@id='formCadastroRegiaoETermos']/div[2]/div[3]/div/label/span")).click();
	    driver.findElement(By.xpath("//a[@id='a-regulamentos-parceiros']/span")).click();
	    driver.get("https://www.orbia.ag/BRBAY/TermView/214");
	    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
	    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='/'])[1]/following::div[49]")).click();
	    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
	    driver.get("https://www.orbia.ag/Account/CadastroRegiaoETermos?returnUrl=%2F");
	    driver.findElement(By.id("btnContinue")).click();
	    driver.get("https://www.orbia.ag/Account/InserirToken?returnUrl=%2F&isFormCadastro=True&validationMethod=6303");
	    driver.findElement(By.id("lnkModalMFATokenNaoRecebido")).click();
	    driver.findElement(By.id("btnModalMFANaoRecebidoReenviar")).click();
	    driver.findElement(By.id("lnModalInserirCodigo")).click();
	    driver.findElement(By.id("emailOrphoneNumber")).click();
	    driver.findElement(By.linkText("Entre em contato conosco")).click();
	    driver.findElement(By.id("BtnModalAjudaEntendi")).click();
	    driver.get("https://www.orbia.ag/Account/CadastroRegiaoETermos?returnUrl=%2F");
	    driver.get("https://www.orbia.ag/Account/BayerPlantedArea?returnUrl=/");
	    driver.get("https://www.orbia.ag/Account/DadosPessoais?returnUrl=/");
	    driver.get("https://www.orbia.ag/Account/BayerPlantedArea?returnUrl=/");
	    driver.get("https://www.orbia.ag/Account/CadastroRegiaoETermos?returnUrl=%2F");
	    driver.get("https://www.orbia.ag/Account/BayerPlantedArea?returnUrl=/");
	    driver.get("https://www.orbia.ag/Account/DadosPessoais?returnUrl=/");
	    driver.get("https://www.orbia.ag/Account/LogOn?returnUrl=%2F&payload=dkVyaDgvaTEwYW8wdXBwUnlDaHVsTUNpcm9RazJDV0JmQU94UkdZZlVZTXhWakRKSGNEN2h3U3p2Q3kwbndqb2xvcFFEY1B5cytQc0Y3T1hQMDRWU3p0VEFJWWx5RzVZTFgxV1Z6aVhWWkE9");
	    driver.get("https://www.orbia.ag/comprar/Agronomo-Independente");
	    driver.findElement(By.xpath("//ul[@id='menu-main-navigation']/li[4]/a")).click();
	    driver.get("https://www.orbia.ag/Agronomo-Independente");
	    driver.findElement(By.xpath("//button[@id='btnAcessarAgroespecialista']/i")).click();
	    driver.get("https://www.orbia.ag/comprar/Agronomo-Independente/SolicitarCadastro");
	    driver.findElement(By.id("ckbPessoaFisica")).click();
	    driver.findElement(By.id("ConselhoId_0")).click();
	    new Select(driver.findElement(By.id("ConselhoId_0"))).selectByVisibleText("CREA");
	    driver.findElement(By.id("UF_0")).click();
	    new Select(driver.findElement(By.id("UF_0"))).selectByVisibleText("PB");
	    driver.findElement(By.id("NumeroRegistro_0")).click();
	    driver.findElement(By.xpath("//form[@id='frmCadastroAgroespecialista']/div[5]/div/div/div/label/span")).click();
	    driver.findElement(By.id("btnSalvarAgroespecialista")).click();
	    driver.get("https://www.orbia.ag/comprar/Agronomo-Independente/PendenteAprovacao");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirme seus dados'])[1]/following::h3[1]")).getText(), "Recebemos seu cadastro!");
	}

}
