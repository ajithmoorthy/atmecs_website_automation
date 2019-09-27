package org.atmecs.website.pages;

import java.text.ParseException;
import java.util.List;
import java.util.Properties;

import org.atmecs.website.helper.ActionHelper;
import org.atmecs.website.helper.ValidaterHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class InsightsPage{
	ValidaterHelper validate=new ValidaterHelper();
	 boolean bool=false;
	ActionHelper helper=new ActionHelper();
	public void validateBlogs(WebDriver driver,Properties prop) throws InterruptedException, ParseException {
		driver.manage().window().maximize();
		helper.mouseOverClick(driver, prop.getProperty("loc.menu.insights"),prop.getProperty("loc.submenu.blogs.cssSelector"));
		validate.validateDate(driver,prop.getProperty("loc.blogsdate.linktxt.xpath"));
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("loc.container.blogs.xpath"))));
		List<WebElement> list=driver.findElements(By.xpath(prop.getProperty("loc.container.blogs.xpath")));
		for(WebElement element:list ) {
		helper.clickElement(prop.getProperty("loc.readmore.linktext"), driver);
	}
	}

}
