package Table;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Wt {
	
	@Test
	public static void click_login() throws MalformedURLException, InterruptedException
	{
	
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Java\\Web\\Browser\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
  
	  driver.get("amazon.co.in");

	  WebDriverWait wait = new WebDriverWait(driver, 10);

	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='nav-link-yourAccount']")));
	 
	    element.click(); 
	 
	

	  driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']")).click();

	

}
}