package MaphasisQue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TooltipInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive", "D:\\automation\\chromedriver-win64");
		//		
		//
		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//  driver.get("https://www.programiz.com/sql/online-compiler/");
		// driver.findElement(By.xpath("//img[@alt='Programiz Logo'] ")).click();
		driver.get("https://www.facebook.com/");
		


		//driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("Title");
		WebElement ele=driver.findElement(By.xpath("//a[@href='/reg/']"));
		System.out.println(driver.getTitle());
//		Actions act=new Actions(driver);
//		act.moveToElement(ele).perform();
		System.out.println(ele.getAttribute("Title"));
;		//driver.close();
	}
}
