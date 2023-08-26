package com.GPN.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerLoginPage {

	WebDriver driver;

	public CustomerLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement CusUserName;

	@FindBy(id = "password")
	WebElement CusPassword;

	@FindBy(id = "logmein")
	WebElement LoginBtn;

	@FindBy(id = "mySelect")
	WebElement SelectLangauge;

	public void setUserName(String Uname) {
		CusUserName.sendKeys(Uname);
	}

	public void setPassword(String Password) {
		CusPassword.sendKeys(Password);
	}

	public void clickLoginBtn() {
		LoginBtn.click();
	}

	public void slectingLangauge(String langauge) {
		SelectLangauge.click();
		Select select = new Select(SelectLangauge);
		select.selectByVisibleText(langauge);
	}

}
