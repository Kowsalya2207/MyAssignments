package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	/*http://leaftaps.com/opentaps/control/main
		
		/** 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)*/
		 WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		  driver.findElement(By.xpath("//a[text()='Leads']")).click(); 
		  driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[@class='x-form-item-label']/following::input[@name='firstName'][3]")).sendKeys("ishu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		 WebElement leadLink =driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		 leadLink.click();
		 Thread.sleep(2000);
		 driver.getTitle();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 String text1="leaf";
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(text1);
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 String text3 = text2.replaceAll("[^a-zA-Z]", "");
		 Assert.assertEquals(text1, text3);
		 System.out.println(text3);
		 driver.close();
		 
		 
	}

}
