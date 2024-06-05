package maven.amazon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	List<WebElement> list = driver.findElements(By.id("countries"));
	
	File file = new File("C:\\Users\\Reavvanth R\\eclipse-workspace\\Excelcreation\\datasheet\\Book1.xlsx");
	
	Workbook workbook = new XSSFWorkbook();
	
	Sheet sheet = workbook.createSheet("country");
	
	for (int i = 0; i <list.size(); i++) {
		WebElement element = list.get(i);
		String text = element.getText();
		System.out.println(text);
		
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		
		cell.setCellValue(text);
	}
	
	FileOutputStream stream = new FileOutputStream(file);
	workbook.write(stream);
}
}
