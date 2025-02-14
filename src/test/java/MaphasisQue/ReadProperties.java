package MaphasisQue;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadProperties {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive", "D:\\automation\\chromedriver-win64");
		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ReadConfigFile rcf=new ReadConfigFile();
		driver.get(rcf.getURL());
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
//
//        usernameInput.sendKeys(rcf.getUserName());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(rcf.getUserName());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(rcf.getPassword());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();

	}

}
