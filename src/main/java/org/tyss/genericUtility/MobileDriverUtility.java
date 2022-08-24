package org.tyss.genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileDriverUtility {
	
	WebDriver driver; 
	Actions act;
	MobileDriverUtility wait;
	public MobileDriverUtility(WebDriver driver2, Duration ofSeconds) {
		// TODO Auto-generated constructor stub
	}
	public MobileDriverUtility explicitwait(long Timeout) 
	{
		wait=new MobileDriverUtility(driver,Duration.ofSeconds(Timeout));
		return wait;
	}

}
