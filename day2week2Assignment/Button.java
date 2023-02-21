package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		WebElement clickButton = driver.findElement(By.xpath("//span[text()='Click']/parent::button"));
		clickButton.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		Thread.sleep(2000);
		boolean buttonEnabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled();
		System.out.println(buttonEnabled);
		Point loc = driver.findElement(By.xpath("//span[text()='Submit']/parent::button")).getLocation();
		System.out.println(loc);
	}

}
