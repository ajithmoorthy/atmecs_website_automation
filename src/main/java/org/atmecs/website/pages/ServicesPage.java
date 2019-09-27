package org.atmecs.website.pages;

import java.util.List;
import java.util.Properties;

import org.atmecs.website.helper.ActionHelper;
import org.atmecs.website.helper.ValidaterHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ServicesPage {
	ActionHelper helper=new ActionHelper();
	ValidaterHelper validate=new ValidaterHelper();
	public void servicesOption(WebDriver driver,Properties prop)
	{
		helper.mouseOver(prop.getProperty("loc.menu.services"),driver);
		helper.clickElement(prop.getProperty("loc.linktxt.submenudigital"), driver);
		List<WebElement> list=driver.findElements(By.xpath(prop.getProperty("loc.linktxt.digitaloption")));
		System.out.println(list.get(0).getText());
	}
}
