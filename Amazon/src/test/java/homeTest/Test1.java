package homeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
