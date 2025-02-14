package MaphasisQue;

import java.util.Optional;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.network.Network;
import org.openqa.selenium.devtools.v118.network.model.Response;



public class BrowserInfo {

	public static void main(String[] args) {
		// Set the path for the ChromeDriver (adjust path to your system)
		System.setProperty("webdriver.chrome.drive", "D:\\automation\\chromedriver-win64");

		// Initialize ChromeDriver with options
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
	//	options.addArguments("--headless", "--disable-dev-shm-usage", "--no-sandbox");

		//options.addArguments("--headless");
		DevTools dev=driver.getDevTools();

	

		dev.createSession();

		dev.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		dev.addListener(Network.responseReceived(),responseReceived->{
			Response response=responseReceived.getResponse();
			String url=response.getUrl();
			int status=response.getStatus();
			System.out.println(url);
			System.out.println(status);
		
			
			
		});
		driver.get("https://www.facebook.com/");

		Capabilities caps = driver.getCapabilities();

		// Get Browser Information
		String browserName = caps.getBrowserName();  // e.g., "chrome"
		String browserVersion=caps.getBrowserVersion();
		String platform=caps.getPlatformName().toString(); 
		boolean isHeadless = caps.getCapability("headless") != null&& (Boolean) caps.getCapability("headless");;

		System.out.println("Browser Name: " + browserName);
		System.out.println("Browser Version: " + browserVersion);
		System.out.println("Platform: " + platform);
		System.out.println("Is Headless Mode: " + isHeadless);

		// Close the driver
		driver.quit();
	}
}
