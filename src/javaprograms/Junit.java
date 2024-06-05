package maven.amazon;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	WebDriver driver;
	
@BeforeClass
private void beforeClass() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://adactinhotelapp.com/");
}

@BeforeMethod
private void beforeMethod() {
     Date date = new Date();
     System.out.println(date);
}

@Parameters({ "username" })
@Test
private void tc0(String s) {
WebElement findElement = driver.findElement(By.id("username"));
findElement.sendKeys();
}

@Parameters({ "password" })
@Test
private void tc01(String s) {
	WebElement findElement1 = driver.findElement(By.id("password"));
	findElement1.sendKeys(s);
}

@Parameters({ "login" })
@Test
private void tc02() {
	WebElement findElement2 = driver.findElement(By.id("login"));
	findElement2.click();
}

@AfterMethod
private void afterMethod(Method m) throws IOException {
	Date date = new Date();
    System.out.println(date);

}





}
