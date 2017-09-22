package sampleJava;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleJavaDemo {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void launch()
	{
		driver.get("https://www.reload.in");
	}

}
