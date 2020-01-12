package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Hello.hello1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  //hello1 h1=new hello1();
	  //h1.paymentTransfer();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		driver.quit();

  }
}
