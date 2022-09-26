package accproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import acproject.AcceProject1;
import acproject.Base;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AccPractice1 extends AcceProject1 {

	AcceProject1 ap=new AcceProject1();
	
	protected void printName() {

		System.out.println("Vikram");
	}

	@Test
	public void TestCase1() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vikram\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		ap.Exelsheet();
		
		
		
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//
//		driver.findElement(By.id("alertbtn")).click();
//
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		js.executeScript("(scrollBy(0,2200))");
//		Thread.sleep(2000);
//
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//a[text()='Broken Link']"))).build().perform();

//		WebElement column1 = driver
//				.findElement(By.xpath("//a[text()='Discount Coupons']/parent::h3/parent::li/parent::ul"));
//
//		int linkcount = column1.findElements(By.tagName("a")).size();
//
//		for (int i = 1; i <= linkcount-1; i++) {
//
//			String mulkeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
//
//			column1.findElements(By.tagName("a")).get(i).sendKeys(mulkeys);
//			
//		}
//
//	Set<String> windows=driver.getWindowHandles();
//	
//	Iterator<String> it=windows.iterator();
//	
//	
//	while(it.hasNext())
//	{
//
//		driver.switchTo().window((it.next()));
//	
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		
//	}
//	

	}
}
