package xpathAssignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRLogin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.pvrcinemas.com/");
		driver.findElement(By.className("nav-icon")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Select cityDD = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		cityDD.selectByVisibleText("Chennai");
		Select genre = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
		genre.selectByVisibleText("ANIMATION");
		Select language = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		language.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Select cinema = new Select(driver.findElement(By.xpath("//select[@id='cinemaName']")));
		cinema.selectByVisibleText("SPI Sathyam Chennai");
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//span[text()='16']")).click();
		Select timings = new Select(driver.findElement(By.xpath("//select[@name='timings']")));
		timings.selectByVisibleText("09:00 PM - 12:00 AM");
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ram26@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");
		Select sect = new Select(driver.findElement(By.xpath("//select[@name='food']")));
		sect.selectByVisibleText("NO");
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.className("swal2-close")).click();
	

	}

}
