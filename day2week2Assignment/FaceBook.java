package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		driver.findElement(By.name("firstname")).sendKeys("Kowsalya");
		driver.findElement(By.name("lastname")).sendKeys("Yuvarajan");
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("valarkodi23@gmail.com");
		driver.findElement(By.xpath("//div[@class='placeholder' and text()='New password']/following-sibling::input")).sendKeys("kowyu13");
		//div[contains(text(),'Mobile')]
		// Step 11: Handle all the three drop downs
		WebElement dayDrop = driver.findElement(By.id("day"));
		WebElement monthDrop = driver.findElement(By.id("month"));
		WebElement yearDrop = driver.findElement(By.id("year"));
		
		Select sel=new Select(dayDrop);
		sel.selectByIndex(3);
		Select sel2=new Select(monthDrop);
		sel2.selectByVisibleText("May");
		Select sel3=new Select(yearDrop);
		sel3.selectByValue("2020");
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		            //( A normal click will do for this step) 
	}

}
