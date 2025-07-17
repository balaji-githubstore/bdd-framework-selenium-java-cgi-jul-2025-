package com.cgi.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AutomationHooks {
	public static WebDriver driver;
	
	
	@Before
	public void beforeScenario()
	{
		AutomationHooks.driver = new ChromeDriver();
		AutomationHooks.driver.manage().window().maximize();
		AutomationHooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void endScenario() {
		if (driver != null) {
			driver.quit();
		}
	}
}
