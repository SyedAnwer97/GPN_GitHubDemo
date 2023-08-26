package com.GPN.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperatorLoginPage {
	
	WebDriver driver;
	
	public  OperatorLoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	@CacheLookup
	WebElement OpUsername;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement UserPasswrd;
	
	@FindBy(id="login")
	@CacheLookup
	WebElement LoginBtn;
	
	@FindBy(id="logout")
	@CacheLookup
	WebElement LogoutBtn;
	
	@FindBy(xpath = "/html/body/app-root/my-home/my-home-main/div/div[1]/div[2]/div[3]/div/input")
	WebElement Softwarelibarary;
	
	@FindBy(xpath = "/html/body/app-root/my-home/my-sis/div/div[1]/input")
	WebElement GPN;
	
	public void setOpUsername(String OpName) {
		OpUsername.sendKeys(OpName);
	}
	
	public void setOpPassWrd(String OpPasswrd) {
		UserPasswrd.sendKeys(OpPasswrd);
	}

	public void ClickLoginBtn() {
		LoginBtn.click();
	}
	
	public void clickLogoutBtn() {
		LogoutBtn.click();
	}
	
	public void ClksftwareLib() {
		Softwarelibarary.click();
	}
	
	public void ClkGPN() {
		GPN.click();
	}

}
