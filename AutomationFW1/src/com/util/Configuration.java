package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static String URL= "";
	public static  String BROWSER ="";
	public Configuration()
	{
		try {
			readProperties();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readProperties() throws FileNotFoundException
	{
		Properties prop = new Properties();
		FileReader fr;
	    fr = new FileReader(new File("config.properties"));
		try {
			prop.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BROWSER = prop.getProperty("browser");
		URL = prop.getProperty("url");
		
	}

}
