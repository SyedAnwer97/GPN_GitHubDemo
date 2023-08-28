package com.GPN.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.GPN.POM.GPN_AddMOitemAndProcess;

public class Testcase004 extends BassClass {
	@Test
	public void AddMoItem() throws InterruptedException {
		
		Thread.sleep(10000);
		//String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_AddMOitemAndProcess addMOitemAndProcess = new GPN_AddMOitemAndProcess(driver);
		
		Actions actions = new Actions(driver);
		actions.moveByOffset(610, 193).click().build().perform();
		Thread.sleep(1000);
		boolean isDisplayed= addMOitemAndProcess.AddMO_ItemDialog.isDisplayed();
		System.out.println(isDisplayed);
		
		addMOitemAndProcess.ProductNumberbox.clear();
		addMOitemAndProcess.ProductNumberbox.sendKeys(RandomString()+randomnumeric()); 
		Thread.sleep(2000);
		addMOitemAndProcess.ProductName.clear();
		addMOitemAndProcess.ProductName.sendKeys(RandomString()); 
		Thread.sleep(2000);
		//addMOitemAndProcess.LotSize.clear();
		addMOitemAndProcess.LotSize.sendKeys(randomnumeric());
		Thread.sleep(2000);
		//addMOitemAndProcess.LotSize.clear();
		addMOitemAndProcess.DueDate.sendKeys(presentdate()); 
		Thread.sleep(3000);
		addMOitemAndProcess.AddMO_Itembutton.click();
		
		WebElement Mes_Title = driver.findElement(By.xpath("/html/body/app-root/app-main/p-growl/div/div/div/div[2]/span"));
		System.out.println(Mes_Title.getText());
		
		WebElement Mes_Content = driver.findElement(By.xpath("/html/body/app-root/app-main/p-growl/div/div/div/div[2]/p"));
		System.out.println(Mes_Content.getText());
		
		//System.out.println(addMOitemAndProcess.TosteMessage.getText());
		//System.out.println(addMOitemAndProcess.TosteTitle.getText());
		Thread.sleep(5000);
	}
}

