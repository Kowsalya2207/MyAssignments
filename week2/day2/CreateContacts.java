package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		 // 2. Enter UserName and Password Using Id Locator
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 // 3. Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //4. Click on CRM/SFA Link
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 // 5. Click on contacts Button
driver.findElement(By.linkText("Contacts")).click();
		 // 6. Click on Create Contact
driver.findElement(By.linkText("Create Contact")).click();
	
		 // 7. Enter FirstName Field Using id Locator
		 driver.findElement(By.id("firstNameField")).sendKeys("kowsalya");
		 // 8. Enter LastName Field Using id Locator
		 driver.findElement(By.id("lastNameField")).sendKeys("sankar");
		 // 9. Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kowsi");
		 // 10. Enter LastName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("alya");
		 // 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Finance");
		 // 12. Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Testleaf assignment");
		 // 13. Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kowsikayal11@gmail.com"); 
		 // 14. Select State/Province as NewYork Using Visible Text
		 WebElement stateDrop = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select sel=new Select(stateDrop);
		 sel.selectByVisibleText("New York");
		 // 15. Click on Create Contact
		 driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		 // 16. Click on edit button 
		  driver.findElement(By.linkText("Edit")).click();
		 // 17. Clear the Description Field using .clear
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 // 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("dont do mistake");
		 // 19. Click on update button using Xpath locator
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 // 20. Get the Title of Resulting Page.
		 String resultTitle=driver.getTitle();
		 System.out.println(resultTitle);
	}

}
