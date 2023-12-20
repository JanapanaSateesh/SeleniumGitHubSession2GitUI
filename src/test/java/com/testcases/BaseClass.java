package com.testcases;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	ReadConfig rdconfig;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	
	@BeforeTest
	public void startExtent() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now).toString();
		System.out.println("Curr Date "+ date);
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("./Reports/report"+date+".html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Suneratech Summary Report");
		extent.attachReporter(spark);
	}
	
	@AfterTest
	public void endExtent() {
		System.out.println("Flush Report");
		extent.flush();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {

		
		rdconfig=new ReadConfig();
		driver=new ChromeDriver();
		String url=rdconfig.getUrl();
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		//I am from git hub through UI

	}
	
}
