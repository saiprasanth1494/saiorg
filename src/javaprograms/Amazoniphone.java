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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazoniphone {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
	element.sendKeys("iphone",Keys.ENTER);
	
List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	
	//File file = new File("C:\\Users\\Reavvanth R\\eclipse-workspace\\Baba\\data\\Book1.xlsx");
	File file = new File("C:\\Users\\Reavvanth R\\eclipse-workspace\\Excelcreation\\datasheet\\Book1.xlsx");
	Workbook workbook = new XSSFWorkbook();
	Sheet sheet = workbook.createSheet("hi");
	
	for (int i = 0; i <list.size(); i++) {
		WebElement get = list.get(i);
		String text = get.getText();
		System.out.println(text);
		
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		
		cell.setCellValue(text);
	}
	//FileOutputStream stream = new FileOutputStream(file);
	
	FileOutputStream stream = new FileOutputStream(file);
	workbook.write(stream);
}
}
