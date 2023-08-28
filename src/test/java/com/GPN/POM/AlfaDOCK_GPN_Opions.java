package com.GPN.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlfaDOCK_GPN_Opions {

	WebDriver driver;
	public AlfaDOCK_GPN_Opions(WebDriver driver) {
			 this.driver =driver; 
			 PageFactory.initElements(driver, this);
	};
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[3]/a/i")
	@CacheLookup
	public WebElement AlfaDOCK_Option;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[4]/a/i")
	public WebElement GPN_SettingIcon;
	
	@FindBy(xpath = "/html/body/app-root/app-main/app-ui-options/p-dialog/div")
	public WebElement GPN_SettingDialogBox;
	
}

