package com.GPN.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GPN_Toolbar {

	WebDriver driver;
	public GPN_Toolbar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/app-ui-titlebar/span/span[1]")
	@CacheLookup
	public WebElement HomeButton;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/ui-searchbar/div/div[1]/div/span")
	@CacheLookup
	public WebElement BeepProcessMode;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/ui-searchbar/div/div[2]/div/div[1]/button")
	@CacheLookup
	public WebElement QRScannner;
	
	@FindBy(xpath = "//input[@id='testInputkeypad']")
	@CacheLookup
	public WebElement SearchBar;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/ui-searchbar/div/div[2]/div/div[3]/button[1]")
	@CacheLookup
	public WebElement CancelSearch;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/ui-searchbar/div/div[2]/div/div[3]/button[2]")
	@CacheLookup
	public WebElement AdvanceSearch;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/ui-searchbar/div/div[2]/div/div[3]/button[3]")
	@CacheLookup
	public WebElement Searchbutton;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/div/app-ui-daterangepicker/div/div[1]/input")
	@CacheLookup
	public WebElement FromDate;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/div/app-ui-daterangepicker/div/div[3]/input")
	@CacheLookup
	public WebElement ToDate;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/div/button")
	@CacheLookup
	public WebElement DateRangeFilter;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[1]/p-dropdown/div/label")
	@CacheLookup
	public WebElement GPNModes;
	
	@FindBy(xpath = "//*[@id=\"user-info\"]/div/div[1]/app-ui-bulletinboard/form/div")
	@CacheLookup
	public WebElement BulletinBoard;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[1]/a/i")
	@CacheLookup
	public WebElement AddMO;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[2]/a/i")
	@CacheLookup
	public WebElement DeleteMO;
	
	@FindBy (xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[3]/a/i")
	@CacheLookup
	public WebElement AlfaDOCK_Setting;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[4]/a/i")
	@CacheLookup
	public WebElement GPN_Options;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[5]/a/i")
	@CacheLookup
	public WebElement AddBulletIn;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[6]/a/i")
	@CacheLookup
	public WebElement AI_Report;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[7]/a/i")
	@CacheLookup
	public WebElement ProcessStatusFilter;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[9]/a/i")
	@CacheLookup
	public WebElement Sorting;
	
	@FindBy(xpath ="//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[10]/a/i" )
	@CacheLookup
	public WebElement View;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[11]/a/i")
	@CacheLookup
	public WebElement ExpandCollapseMO;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[12]/a")
	@CacheLookup
	public WebElement ShowHideCalaender;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[13]/a/i")
	@CacheLookup
	public WebElement DownlaodCSV;
	
	@FindBy(xpath = "//*[@id=\"ToolBarDiv\"]/app-ui-toolbar/div/div[1]/div[2]/div/ul/li[14]/a")
	@CacheLookup
	public WebElement Priority;
	
}
