package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	static Properties prop;

	public static void initProperties() {
		try {
			String fileName = "src//test//resources//config//config.properties";
			FileInputStream fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
