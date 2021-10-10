package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver  driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
