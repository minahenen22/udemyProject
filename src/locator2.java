import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locator2 {
	public static void main (String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wmina\\Downloads\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText(),
		"You are successfully logged in.");
		
	}

}
