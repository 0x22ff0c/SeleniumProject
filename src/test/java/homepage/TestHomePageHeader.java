package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.header.HomePageHeader;
import pages.homepage.header.HomePageMenuItems;
import tests.BaseTest;
import utilities.Listener;

public class TestHomePageHeader {

	HomePageHeader homePageHeader;
	
	HomePageMenuItems homePageMenuItems;
	
	BaseTest baseTest;

	@BeforeClass
	private void setup(){

		baseTest = new BaseTest();
		
		WebDriver driver = Listener.getDriver();
		
		homePageHeader = new HomePageHeader(driver, baseTest);
		
		homePageMenuItems = new HomePageMenuItems(driver, baseTest);
		
	}
	
	/**
	 * Verifies the elements in the header.
	 * 
	 * <ul>
	 * 	<li>Header container</li>
	 * 	<li>Home logo</li>
	 * 	<li>Tutorials button</li>
	 * 	<li>Tutorials caret button</li>
	 * 	<li>References button</li>
	 * 	<li>References caret button</li>
	 * 	<li>Exercises button</li>
	 * 	<li>Exercises caret button</li>
	 * 	<li>Videos button</li>
	 * 	<li>Theme toggle button</li>
	 * 	<li>Translate button</li>
	 * 	<li>Search button</li>
	 * 	<li>Upgrade button</li>
	 * 	<li>Certified button</li>
	 * 	<li>Free website button</li>
	 * 	<li>Login button</li>
	 * </ul>
	 */
	@Test(testName = "Verify Home page header elements", priority =  1)
	private void testHomePageHeaderElements(){

		baseTest.setSoftAssertion(Listener.getAssertion());
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getHeader());

		baseTest.verifyElementIsDisplayed(homePageHeader.getHomeLogo());

		baseTest.verifyElementIsDisplayed(homePageHeader.getTutorialsButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getTutorialsCaretButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getReferencesButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getReferencesCaretButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getExercisesButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getExercisesCaretButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getVideosButton());

		baseTest.verifyElementIsDisplayed(homePageHeader.getThemeToggle());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getTranslateButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getSearchButton());
	
		baseTest.verifyElementIsDisplayed(homePageHeader.getUpgradeButton());
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getCertifiedButton());
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getFreeWebsiteButton());
		
		baseTest.verifyElementIsDisplayed(homePageHeader.getLoginButton());
		
		baseTest.assertAll();
		
	}
	
	@Test(testName = "Verify header menu items", priority =  2)
	private void testHeaderMenuItems(){
		
		homePageMenuItems.clickTutorialsButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsCaretButton());

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsCloseButton());
		
		homePageMenuItems.clickTutorialsCloseButton();
		
		homePageMenuItems.clickReferencesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesCloseButton());
		
		homePageMenuItems.clickReferencesCloseButton();
		
		homePageMenuItems.clickExercisesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCloseButton());
		
		homePageMenuItems.clickExercisesCloseButton();
		
		baseTest.assertAll();
		
	}
	
}
