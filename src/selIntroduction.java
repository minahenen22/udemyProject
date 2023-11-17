import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webDriver.chrome.driver", "C:\\Users\\wmina\\Downloads\\ChromeDriver.chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		//firefox - geckodriver
		
		//WebDriver firedriver = new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
	}

}
