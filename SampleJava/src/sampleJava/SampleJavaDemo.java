package sampleJava;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleJavaDemo {
	
	WebDriver d = new FirefoxDriver();
	
	@Test
	public void launch()
	{
		d.get("https://www.reload.in/");
		System.out.println("Launched Successfully");
	}

}
