package com.GPN.TestCase;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.GPN.POM.AlfaDOCK_GPN_Opions;
import com.GPN.POM.GPN_AddMO;

public class Testcase002 extends BassClass {
	
	String PONum = "aaa"+ RandomString();
	
	@Test(priority = 1)
	public void AddMO() throws InterruptedException, IOException {
		
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(5000);
		GPN_AddMO addMO = new GPN_AddMO(driver);
		addMO.AddMOIcon.click();
		addMO.CustomerName.click();
	
		Actions actions = new Actions(driver);
		actions.click(addMO.CustomerNameDropDown.get(0)).build().perform();
		
		addMO.PO_Number.clear();
		//String PONum = RandomString();
		addMO.PO_Number.sendKeys(PONum);
		
		addMO.DeliveryPlace.clear();
		addMO.DeliveryPlace.sendKeys(RandomString()+randomnumeric());
		
		addMO.AddMO_Button.click();
		
		if (addMO.Toste_Title.getText().equals("COMPLETED") && addMO.Toste_Message2.getText().equals(PONum + " is added successfully")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
		}
	
	
	@Test(priority = 2)
	public void AlfaDOCKOptions() throws IOException, InterruptedException {
		
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		AlfaDOCK_GPN_Opions alfaDOCK_GPN_Opions = new AlfaDOCK_GPN_Opions(driver);
		
		alfaDOCK_GPN_Opions.AlfaDOCK_Option.click();
		String title= driver.getTitle();
		
		if(title.equals("alfaDOCK")) {
			Assert.assertTrue(true);
			driver.navigate().back();
			Thread.sleep(2000);
		} else {
			captureScreen(driver, nameofcurmethod);
			driver.navigate().back();
			Thread.sleep(2000);
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 3)
	public void GPNSetting() throws IOException, InterruptedException {
		
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		Thread.sleep(2000);
		AlfaDOCK_GPN_Opions alfaDOCK_GPN_Opions = new AlfaDOCK_GPN_Opions(driver);
		
		alfaDOCK_GPN_Opions.GPN_SettingIcon.click();
	
		if(alfaDOCK_GPN_Opions.GPN_SettingDialogBox.isDisplayed()) {
		Assert.assertTrue(true);
		}else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}
}
