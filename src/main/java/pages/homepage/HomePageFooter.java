package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;
import tests.BaseTest;

public class HomePageFooter extends BasePage{

	public HomePageFooter(WebDriver driver, BaseTest baseTest) {
		super(driver, baseTest);
	}
	
	public WebElement getFooter(){
		return getElementByTagName("footer", "Main page footer");
	}
		
	private WebElement getButton(String buttonName){
		return getElementByXpath(String.format("//*[@title='%s']", buttonName), buttonName + " button");
	}
	
	public WebElement getQuizzesButton(){
		return getButton("Quizzes");
	}
	
	public WebElement getExcercisesButton(){
		return getButton("Exercises");
	}
	
	public WebElement getCertificatesButton(){
		return getButton("Courses and Certificates");
	}
	
	public WebElement getUpgradeButton(){
		return getButton("Upgrade to Improve Your Learning Experiences");
	}
	
	public WebElement getSpacesButton(){
		return getElementByXpath("(//*[@title='Get Your Own Website With W3schools Spaces'])[3]", "Spaces button");
	}
	
	public WebElement getSupportButton(){
		return getButton("Support");
	}
	
	public WebElement getNewsLetterButton(){
		return getButton("Join Our Newsletter");
	}
	
	public WebElement getForumLink(){
		return getElementByLinkText("FORUM", "FORUM");
	}
	
	public WebElement getAboutLink(){
		return getElementByLinkText("ABOUT", "ABOUT");
	}
	
	private WebElement getIconLink(String linkName){
		return getElementByXpath(String.format("//i/parent::*[@title='%s']", linkName), linkName + " link");
	}
	
	public WebElement getFacebookIconLink(){
		return getIconLink("W3Schools on Facebook");
	}
	
	public WebElement getInstagramIconLink(){
		return getIconLink("W3Schools on Instagram");
	}
	
	public WebElement getLinkedInLink(){
		return getIconLink("W3Schools on LinkedIn");
	}
	
	public WebElement getDiscordLink(){
		return getIconLink("Join the W3schools community on Discord");
	}
	
	public WebElement getLinkOnFacebookButton(){
		return getElementByXpath("//*[@title='Like W3Schools on Facebook']", "Facebook button");
	}
	
	public String getFooterText(){
		
		return getTextOfElement(By.xpath("(//footer/descendant::p)[5]"));
	}
	
	public WebElement getTermsOfUseLink(){
		return getElementByLinkText("terms of use", "Terms of Use");
	}
	
	public WebElement getCookieAndPrivacyPolicyLink(){
		return getElementByLinkText("cookie and privacy policy", "Cookie and Privacy Policy");
	}
	
	public WebElement getCopyrightLink(){
		return getElementByLinkText("Copyright 1999-2022", "Copyright");
	}
	
}
