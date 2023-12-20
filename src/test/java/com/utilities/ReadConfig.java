package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static Properties pro;
	
	public ReadConfig() throws IOException {
		File file = new File("./Configuration/config.properties");
		pro=new Properties();
		FileInputStream fi= new FileInputStream(file);
		pro.load(fi);
	}
	
	public String getUrl() {
		String url=pro.getProperty("url");
		return url;
	}
}
