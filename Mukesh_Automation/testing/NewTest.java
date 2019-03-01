package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "H:\\New folder\\driver\\geckodriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
