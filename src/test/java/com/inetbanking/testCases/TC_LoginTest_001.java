package com.inetbanking.testCases;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	

	
	@Test
	public void startup() {
		driver.get(baseURL);
		

		LoginPage lp = new LoginPage(driver);
		
	
		lp.setuserName(username);
	//	logger.info("Entered the Username");
		lp.setpassWord(password);
	//	logger.info("Entered the Password");
		lp.clickIn();
	//	logger.info("Click the login button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		//	logger.info("Pass the testcase");
		}
		else
		{
			Assert.assertTrue(false);
		//	logger.info("Fail the testcase");
		}

	}

}
