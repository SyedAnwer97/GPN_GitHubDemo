package com.GPN.Utilitys;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting extends TestListenerAdapter {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports Extent;
	public ExtentTest logger;
	
  
	public void onStart(ITestContext testContext) {
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		String repName = "TestReport"+ timeStamp + ".html";
		sparkReporter = new ExtentSparkReporter("./"+"/test-output/" + repName);
		try {
			sparkReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Extent = new ExtentReports();
		
		Extent.attachReporter(sparkReporter);
		Extent.setSystemInfo("HostName", "LoaclHost");
		Extent.setSystemInfo("Environment", "QA");
		Extent.setSystemInfo("Tester", "Anwer");
	}
	
	public void onTestSuccess(ITestResult tr) {
		logger=Extent.createTest(tr.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult tr) {
		
		
		logger= Extent.createTest(tr.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
				
		
		String screenshotpath= System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		File f = new File(screenshotpath);
	
		if(f.exists()) {
			try {
				logger.fail("screenshot is below: " + logger.addScreenCaptureFromPath(screenshotpath));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}	
		}
	
		public void onTestSkipped(ITestResult tr) {
		logger=Extent.createTest(tr.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
		}
		
		public void onFinish(ITestContext testContext) {
			Extent.flush();
		}	
}
