package com.GPN.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GPN_AddMOitemAndProcess {
	
	WebDriver driver;
	public GPN_AddMOitemAndProcess(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[3]/div")
	@CacheLookup
	public WebElement AddMO_ItemDialog;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[3]/div/div[2]/div[1]/input")
	@CacheLookup
	public WebElement ProductNumberbox;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[3]/div/div[2]/div[2]/input")
	@CacheLookup
	public WebElement ProductName;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[3]/div/div[2]/div[3]/div/div[1]/input")
	@CacheLookup
	public WebElement DrawingNO;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[3]/div/div[2]/div[4]/div/input")
	@CacheLookup
	public WebElement LotSize;
	
	@FindBy(xpath ="/html/body/app-root/app-main/p-dialog[3]/div/div[2]/div[5]/input")
	@CacheLookup
	public WebElement DueDate;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[3]/div/div[2]/button[2]")
	@CacheLookup
	public WebElement AddMO_Itembutton;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-growl/div/div/div/div[2]/span")
	@CacheLookup
	public WebElement TosteTitle;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-growl/div/div/div/div[2]/p")
	@CacheLookup
	public WebElement TosteMessage;
	
}
