package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLeads {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suryanarayanan");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Keerthana");
		 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Suryanarayanan");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Engineering");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Working on the Manual testing project using Selenium");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthana1234@gmail.com");
		 driver.findElement(By.className("smallSubmit")).click();
		 String title=driver.getTitle();
		 System.out.println(title);
}
}
