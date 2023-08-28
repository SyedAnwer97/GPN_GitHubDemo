package com.GPN.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GPN_AddBulletIn {

	WebDriver driver;
	public GPN_AddBulletIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[5]/a/i")
	@CacheLookup
	public WebElement AddBulletInIcon;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[4]/div")
	@CacheLookup
	public WebElement AddBulletInDialog;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[4]/div/div[2]/div[2]/div/input")
	@CacheLookup
	public WebElement BulletinTitle;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[4]/div/div[2]/div[3]/textarea")
	@CacheLookup
	public WebElement BulletinText;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[4]/div/div[2]/button[2]")
	@CacheLookup
	public WebElement AddBulletInBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[4]/div/div[2]/button[1]")
	@CacheLookup
	public WebElement CancelBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-growl/div/div/div/div[2]/span")
	@CacheLookup
	public WebElement Confirmation_Title;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-growl/div/div/div/div[2]/p")
	@CacheLookup
	public WebElement Cofirmation_Message;
	
	@FindBy(xpath = "//*[@id=\"user-info\"]/div/div[1]/app-ui-bulletinboard/form/div")
	@CacheLookup
	public WebElement bulletinBoard;
	
	@FindBy(xpath = "//*[@id=\"user-info\"]/div/div[1]/app-ui-bulletinboard/form/div/div/div/div/div[2]")
	@CacheLookup
	public WebElement bulletinBoardText;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[6]/a/i")
	@CacheLookup
	public WebElement AI_reportIcon;
	
	@FindBy(xpath = "/html/body/app-root/app-si-scheduler/div[1]/app-ui-toolbar/div[1]/span")
	@CacheLookup
	public WebElement AI_reportHomeButton;
	
}
