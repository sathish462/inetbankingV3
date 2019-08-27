package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig()
	// TODO Auto-generated method stub
	{
		File f = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(f);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
	}

	public String getURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getUserName() {
		String un = pro.getProperty("username");
		return un;
	}
	public String getPassword() {
		String pwd = pro.getProperty("password");
		return pwd;
	}
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFireFoxPath() {
		String foxpath = pro.getProperty("firefoxpath");
		return foxpath;
	}
	public String getIEPath() {
		String iePath = pro.getProperty("IEpath");
		return iePath;
	}

}
