package readData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataProviderWithExel {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:50023/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider="exeldata")
	public void testDataProvider(String username,String password ) {
		
		 WebElement usernameField = driver.findElement(By.id("username"));
         usernameField.sendKeys(username
         		); // Use the value from Excel

     
         WebElement passwordField = driver.findElement(By.id("pass"));
         passwordField.sendKeys(password); // Use the value from Excel

         
        driver.findElement(By.xpath("//input[@value='Login']")).click();
         //loginButton.click();
		
	}
	@DataProvider(name="exeldata")
	public Object[][] exceldataMethod() throws IOException{
		String filename="C:\\Users\\Rahul Kolhe\\Desktop\\newexl1.xlsx";
		Object[][] searchdata=getexceldata(filename,"Sheet1");
		
		return searchdata;
		
	}
	public String [][] getexceldata(String filename,String sheetname) throws IOException{
		String [][] data=null;
		
		//File inputfile=new File("C:\\Users\\Rahul Kolhe\\Desktop\\newexl1.xlsx");

		FileInputStream file = new FileInputStream(filename);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		int maxRecords = sheet.getLastRowNum();
	    int lastcell=sheet.getRow(0) .getLastCellNum();
		  
		 System.out.println("maxRecords: " +maxRecords );
		 System.out.println("lastcell: " +lastcell );
		
        int recordCount = 0; 
        data=new String[maxRecords][lastcell];
       
        for (int rowIndex = 0; rowIndex < maxRecords; rowIndex++) {
        	for(int currentcol=0;currentcol<lastcell;currentcol++) {
//        		   XSSFCell cell = sheet.getRow(rowIndex).getCell(currentcol);
//        	//data[rowIndex][currentcol]=sheet.getRow(rowIndex).getCell(currentcol).getStringCellValue();
//       
//        	  data[rowIndex][currentcol] = cell.getStringCellValue();
//            System.out.println("data: " +data );
//            }
        		 XSSFRow row = sheet.getRow(rowIndex);
                
                     XSSFCell cell = row.getCell(currentcol);
                    
                         // Cell is not null, get the cell value
                         data[rowIndex][currentcol] = cell.getStringCellValue();
                     
                
                 System.out.println("data[" + rowIndex + "][" + currentcol + "]: " + data[rowIndex][currentcol]);
             }
        }
        workbook.close();
		return data;
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
