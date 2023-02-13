package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Edit Lead
		 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  //2. Enter UserName and Password Using Id Locator
		  ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		 // 3. Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();
		 // 4. Click on CRM/SFA Link
		 // 5. Click on Leads Button
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// 6. Click on Create Lead 
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		  //7. Enter CompanyName Field Using id Locator
		  //8. Enter FirstName Field Using id Locator
		  //9. Enter LastName Field Using id Locator
		  //10. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("yuvi");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kowsi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("alya");
		 // 11. Enter Department Field Using any Locator of Your Choice
		 // 12. Enter Description Field Using any Locator of your choice 
		 // 13. Enter your email in the E-mail address Field using the locator of your choice
		 // 14. Select State/Province as NewYork Using Visible Text
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("madhu");
			driver.findElement(By.name("departmentName")).sendKeys("finance");
			driver.findElement(By.name("description")).sendKeys("Registering the user");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kowsalyayes1998@gmail.com");
			WebElement stateDrop = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select sel = new Select(stateDrop);
			sel.selectByVisibleText("New York");
		 // 15. Click on Create Button
			driver.findElement(By.className("smallSubmit")).click();
           //16. Click on edit button
			driver.findElement(By.linkText("Edit")).click();
           // 17. Clear the Description Field using .clear()
			driver.findElement(By.name("description")).clear();
		  //18. Fill ImportantNote Field with Any text
			driver.findElement(By.name("importantNote")).sendKeys("dont overide");
		 // 19. Click on update button 
			driver.findElement(By.className("smallSubmit")).click();
		//  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
			String title = driver.getTitle();
			System.out.println(title);

	}

}
