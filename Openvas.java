package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class Openvas {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testOpenvas() throws Exception {
		selenium.open("https://140.117.5.131:9392/login/login.html");
		selenium.click("id=login");
		selenium.click("id=login");
		selenium.click("id=login");
		selenium.click("id=login");
		selenium.type("id=login", "admin");
		selenium.click("id=password");
		selenium.type("id=password", "admin");
		selenium.click("//input[@value='Login']");
		selenium.click("link=Logout");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
