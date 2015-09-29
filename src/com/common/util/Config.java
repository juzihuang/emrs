package com.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	private static Properties configProperties;
	private static final String PROPERTIES_FILE = "/config.properties";
	private static Config instance = null;

	public static synchronized Config getInstance() {
		if (instance == null) {
			instance = new Config();
		}

		return instance;
	}

	public Config() {
		init();
	}

	public void init() {
		configProperties = new Properties();
		try {
			InputStream is = Config.class
					.getResourceAsStream(PROPERTIES_FILE);
			configProperties.load(is);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return configProperties.getProperty(key);
	}
}