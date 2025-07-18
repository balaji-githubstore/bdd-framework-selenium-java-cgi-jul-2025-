package com.cgi.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AutomationHooks {
	public WebDriver driver;
	private Properties config;
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException
	{
		loadConfiguration();
		
		String browserName = config.getProperty("browser", "chrome").toLowerCase();
		
		if (browserName.equalsIgnoreCase("ff") || browserName.equalsIgnoreCase("firefox") ) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void endScenario() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	
	 private void loadConfiguration() throws FileNotFoundException, IOException {
	        config = new Properties();
	        try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
	            config.load(fis);
	        }
	    }
}
