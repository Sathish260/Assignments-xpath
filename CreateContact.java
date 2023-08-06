package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	

	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/main/");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("ram");
	driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("gs");
	driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("sam");
	driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("kum");
	driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Tester");
	driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("i am Tester ");
	WebElement States = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
	Select state=new Select(States);
	state.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
	driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("the tester ");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	
	
	
	
	}

}
