package pages.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class HomePageFooter extends BasePage{

	public HomePageFooter(WebDriver driver){
		super(driver);
	}
	
	//Remove
	public WebElement getFooter(){
		
		return getElementByTagName("footer", "Main page footer");
	}
	
	//Retain
	public void scrollToFooterSection(){
		
		control.scrollToElement(getElementByTagName("footer", "Footer section of the page"));
	}

	//Retain
	public WebElement getQuizzesButton(){
		
		return getButtonElement("Quizzes");
	}
	
	//Retain
	public WebElement getExcercisesButton(){
		
		return getButtonElement("Exercises");
	}
	
	//Add "Certificates" for the button name
	public WebElement getCertificatesButton(){
		
		return getButtonElement("Courses and Certificates");
	}
	
	//Add "Upgrade" for the button name
	public WebElement getUpgradeButton(){
		
		return getButtonElement("Upgrade to Improve Your Learning Experiences");
	}
	
	//Change to getButtonElement that accepts By object
	public WebElement getSpacesButton(){
		
		return getElementByXpath("(//*[@title='Get Your Own Website With W3schools Spaces'])[3]", "Spaces button");
	}
	
	//Retain
	public WebElement getSupportButton(){
		
		return getButtonElement("Support");
	}
	
	//Retain
	public WebElement getNewsLetterButton(){
		
		return getButtonElement("Join Our Newsletter");
	}
	
	public WebElement getForumLink(){
		
		return getElementByLinkText("FORUM");
	}
	
	public WebElement getAboutLink(){
		
		return getElementByLinkText("ABOUT");
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
		
		return getTextOfElementUsingXpathLocator("(//footer/descendant::p)[5]");
	}
	
	public WebElement getTermsOfUseLink(){
		
		return getElementByLinkText("terms of use");
	}
	
	public WebElement getCookieAndPrivacyPolicyLink(){
		
		return getElementByLinkText("cookie and privacy policy");
	}
	
	public WebElement getCopyrightLink(){
		
		return getElementByLinkText("Copyright 1999-2022", "Copyright");
	}
	
}