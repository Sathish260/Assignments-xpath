package assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundInput {

public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/input.xhtml");
	driver.findElement(By.name("j_idt88:name")).sendKeys("Fernando");
	driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(",India");
	driver.findElement(By.name("j_idt88:j_idt95")).clear();
	System.out.println("Retrieved text: " + driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value"));
	WebElement eMail = driver.findElement(By.name("j_idt88:j_idt99"));
	eMail.sendKeys("321@testleaf.com");
	eMail.sendKeys(Keys.TAB + "Hello folks!");
	driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
	driver.navigate().back();
	driver.findElement(By.name("j_idt106:float-input")).click();
	driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Fernando");
	driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();
	String dob = "27/07/1981";
	driver.findElement(By.name("j_idt106:j_idt116_input")).sendKeys(dob);
	WebElement number = driver.findElement(By.name("j_idt106:j_idt118_input"));
	number.sendKeys("5");
	driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a")).click();
	driver.findElement(By.name("j_idt106:slider")).sendKeys("35");
	driver.findElement(By.id("j_idt106:j_idt122")).click();
	
}



}

