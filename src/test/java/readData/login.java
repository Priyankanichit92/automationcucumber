package readData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.drive", "D:\\automation\\chromedriver-win64");
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		String username = "super"; // Replace with your username
        String password = "admin"; // Replace with your password
        driver.get("http://localhost:4200/auth/login?username=" + username + "&password=" + password);
        WebElement usernameField = driver.findElement(By.id("username")); // Use the appropriate locator
        usernameField.sendKeys(username);

        // Find the password input field by its name, ID, or CSS selector
        WebElement passwordField = driver.findElement(By.id("pass")); // Use the appropriate locator
        passwordField.sendKeys(password);

        // Find the login button by its name, ID, or CSS selector
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']")); // Adjust as needed
        loginButton.click();
        

	}

}
