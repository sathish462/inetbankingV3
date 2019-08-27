package com.inetbanking.testCases;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;



public class BaseClass {

	ReadConfig read = new ReadConfig();

	// TODO Auto-generated method stub
	public String baseURL = read.getURL();
	public String username = read.getUserName();
	public String password = read.getPassword();
	public static WebDriver driver;
	
	

	@Parameters("browser")
	@BeforeClass
	public void setUp(String s) {

		if (s.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", read.getChromePath());
			driver = new ChromeDriver();
		} else if (s.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", read.getFireFoxPath());
			driver = new FirefoxDriver();
		} else if (s.equals("IE")) {
			System.setProperty("webdriver.ie.driver", read.getIEPath());
			driver = new InternetExplorerDriver();
		}

		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	



}
