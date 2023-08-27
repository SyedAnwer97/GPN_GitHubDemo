package com.GPN.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GPN_HomePage {
	
	WebDriver driver;
	public GPN_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath = "//*[@id=\"testInput\"]")
	//@FindBy(xpath = "//*[@id=\"testInputkeypad\"]")
	public WebElement SearchBar;
	
	@FindBy(xpath = "//i[@title='Option']")
	public WebElement SettingIcon;
	
	@FindBy(xpath = "//body/app-root[1]/app-main[1]/app-ui-options[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[1]/p-panelmenu[1]/div[1]/div[4]/div[1]/a[1]")
	public WebElement GeneralTab;
	
	public void SrBar(String Test) {
		SearchBar.click();
		SearchBar.clear();
		SearchBar.sendKeys(Test);
	}
	
	public void GPNSettingIcon() {
		SettingIcon.click();
	}
	
	public void GeneralTab() {
		GeneralTab.click();
	}
}
