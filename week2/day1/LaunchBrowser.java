package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://login.salesforce.com/");
       //EdgeDriver drv=new EdgeDriver();
       //drv.get("https://login.salesforce.com/");
       driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
       driver.findElement(By.id("password")).sendKeys("Leaf@123");
       driver.findElement(By.id("Login")).click();
	}

}
