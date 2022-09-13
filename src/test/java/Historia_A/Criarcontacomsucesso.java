package Historia_A;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Criarcontacomsucesso {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\natan\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new ChromeDriver(); //Creating an object of FirefoxDriver


	    driver.get("http://automationpractice.com/index.php");
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("email_create")).click();
	    driver.findElement(By.id("email_create")).clear();
	    driver.findElement(By.id("email_create")).sendKeys("elsa@orbia.ag");
	    driver.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();
	    driver.findElement(By.xpath("//form[@id='account-creation_form']/div/div/div[2]/label")).click();
	    driver.findElement(By.id("customer_firstname")).click();
	    driver.findElement(By.id("customer_firstname")).clear();
	    driver.findElement(By.id("customer_firstname")).sendKeys("marisa");
	    driver.findElement(By.id("customer_lastname")).clear();
	    driver.findElement(By.id("customer_lastname")).sendKeys("silva");
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).clear();
	    driver.findElement(By.id("passwd")).sendKeys("yoY4^yEp)6");
	    driver.findElement(By.id("days")).click();
	    new Select(driver.findElement(By.id("days"))).selectByVisibleText("regexp:8\\s+");
	    driver.findElement(By.id("months")).click();
	    new Select(driver.findElement(By.id("months"))).selectByVisibleText("regexp:May\\s");
	    driver.findElement(By.id("years")).click();
	    new Select(driver.findElement(By.id("years"))).selectByVisibleText("regexp:2015\\s+");
	    driver.findElement(By.id("newsletter")).click();
	    driver.findElement(By.xpath("//form[@id='account-creation_form']/div/div[8]")).click();
	    driver.findElement(By.id("optin")).click();
	    driver.findElement(By.id("company")).click();
	    driver.findElement(By.id("company")).clear();
	    driver.findElement(By.id("company")).sendKeys("orbia");
	    driver.findElement(By.id("address1")).click();
	    driver.findElement(By.id("address1")).clear();
	    driver.findElement(By.id("address1")).sendKeys("R. Duque de Caxias, 200 - Centro, João Pessoa - PB");
	    driver.findElement(By.id("address2")).click();
	    driver.findElement(By.id("address2")).clear();
	    driver.findElement(By.id("address2")).sendKeys("Rua do Fogo de Santelmo, Lote 2.07.02\n1990 – 110 Lisboa (Junto ao Oceanário)");
	    driver.findElement(By.id("city")).click();
	    driver.findElement(By.id("city")).clear();
	    driver.findElement(By.id("city")).sendKeys("Estados Unidos");
	    driver.findElement(By.id("id_state")).click();
	    driver.findElement(By.id("id_state")).click();
	    new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("California");
	    driver.findElement(By.id("postcode")).click();
	    driver.findElement(By.id("postcode")).clear();
	    driver.findElement(By.id("postcode")).sendKeys("77477");
	    driver.findElement(By.id("other")).click();
	    driver.findElement(By.id("other")).clear();
	    driver.findElement(By.id("other")).sendKeys("Cede da Microsoft");
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).clear();
	    driver.findElement(By.id("phone")).sendKeys("32211456");
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).click();
	    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=phone | ]]
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).clear();
	    driver.findElement(By.id("phone")).sendKeys("2107-0707");
	    driver.findElement(By.id("phone_mobile")).click();
	    driver.findElement(By.id("phone_mobile")).click();
	    driver.findElement(By.id("phone_mobile")).clear();
	    driver.findElement(By.id("phone_mobile")).sendKeys("+5583987653215");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).click();
	    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=email | ]]
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.id("center_column")).click();
	    driver.findElement(By.id("alias")).clear();
	    driver.findElement(By.id("alias")).sendKeys("elsa@orbia.ag");
	    driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
	    String resultadoEsperado = "An account using this email address has already been registered. Please enter a valid password or request a new one";
	    
	    if(resultadoEsperado.contentEquals(resultadoEsperado)) {
	    	System.out.println("Test Passed! ");
	    } else {
	    	System.out.println("Test Failed! ");

	    }
		driver.close();
	  
	    
	  }

	  

	}

