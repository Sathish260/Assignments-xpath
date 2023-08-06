package xpathAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {
	private static WebElement WebElement;

	public static void main(String[] args) {
		ChromeDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.abhibus.com/");
		
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
		driver.findElement(By.xpath("//input[@class='button shadow']")).click();
		WebElement Bording = driver.findElement(By.id("boardingpoint_id"));
        Select chennai = new Select(Bording);
	    chennai.selectByVisibleText("velachery-22:32");
	    WebElement drop = driver.findElement(By.id("droppingpoint_id"));
        Select banga = new Select(drop);
	    banga.selectByVisibleText("Electronic City Toll Gate-05:44");
	    driver.findElement(By.id("btnEnable1")).click();
	    driver.close();
		
		
	}

}
