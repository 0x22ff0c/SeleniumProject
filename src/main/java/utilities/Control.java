package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;
import tests.BaseTest;

public class Control{
	
	WebDriver driver;
	BaseTest baseTest;
	BasePage basePage;
	
	public Control(WebDriver driver, BasePage basePage){
		this.driver = driver;
		this.basePage = basePage;
	}
	
	public void clickButton(WebElement element){
	
		String nameOfElement = basePage.getElementName();
		
		System.out.println(String.format("Clicking element: %s...", nameOfElement));
		
		element.click();
		
		System.out.println(String.format("Clicked element: %s", nameOfElement));
		
	}
	
	public void typeToField(WebElement fieldElement, String valueToFillInTheField){
		
		System.out.println(String.format("Filling-in field with value: %s...", valueToFillInTheField));
		
		fieldElement.sendKeys(valueToFillInTheField);
		
		System.out.println(String.format("Filled-in field with value: %s", valueToFillInTheField));
		
	}
	
	public void scrollToElement(WebElement element){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
}