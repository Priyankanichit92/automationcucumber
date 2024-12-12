package screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshot01 {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\automation\\chromedriver-win64");
		//WebDriver driver = new ChromeDriver();
		
		//used to customize the behavior of the Chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
       // driver.navigate().to("https://www.facebook.com");
     //   driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
//      options.addArguments("start-maximized");
//      options.addArguments("window-size=1920,1080");
//       options.addArguments("disable-infobars");
//       options.addArguments("disable-extensions");
//       options.addArguments("no-sandbox");
//       options.addArguments("start-fullscreen");
//       options.addArguments("proxy-server=address:port");
//       options.addArguments("disable-popup-blocking");
       /*"disable-dev-shm-usage": Overcomes limited resource problems in Linux environments (often used in CI/CD pipelines).
       "enable-automation": Enables automation-related features.
       User Data




       "user-data-dir=path": Specifies a user data directory to load a custom profile.
       Miscellaneous

       "ignore-certificate-errors": Ignores SSL certificate errors.
       "remote-debugging-port=9222": Enables remote debugging on the specified port.*/
       
       // options.addArguments("headless");////which is useful for automated testing environments where you don't need a UI
//        String[] args = {"incognito", "start-maximized", "disable-infobars","disable-dev-shm-usage","enable-automation","user-data-dir=path"};
//        options.addArguments(args);
        // Initialize the ChromeDriver with options
      
        


		//////// .........................../image
		//////// link..............................................................
//			WebElement element=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//			
//			System.out.println (element.getAttribute("src"));

		// driver.get("http://localhost:4200/RegistrationForm");
//			WebElement element=driver.findElement(By.id("inputDegree"));
//			Select dropdown=new Select(element);
//			dropdown.selectByVisibleText("BE");
//			dropdown.selectByValue("BSC");
//			dropdown.selectByIndex(3);
//			if(dropdown.isMultiple()) {
//				System.out.println("is  mul");
//				
//				
//			}else {
//				System.out.println("is not mul");}
//			
//			
//			List<WebElement> list=dropdown.getOptions();
//			for(WebElement el:list) {
//
//				System.out.println(el.getText());
//				
//			}

		/////////////////////// ................ScreenShot...........................

//			
//			TakesScreenshot takescreenshot=( TakesScreenshot)driver;
//	driver.get("http://localhost:4200/RegistrationForm");	
//		WebElement ele=driver.findElement(By.id("inputResume"));
//		    File source = ele.getScreenshotAs(OutputType.FILE);
//			File dest = new File("screenshoot/screenshotfile.png");
//		    FileUtils.copyFile(source, dest);

		// ....................................Alertttttttttttt/////////////////////////////////////////

//			driver.get("http://uitestpractice.com/Students/Switchto"); 
//			driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).click();
		// System.out.println (element.getAttribute("src"));

//			driver.switchTo().alert().accept();
//			driver.switchTo().alert().dismiss();
		//]lpp// ............................promt
//			driver.switchTo().alert().sendKeys("priya");
//			driver.switchTo().alert().accept();

//			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		        WebElement resumeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputResume")));
		// // This should be the button that triggers the file dialog

		////////// ...........................mouse
		////////// opertations..........................................
//		driver.get("https://demoqa.com/buttons");	
//		
//		WebElement right=driver.findElement(By.id("rightClickBtn"));
//		WebElement doub=driver.findElement(By.id("doubleClickBtn"));
//	
//		Actions action=new Actions(driver);
//		
//		action.contextClick(right).perform();
//		action.doubleClick(doub).perform();
//			action.dragAndDrop(source,target).perform();
//			action.moveToElement(mouseover).perform();
//		WebElement clk=driver.findElement(By.id("xr3xy"));
//		action.click(clk);

//			driver.get("http://localhost:4200/RegistrationForm");
//			  WebElement resumeInput=driver.findElement(By.cssSelector("#inputResume"));
////			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////	        WebElement resumeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#inputResume")));
//				Actions action1=new Actions(driver);
////		        // Click the file input element
//		       action1.moveToElement(resumeInput).click().perform() ;// This opens the file upload dialog
//
//		        // Use Robot class to handle the file upload dialog
//		        Robot robot = new Robot();
//		        robot.delay(2000);
//		        StringSelection ss = new StringSelection("C:\\Users\\Rahul Kolhe\\Desktop\\PriyankaAutomation"); // Update the file path
//		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
////		        // Paste the file path
//	        robot.keyPress(KeyEvent.VK_CONTROL);
//		        robot.keyPress(KeyEvent.VK_V);
//		        robot.keyRelease(KeyEvent.VK_V);
//		        robot.keyRelease(KeyEvent.VK_CONTROL);
//
////		        // Press Enter to confirm
//		        robot.keyPress(KeyEvent.VK_ENTER);
//		        robot.keyRelease(KeyEvent.VK_ENTER);

		/// ..............v........................... newwindow...............................
//		driver.get("http://localhost:4200/RegistrationForm");
//		System.out.println(driver.getTitle());
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		// driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.facebook.com");
//		System.out.println(driver.getTitle());
//		Set<String> windowhandle = driver.getWindowHandles();
//		List<String> handle = new ArrayList<String>();
//		handle.addAll(windowhandle);
//		driver.close();
//
//		driver.switchTo().window(handle.get(0));
//
//		System.out.println(driver.getTitle());
        driver.get("http://localhost:4200/RegistrationForm");

       
        selectgender(driver,"Male");
        selectgender(driver,"Female");
        selectgender(driver,"Other");
        Thread.sleep(2000);
//		driver.quit();

		System.out.println("Hello quit!");
	}
	public static void selectgender(WebDriver driver,String value) {
//		 WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='"+value+"']"));
//		  System.out.println(value);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for the radio button to be present
        WebElement gender = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//input[@type='radio' and @value='" + value + "']")
        ));

	     
		  Actions actions = new Actions(driver);
	        actions.moveToElement(gender).click().perform();

	        System.out.println(value + " radio button selected: " + gender.isSelected());
	    
	}

}
