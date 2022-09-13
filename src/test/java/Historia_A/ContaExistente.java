package Historia_A;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContaExistente {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\natan\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new ChromeDriver(); //Creating an object of FirefoxDriver


		driver.get( "http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click(); 
		driver.findElement(By.id("email_create")).sendKeys("marisasilva445@orbia.ag");
	    String resultadoEsperado = "An account using this email address has already been registered. Please enter a valid password or request a new one";
	    
	    if(resultadoEsperado.contentEquals(resultadoEsperado)) {
	    	System.out.println("Test Passed! ");
	    } else {
	    	System.out.println("Test Failed! ");

	    }
		driver.close();
		
	}
}

	  


