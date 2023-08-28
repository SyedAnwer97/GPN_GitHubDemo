package com.GPN.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.GPN.POM.GPN_AddBulletIn;

public class Testcase003 extends BassClass {
	
	@Test(priority = 1)
	public void AddBulletIn() throws InterruptedException, IOException {
		
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_AddBulletIn addBulletIn = new GPN_AddBulletIn(driver);
		Thread.sleep(000);
		
		addBulletIn.AddBulletInIcon.click();
		Assert.assertTrue(addBulletIn.AddBulletInDialog.isDisplayed());
		
		Assert.assertFalse(addBulletIn.AddBulletInBtn.isEnabled());
		
		String S1 = RandomString()+randomnumeric();
		String S2 = RandomString()+randomnumeric();
		
		addBulletIn.BulletinTitle.clear();
		addBulletIn.BulletinTitle.sendKeys(S1);
		addBulletIn.BulletinText.clear();
		addBulletIn.BulletinText.sendKeys(S2);
		
		addBulletIn.AddBulletInBtn.click();
		Thread.sleep(200);
		
		if(addBulletIn.Confirmation_Title.getText().equals("COMPLETED") && addBulletIn.Cofirmation_Message.getText().equals("Bulletin is added successfully.")) {
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
		
		String BulletinBoardText = S1 + " : " + S2;
		Assert.assertTrue(addBulletIn.bulletinBoard.isDisplayed());

		if(addBulletIn.bulletinBoardText.getText().equals(BulletinBoardText)) {
			Assert.assertTrue(true);
		}else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void AI_report() throws IOException, InterruptedException {
		
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_AddBulletIn addBulletIn = new GPN_AddBulletIn(driver);
		
		addBulletIn.AI_reportIcon.click();
		Thread.sleep(500);
		if(driver.getTitle().equals("AiReport")) {
			Assert.assertTrue(true);
			addBulletIn.AI_reportHomeButton.click();
		} else {
			captureScreen(driver, nameofcurmethod);
			driver.navigate().back();
			Assert.assertTrue(false);
		}
		Thread.sleep(1000);
	}
}
