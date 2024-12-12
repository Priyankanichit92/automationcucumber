package readData;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextFile  {

	public static void main(String[] args)throws Exception {
		
System.setProperty("webdriver.chrome.drive", "D:\\automation\\chromedriver-win64");
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\Rahul Kolhe\\Desktop\\priya.txt");
		FileReader fr=new FileReader("C:\\\\Users\\\\Rahul Kolhe\\\\Desktop\\\\priya.txt");
		int content;
		BufferedReader br =new BufferedReader(fr);
		try  {
			String line;
			while ((line = br.readLine())!=null) {
				  System.out.println(line);
//			  while ((content = fis.read()) != -1) {
//	                // Print each byte as a character
//	                System.out.println((char) content);
	            }

                
                
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close the browser after processing all lines
            driver.quit();
        }

		System.out.print("hiii");
	}

}
