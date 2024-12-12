package readData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadData {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.drive", "D:\\automation\\chromedriver-win64");
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		File inputfile=new File("C:\\Users\\Rahul Kolhe\\Desktop\\newexl1.xlsx");
		FileInputStream file = new FileInputStream(inputfile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int maxRecords = sheet.getLastRowNum();
		int rowIndex = 0;
		  int lastcell=sheet.getRow(rowIndex)  .getLastCellNum();
		 System.out.println("maxRecords: " +maxRecords );
		 System.out.println("lastcell: " +lastcell );
		// Set the maximum number of records to read
        int recordCount = 0; 
        for ( rowIndex = 1; rowIndex <= maxRecords; rowIndex++) {
            Row row = sheet.getRow(rowIndex);
              
                String username = row.getCell(0).toString();
                String password = row.getCell(1).getStringCellValue();
                System.out.println("Username: " + username + ", Password: " + password);
               
                driver.get("http://localhost:4200/auth/login");

           
                WebElement usernameField = driver.findElement(By.id("username"));
                usernameField.sendKeys(username
                		); // Use the value from Excel

            
                WebElement passwordField = driver.findElement(By.id("pass"));
                passwordField.sendKeys(password); // Use the value from Excel

                
               driver.findElement(By.xpath("//input[@value='Login']")).click();
                //loginButton.click();

            
        }
        driver.close();
    	int lastRowNum = sheet.getLastRowNum();
//		//System.out.println(lastRowNum);
		//Row newRow = sheet.createRow(maxRecords + 1);
        Row newrow=sheet.createRow(lastRowNum+1);
        newrow.createCell(0).setCellValue("ppcb");
        newrow.createCell(1).setCellValue("ppcb");
        FileOutputStream add=new FileOutputStream("C:\\Users\\Rahul Kolhe\\Desktop\\newexl1.xlsx");
        workbook.write(add);
        
        driver.close();
//		for (Row row : sheet) {
//			if (recordCount >= maxRecords) {
//                break;
//			}
//			for (Cell cell : row) {
//				String cellValue = cell.toString();
//				System.out.print(cellValue + " :: ");
//			}
//			System.out.println();
//			recordCount++;
//		}
//		Cell cell = sheet.getRow(1).getCell(2);
//		if (cell != null) {
//		    System.out.println("Cell exists: " + cell.toString());
//		} else {
//		    System.out.println("Cell does not exist.");
//		}
//
//		
//		int lastRowNum = sheet.getLastRowNum();
//		//System.out.println(lastRowNum);
//		Row newRow = sheet.createRow(lastRowNum + 1); // Create a new row at the end
//		newRow.createCell(0).setCellValue("27-09-2024");
//		newRow.createCell(1).setCellValue("8 to 9 - morning");
//		newRow.createCell(2).setCellValue("3 hr");
//			
//            try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Rahul Kolhe\\Desktop\\priyaEx.xlsx")) {
//                workbook.write(fileOutputStream);
//            }
//
//		System.out.println("Data written successfully!");

		// Close the workbook and file input stream
	workbook.close();
	file.close();
		

        }
}