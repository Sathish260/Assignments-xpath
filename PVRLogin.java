package xpathAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRLogin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//a[text()='Movie Calendar ']")).click();
		driver.findElement(By.xpath("//span[text()='Genre']")).click();
		driver.findElement(By.xpath("//span[text()='ACTION']")).click();
		driver.findElement(By.xpath("//span[text()='Language']")).click();
		driver.findElement(By.xpath("//span[text()='TAMIL']")).click();
		
		
		
		
	}

}
