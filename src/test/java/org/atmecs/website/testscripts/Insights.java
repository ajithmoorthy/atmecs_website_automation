package org.atmecs.website.testscripts;

import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;

import org.atmecs.website.constants.FileConstants;
import org.atmecs.website.pages.InsightsPage;
import org.atmecs.website.testbase.TestBase;
import org.atmecs.website.utils.PropertiesReader;
import org.testng.annotations.Test;

public class Insights extends TestBase {
	InsightsPage insight=new InsightsPage();
	PropertiesReader property=new PropertiesReader();
	@Test(priority=2)
	public void validateBlogs() throws IOException, InterruptedException, ParseException {
	driver.get("http://www.atmecs.com/");
	Properties propObject=property.KeyValueLoader(FileConstants.INSIGHT_PATH);
	logger=extentObject.startTest("Validate Blogs and Comments");
	insight.validateBlogs(driver, propObject);
	}
}
