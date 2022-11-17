package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.homepage.header.HomePageHeader;
import pages.homepage.header.HomePageMenuItems;
import tests.BaseTest;
import utilities.Listener;

public class TestHomePageHeader {

	HomePageMenuItems homePageMenuItems;
	
	BaseTest baseTest;
	
	WebDriver driver;

	@BeforeClass
	private void setup(){

		driver = Listener.getDriver();
		
	}

	String categoryName = "";
	
	String[] categoryItems = new String[]{};
	
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

		HomePageHeader homePageHeader = new HomePageHeader(driver);
		
		baseTest = new BaseTest(homePageHeader);
		
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
	
	private void verifyCategoryItems(WebElement element, String[] categoryItems){
		
		baseTest.verifyElementIsDisplayed(element);

		for(String categoryItem : categoryItems){
			
			baseTest.verifyElementIsDisplayed(homePageMenuItems.getCategoryItem(categoryItem));
			
		}
		
	}
	
	@Test(testName = "Verify Tutorial menu items", priority = 2)
	private void testTutorialMenuIems(){

		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickTutorialsButton();

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsMenuContainer());

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsMenuHeader());
		
		String categoryName = "HTML and CSS";

		String[] categoryItems = new String[]{"Learn HTML", "Learn CSS", "Learn RWD", "Learn Bootstrap", "Learn W3.CSS", "Learn Colors", 
				"Learn Icons", "Learn Graphics", "Learn SVG", "Learn Canvas", "Learn How To", "Learn Sass"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "JavaScript";

		categoryItems = new String[]{"Learn JavaScript", "Learn jQuery", "Learn React", "Learn AngularJS", "Learn JSON",
				"Learn AJAX", "Learn AppML", "Learn W3.JS"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(categoryName), categoryItems);
				
		categoryName = "Programming";
		
		categoryItems = new String[]{"Learn Python", "Learn Java", "Learn C", "Learn C++", "Learn C#", "Learn R", 
				"Learn Kotlin", "Learn Go", "Learn Django", "Learn TypeScript"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "Server Side";
		
		categoryItems = new String[]{"Learn SQL", "Learn MySQL", "Learn PHP", "Learn ASP", "Learn Node.js",
				"Learn Raspberry Pi", "Learn Git", "Learn MongoDB", "Learn AWS Cloud"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "Web Building";
		
		categoryItems = new String[] {"Create a Website ", "Where To Start", "Web Templates", "Web Statistics", "Web Certificates",
				"Web Development", "Code Editor", "Test Your Typing Speed", "Play a Code Game", "Cyber Security", "Accessibility", "Join our Newsletter"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "Data Analytics";
		
		categoryItems = new String[] {"Learn AI", "Learn Machine Learning", "Learn Data Science", "Learn NumPy", "Learn Pandas",
				"Learn SciPy", "Learn Matplotlib", "Learn Statistics", "Learn Excel", "Learn Google Sheets"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "XML Tutorials";
		
		categoryItems = new String[] {"Learn XML", "Learn XML AJAX", "Learn XML DOM", "Learn XML DTD", "Learn XML Schema",
				"Learn XSLT", "Learn XPath", "Learn XQuery"};
		
		verifyCategoryItems(homePageMenuItems.getTutorialsMenuCategoryName(categoryName), categoryItems);
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsCaretButton());

		baseTest.verifyElementIsDisplayed(homePageMenuItems.getTutorialsCloseButton());
		
		homePageMenuItems.clickTutorialsCloseButton();
		
		baseTest.assertAll();
		
	}
	
	
	@Test(testName = "Verify References menu items", priority = 3)
	private void testReferencesMenuItems(){
		
		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickReferencesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesMenuContainer());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesMenuHeader());
		
		categoryName = "HTML";
		
		categoryItems = new String[]{"HTML Tag Reference", "HTML Browser Support", "HTML Event Reference", "HTML Color Reference", "HTML Attribute Reference"
				,"HTML Canvas Reference", "HTML SVG Reference", "Google Maps Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "CSS";
		
		categoryItems = new String[]{"CSS Reference", "CSS Browser Support", "CSS Selector Reference", "Bootstrap 3 Reference", "Bootstrap 4 Reference"
				,"W3.CSS Reference", "Icon Reference", "Sass Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "JavaScript";
		
		categoryItems = new String[]{"JavaScript Reference", "HTML DOM Reference", "jQuery Reference", "AngularJS Reference", "AppML Reference"
				,"W3.JS Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);
		
		categoryName = "Programming";
		
		categoryItems = new String[]{"Python Reference", "Java Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		categoryName = "Server Side";
		
		categoryItems = new String[]{"SQL Reference", "MySQL Reference", "PHP Reference", "ASP Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		categoryName = "XML";
		
		categoryItems = new String[]{"XML DOM Reference", "XML Http Reference", "XSLT Reference", "XML Schema Reference"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		categoryName = "Character Sets";
		
		categoryItems = new String[]{"HTML Character Sets", "HTML ASCII", "HTML ANSI", "HTML Windows-1252", "HTML ISO-8859-1"
				,"HTML Symbols", "HTML UTF-8"};
		
		verifyCategoryItems(homePageMenuItems.getReferencesMenuCategoryName(categoryName), categoryItems);	
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getReferencesCloseButton());
		
		homePageMenuItems.clickReferencesCloseButton();
		
		baseTest.assertAll();
		
	}
	
	private void verifyExerciseLinks(String[] links){
		
		for(String link : links){
			
			baseTest.verifyElementIsDisplayed(homePageMenuItems.getExerciseMenuButton(link));
		
		}
		
	}
	
	@Test(testName = "Verify exercise header menu items", priority =  4)
	private void testExerciseMenuItems(){

		homePageMenuItems = new HomePageMenuItems(driver);
		
		baseTest = new BaseTest(homePageMenuItems);
		
		homePageMenuItems.clickExercisesButton();
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCaretButton());
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesMenuHeader());
		
		String[] yellowButtons = {"Exercises", "Quizzes", "Courses", "Certificates"};
		
		for(String buttons : yellowButtons){
			
			baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesYellowButtons(buttons));

		}
		
		String[] exerciseLinks = {"HTML Exercises", "CSS Exercises", "JavaScript Exercises", "Python Exercises", "SQL Exercises"
				,"PHP Exercises", "Java Exercises", "C Exercises", "C++ Exercises", "C# Exercises", "jQuery Exercises", "React.js Exercises"
				,"MySQL Exercises", "Bootstrap 5 Exercises", "Bootstrap 4 Exercises", "Bootstrap 3 Exercises", "NumPy Exercises", "Pandas Exercises"
				,"SciPy Exercises", "TypeScript Exercises", "Excel Exercises", "R Exercises", "Git Exercises", "Kotlin Exercises", "Go Exercises"
				,"MongoDB Exercises"};
		
		verifyExerciseLinks(exerciseLinks);
		
		String[] quizzesLinks = {"HTML Quiz", "CSS Quiz", "JavaScript Quiz", "Python Quiz", "SQL Quiz", "PHP Quiz", "Java Quiz", "C Quiz"
				,"C++ Quiz", "C# Quiz", "jQuery Quiz", "React.js Quiz", "MySQL Quiz", "Bootstrap 5 Quiz", "Bootstrap 4 Quiz", "Bootstrap 3 Quiz"
				,"NumPy Quiz", "Pandas Quiz", "SciPy Quiz", "TypeScript Quiz", "XML Quiz", "R Quiz", "Git Quiz", "Kotlin Quiz", "Cyber Security Quiz"
				,"Accessibility Quiz"};
		
		verifyExerciseLinks(quizzesLinks);
		
		baseTest.verifyElementIsDisplayed(homePageMenuItems.getExercisesCloseButton());
		
		homePageMenuItems.clickExercisesCloseButton();
		
		baseTest.assertAll();
		
	}
	
}