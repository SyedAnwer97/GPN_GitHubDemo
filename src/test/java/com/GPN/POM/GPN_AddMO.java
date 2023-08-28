package com.GPN.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GPN_AddMO {
	
	WebDriver driver;
	public GPN_AddMO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[1]/a/i")
	public WebElement AddMOIcon;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[1]/div/div[2]/div[1]/p-dropdown/div/label")
	public WebElement CustomerName;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[1]/div/div[2]/div[1]/p-dropdown/div/div[4]/div[2]/ul/li")
	public List<WebElement> CustomerNameDropDown;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[1]/div/div[2]/div[2]/input")
	public WebElement PO_Number;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[1]/div/div[2]/div[3]/input")
	public WebElement DeliveryPlace;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[1]/div/div[2]/button[1]/span[2]")
	public WebElement Cancelbtn;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-dialog[1]/div/div[2]/button[2]/span[2]")
	public WebElement AddMO_Button;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-growl/div/div/div/div[2]")
	public WebElement Toste_Message;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-growl/div/div/div/div[2]/span")
	public WebElement Toste_Title;
	
	@FindBy(xpath = "/html/body/app-root/app-main/p-growl/div/div/div/div[2]/p")
	public WebElement Toste_Message2;
	
	
	
}
