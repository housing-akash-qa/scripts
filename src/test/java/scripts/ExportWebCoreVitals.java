package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExportWebCoreVitals {

	String driverPath = System.getProperty("user.dir") + "/chromedriver";

	WebDriver driver;

	ExportWebCoreVitalsPage ep;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1, description = "Poor : export mobile cls more than 0.25")
	public void loginGmailandExport() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAQQAhgD");
		ep = new ExportWebCoreVitalsPage(driver);
		ep.setUserName("test.automationhousing@gmail.com");
		ep.clickNextButtonOnEmail();
		Thread.sleep(3000);
		ep.setPassword("housing@123");
		ep.clickNextButtonOnPassword();
		Thread.sleep(10000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}

	@Test(priority = 2, description = "Poor : export mobile lcp longer than 4sec")
	public void test2() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAMQAhgD");
		Thread.sleep(5000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}
	
	@Test(priority = 3, description = "Improvement : export mobile cls more than 0.25")
	public void test3() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAQQAhgC");
		Thread.sleep(5000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}
	
	@Test(priority = 4, description = "Improvement : export mobile lcp more than 2.5sec")
	public void test4() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAMQAhgC");
		Thread.sleep(5000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}
	
	//Desktop
	@Test(priority = 5, description = "Poor : export desktop cls more than 0.25")
	public void test5() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAQQARgD");
		Thread.sleep(5000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}
	
	@Test(priority = 6, description = "Poor : export desktop lcp longer than 4sec")
	public void test6() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAMQARgD");
		Thread.sleep(5000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}
	
	@Test(priority = 7, description = "Improvement : export desktop cls more than 0.1 sec")
	public void test7() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAQQARgC");
		Thread.sleep(5000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}
	
	@Test(priority = 8, description = "Improvement : export desktop lcp longer than 2.5sec")
	public void test8() throws InterruptedException {
		driver.get("https://search.google.com/search-console/core-web-vitals/drilldown?resource_id=https%3A%2F%2Fhousing.com%2F&item_key=CAMQARgC");
		Thread.sleep(5000);
		ep.clickExportButton();
		Thread.sleep(5000);
		ep.clickGoogleSheets();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.close();
		driver.switchTo().window(newTb.get(0));
	}


}
