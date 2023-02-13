package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DeleteLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Delete Lead:
				//Launch the browser
			//Enter the username
				//Enter the password
				//Click Login
			//	Click crm/sfa link
			//	Click Leads link
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
			//	Click Find leads
				driver.findElement(By.linkText("Find Leads")).click();
			//	Click on Phone
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
			//	Enter phone number
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("6384975448");
			//	Click find leads button
				driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
				
			//	Capture lead ID of First Resulting lead
				WebElement leadLink = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
				String leadNum=leadLink.getText();
				System.out.println(leadNum);
				
			//	Click First Resulting lead
				leadLink.click();
				
				Thread.sleep(3000);
			//	Click Delete
				driver.findElement(By.linkText("Delete")).click();
				
				Thread.sleep(3000);
			//	Click Find leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				Thread.sleep(3000);
			//	Enter captured lead ID
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadNum);
				
				Thread.sleep(3000);
			//	Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(3000);
			//	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				WebElement messageText = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
				String verifyText=messageText.getText();
				System.out.println(verifyText);
				
				Thread.sleep(3000);
				Assert.assertEquals("No records to display", verifyText);
			//	Close the browser (Do not log out)
				driver.close();

	}

}
