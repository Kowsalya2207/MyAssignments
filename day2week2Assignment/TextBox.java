package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * https://www.leafground.com/input.xhtml 1. Type your name 2. Append Country to
		 * this City 3. Verify if text box is disabled 4. Clear the typed text 5.
		 * Retrieve the typed text 6. Type email and Tab. Confirm control moved to next
		 * element 7. Type about yourself 8. Text Editor 9. Just Press Enter and confirm
		 * error message* 10. Click and Confirm Label Position Changes 11. Type your
		 * name and choose the third option 12. Click and Confirm Keyboard appears 13.
		 * Custom Toolbar
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Kowsalya");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		boolean enabled = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
		System.out.println(enabled);
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String text = driver.findElement(By.xpath("//input[contains(@value,'My learning')]")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Your email')]")).sendKeys("kowsi67@gmail.com",
				Keys.TAB);
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("hardwording and punctual");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank'][1]")).sendKeys("mark it as bold",
				Keys.chord(Keys.CONTROL, "A"));
		driver.findElement(By.xpath("//button[contains(@class,'ql-bold')]")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'confirm error message')]/following::input[2]"))
				.sendKeys(Keys.ENTER);
		boolean displayed = driver.findElement(By.xpath("//div[contains(@class,'message-error ')]")).isDisplayed();
		System.out.println(displayed);
		Point location = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();

		System.out.println(location.getX());
		System.out.println(location.getY());
		driver.findElement(By.xpath("//label[text()='Username']/preceding-sibling::input")).click();
		Thread.sleep(3000);
		Point location2 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		System.out.println(location2.getX());
		System.out.println(location2.getY());
		if ((location.getX() != location2.getX()) || (location.getY() != location2.getY())) {
			System.out.println("Position changed");
		} else {
			System.out.println("Position not changed");
		}
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Kowsalya");
		Thread.sleep(3000);
		List<WebElement> nameList = driver.findElements(By.xpath("//span[@role='listbox']/ul/li"));
		nameList.get(2).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Keyboard')]/following-sibling::input")).click();
		boolean keyboard = driver.findElement(By.xpath("//div[@class='keypad-row']/parent::div")).isDisplayed();
		System.out.println(keyboard);
		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("All done");

	}
}
