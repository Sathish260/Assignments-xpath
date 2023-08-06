package xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathTestlead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("GS ltd");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ram");
		WebElement Indus = driver.findElement(By.id("//select[@id='createLeadForm_industryEnumId']"));
		Select stateDD = new Select(Indus);
		stateDD.selectByVisibleText("Computer Software");
		//driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
	}

}
