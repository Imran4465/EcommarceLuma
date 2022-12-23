package luma.us.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import gherkin.formatter.Argument;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import luma.us.basepage.BasePage;

public class CommonUtility extends BasePage {
// for any click able method we need this
	public static void getActionClick(WebElement elem) {

		Actions click = new Actions(driver);
		click.click(elem).build().perform();

	}

	public static void getJs(WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;// this is call type custing
		js.executeScript("arguments[0].click();", ele);

	}

	public static void getAssert(String expected, String actual ) {
		Assert.assertEquals(expected, actual);
		System.out.println("Verified text"+actual);
}
	public static void mouseHover(WebElement ele) {
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();	
		
	}
		
		// Select value from Drop down
		public static void getSelectValue(WebElement ele, String text) {
			Select sc = new Select(ele);
			//sc.deselectByVisibleText(text);
			sc.selectByVisibleText(text);
		
		}
		
		
		public static void Highlighter(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='6px solid green'", ele);
		}
		
		
	}
