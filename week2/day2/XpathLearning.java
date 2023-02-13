package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Kowsalya");
driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("Sankar");
driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TCS");
WebElement sourceDrop = driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]"));
Select s=new Select(sourceDrop);
s.selectByVisibleText("Employee");

driver.findElement(By.xpath("//input[@name='submitButton']")).click();



	}

}
