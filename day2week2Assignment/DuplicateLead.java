package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 /** http://leaftaps.com/opentaps/control/main
		 * 
		 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
		 * 5 Click crm/sfa link 6 Click Leads link*/
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		  driver.findElement(By.xpath("//a[text()='Leads']")).click(); 
		  //7 Click Findleads 
		driver.findElement(By.linkText("Find Leads")).click(); 
		  //8 Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		 /* 9 Enter Email*/
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys( "heelo@gmail.com");
//10 Click find leads button
 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
 Thread.sleep(2000);
 // 11 Capture name of First Resulting lead 12 Click First Resulting lead*/ 
		  WebElement leadLink =driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")); 
		  String leadNum=leadLink.getText(); 
		  System.out.println(leadNum);
		  String name1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).getText();
		  System.out.println(name1);
		  leadLink.click();
	//	  13 Click Duplicate Lead 
	 driver.findElement(By.linkText("Duplicate Lead")).click();
	 //14 Verify the title as 'Duplicate Lead' 
	 System.out.println(driver.getTitle());
	 //15 Click Create Lead 
	 driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	 //16 Confirm the duplicated lead name is same as captured name 
	String name2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	System.out.println(name2);
	Assert.assertEquals(name1, name2);
	// 17 Close the browser (Donot log out*/
	driver.close();
		
		
	}

}
