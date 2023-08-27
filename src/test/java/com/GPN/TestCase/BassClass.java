package com.GPN.TestCase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.GPN.POM.CustomerLoginPage;
import com.GPN.POM.OperatorLoginPage;
import com.GPN.Utilitys.Readconfig;
import com.GPN.Utilitys.XLUtilis;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {

	public static Logger logger;
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass()
	public void setup(String br) throws InterruptedException {

		Readconfig readconfig = new Readconfig();
		logger = Logger.getLogger("GPN");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		if (br.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		if (br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		logger.info(br + " Browser is launched");

		driver.get(readconfig.webURL());
		logger.info("The URL is opened and the URL is " + readconfig.webURL());
		driver.manage().window().maximize();
		CustomerLoginPage loginPage = new CustomerLoginPage(driver);
		loginPage.slectingLangauge(readconfig.GPNLangauge());
		loginPage.setUserName(readconfig.GetCustomername());
		loginPage.setPassword(readconfig.GetPassword());
		loginPage.clickLoginBtn();
		logger.info("The Customer Login is completed");

		Thread.sleep(1500);
		OperatorLoginPage loginPage2 = new OperatorLoginPage(driver);
		loginPage2.setOpUsername(readconfig.GetOpname());
		loginPage2.setOpPassWrd(readconfig.GetOpPassword());
		loginPage2.ClickLoginBtn();
		logger.info("The Operator Login is completed");
		
		Thread.sleep(1500);
		String title = driver.getTitle();

		if (title.equals("alfaDOCK")) {
			logger.info("Landed In AlfaDOCK Home Page");
			loginPage2.ClksftwareLib();
			Thread.sleep(2000);
			String ParentWindow  = driver.getWindowHandle();
			loginPage2.ClkGPN();
			logger.info("Passed the software lib and Opened the GPN");
			Thread.sleep(2000);
			
			Set<String> windowhandles = driver.getWindowHandles();
			if (windowhandles.size()>1) {
				for (String string : windowhandles) {
					if (!string.equals(ParentWindow)) {
						driver.switchTo().window(string);
					}
				}
			}
			
		else if (title.equals("SI Scheduler")) {
			Thread.sleep(2000);
			logger.info("Landed In GPN");
		}
	}
	}

	@DataProvider(name = "LoginData")
	public String[][] data() throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\com\\GPN\\TestData\\LoginData.xlsx";
		String SheetName = "Sheet1";
		XLUtilis utilis = new XLUtilis(path);
		int TotalRowCount = utilis.GetRowCount(SheetName);
		int TotalCellCount = utilis.GetCellCount(SheetName, 1);
		String[][] Logindata = new String[TotalRowCount][TotalCellCount];
		for (int i = 1; i <= TotalRowCount; i++) {
			for (int j = 0; j < TotalCellCount; j++) {
				Logindata[i - 1][j] = utilis.GetCellData(SheetName, i, j);
			}
		}
		return Logindata;
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	public String RandomString() {
		String GenratedString = RandomStringUtils.randomAlphabetic(7);
		return GenratedString;
	}

	public String randomnumeric() {
		String Generatednumeric = RandomStringUtils.randomNumeric(7);
		return Generatednumeric;
	}

	public String presentdate() {
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		return timeStamp;
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
