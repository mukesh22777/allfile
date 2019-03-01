package browsers;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		WebDriver d1;
		
		//Initialize browser
		
		System.setProperty("webdriver.gecko.driver", "H:\\New folder\\driver\\chromedriver.exe");
		
	
		d1 = new FirefoxDriver();
		
		
		//open URL
		
		d1.get("https:/www.amazon.com");
		//d1.get("https:/www.guru99.com");
		
		//Maximize the window
		d1.manage().window().maximize();
		
		
				
				
	}

}
