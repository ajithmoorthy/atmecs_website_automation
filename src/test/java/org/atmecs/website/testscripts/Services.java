package org.atmecs.website.testscripts;

import java.io.IOException;
import org.atmecs.website.utils.PropertiesReader;
import java.util.Properties;

import org.atmecs.website.constants.FileConstants;
import org.atmecs.website.pages.ServicesPage;
import org.atmecs.website.testbase.TestBase;
import org.testng.annotations.Test;

public class Services extends TestBase {
	PropertiesReader property=new PropertiesReader();
	ServicesPage  services=new ServicesPage();
	@Test
	public void servicesOptionCheck() throws IOException {
		driver.get("http://www.atmecs.com/");
		logger=extentObject.startTest("validate the Services");
		Properties propObject=property.KeyValueLoader(FileConstants.SERVICES_PATH);
		services.servicesOption(driver, propObject);
	}
}