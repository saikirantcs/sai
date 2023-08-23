package browserLaunching;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wibselinum {

	public static void main(String[] args) {
      
		WebDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();

	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    
	    driver.get("http://demoqa.com/progress-bar");
	     driver.findElement(By.id("startStopButton")).click();
	    
	    WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
	    
	     driver.findElement(By.id("resetButton")).click();
	}

}
