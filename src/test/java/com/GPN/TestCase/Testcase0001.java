package com.GPN.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.GPN.POM.GPN_HomePage;
import com.GPN.POM.GPN_Toolbar;



public class Testcase0001 extends BassClass {
	
	@Test(priority = 0)
	public void VisiblityOfHomeButton() throws IOException, InterruptedException {
		Thread.sleep(5000);
		GPN_HomePage gpn_HomePage = new GPN_HomePage(driver);
		gpn_HomePage.GPNSettingIcon();
		Thread.sleep(2000);
	
	}
	
	@Test(priority = 3)
	public void VisiblityOfSearchbar() throws IOException {
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean SearchbarDisplayed = toolbar.SearchBar.isDisplayed();
		if (SearchbarDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	/*GPN_Toolbar toolbar = new GPN_Toolbar(driver);
	
	@Test(priority = 0)
	public void VisiblityOfHomeButton() throws IOException, InterruptedException {
		Thread.sleep(3000);
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean HomeButtonDisplayed = toolbar.HomeButton.isDisplayed();
		if (HomeButtonDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			System.out.println(nameofcurmethod + " Is Not Displayed");
			Assert.assertTrue(false);
			System.out.println(nameofcurmethod + " Is Not Displayed2");
		}
	}

	@Test(priority = 1)
	public void VisiblityOfBeepProcessMode() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean BeepModeBtnDisplayed = toolbar.BeepProcessMode.isDisplayed();
		if (BeepModeBtnDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 2)
	public void VisiblityOfQRScanner() throws IOException {
		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean BarcodeScannerDisplayed = toolbar.QRScannner.isDisplayed();
		if (BarcodeScannerDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 3)
	public void VisiblityOfSearchbar() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean SearchbarDisplayed = toolbar.SearchBar.isDisplayed();
		if (SearchbarDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 4)
	public void VisiblityOfCancelSearch() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean cancelsearchbarDisplayed = toolbar.CancelSearch.isDisplayed();
		if (cancelsearchbarDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 5)
	public void VisiblityOfAdvanceSearch() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);

		boolean advancesearchbarDisplayed = toolbar.AdvanceSearch.isDisplayed();
		if (advancesearchbarDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 6)
	public void VisiblityOfSearchButton() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean searchiconDisplayed = toolbar.Searchbutton.isDisplayed();
		if (searchiconDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 7)
	public void VisiblityOfFromDate() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean FromDateRangeDisplayed = toolbar.FromDate.isDisplayed();
		if (FromDateRangeDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 8)
	public void VisiblityOfToDate() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean ToDateRangeDisplayed = toolbar.ToDate.isDisplayed();
		if (ToDateRangeDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 9)
	public void VisiblityOfDateFilter() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean DateFiltericonDisplayed = toolbar.DateRangeFilter.isDisplayed();
		if (DateFiltericonDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 10)
	public void VisiblityofGPNModes() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean GPNModesDisplayed = toolbar.GPNModes.isDisplayed();
		if (GPNModesDisplayed) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 11)
	public void VisiblityofBulletinBoard() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean BulletBoardBox = toolbar.AddMO.isDisplayed();
		if (BulletBoardBox) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 12)
	public void VisiblityofAddMO() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean AddMOIcon = toolbar.AddMO.isDisplayed();
		if (AddMOIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 13)
	public void VisiblityofDeleteMO() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean DeleteMOIcon = toolbar.DeleteMO.isDisplayed();
		if (DeleteMOIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 14)
	public void VisiblityofAlfaDOCK_Setting() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean AlfaDOCK_SettingIcon = toolbar.AlfaDOCK_Setting.isDisplayed();
		if (AlfaDOCK_SettingIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 15)
	public void VisiblityofGPN_Options() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean GPN_OptionsIcon = toolbar.GPN_Options.isDisplayed();
		if (GPN_OptionsIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 16)
	public void VisiblityofAddBulletIn() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean AddBulletInIcon = toolbar.AddBulletIn.isDisplayed();
		if (AddBulletInIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 17)
	public void VisiblityofAI_Report() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean AI_ReportIcon = toolbar.AI_Report.isDisplayed();
		if (AI_ReportIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 18)
	public void VisiblityofProcessStatusFilter() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean ProcessStatusFilterIcon = toolbar.ProcessStatusFilter.isDisplayed();
		if (ProcessStatusFilterIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 19)
	public void VisiblityofSorting() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean SortingIcon = toolbar.Sorting.isDisplayed();
		if (SortingIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 20)
	public void VisiblityofView() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean ViewIcon = toolbar.View.isDisplayed();
		if (ViewIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 21)
	public void VisiblityofExpandCollapseMO() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean ExpandCollapseMOIcon = toolbar.ExpandCollapseMO.isDisplayed();
		if (ExpandCollapseMOIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 22)
	public void VisiblityofShowHideCalaender() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean ShowHideCalaenderIcon = toolbar.ShowHideCalaender.isDisplayed();
		if (ShowHideCalaenderIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 23)
	public void VisiblityofDownlaodCSV() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean DownlaodCSVIcon = toolbar.DownlaodCSV.isDisplayed();
		if (DownlaodCSVIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 24)
	public void VisiblityofPriority() throws IOException {

		String nameofcurmethod = new Throwable().getStackTrace()[0].getMethodName();
		GPN_Toolbar toolbar = new GPN_Toolbar(driver);
		boolean PriorityIcon = toolbar.Priority.isDisplayed();
		if (PriorityIcon) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, nameofcurmethod);
			Assert.assertTrue(false);
		}
	}*/

}
