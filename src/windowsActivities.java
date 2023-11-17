import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsActivities {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wmina\\Downloads\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("http://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();

		System.out.println("updatred the project");
		
	}

}
