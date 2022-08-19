package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername=driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword=driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementWelcomeMessage=driver.findElement(By.tagName("h2"));
		String text=elementWelcomeMessage.getText();
	    System.out.println(text);
	    WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
	    elementCRMSFA.click();
	    WebElement elementLeads=driver.findElement(By.linkText("Leads"));
	    elementLeads.click();
	    WebElement elementFindLeads=driver.findElement(By.linkText("Find Leads"));
	    elementFindLeads.click();
	    WebElement elementFirstName=driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']"));
	    elementFirstName.sendKeys("New");
	    WebElement elementFindLeads1=driver.findElement(By.xpath("//button[text()='Find Leads']"));
	    elementFindLeads1.click();
	  
	    Thread.sleep(5000);
	    WebElement firstRL=driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
	    
	    firstRL.click();
	    System.out.println("The title is :"+driver.getTitle());
	    WebElement elementEdit=driver.findElement(By.xpath("//a[text()='Edit']"));
	    elementEdit.click();
	    WebElement elementCN=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
	    elementCN.clear();
	    elementCN.sendKeys("WiproTech");
	    WebElement elementUD=driver.findElement(By.xpath("//input[@value='Update']"));
	    elementUD.click();
	    WebElement UpdatedText=driver.findElement(By.id("viewLead_companyName_sp"));
	    String textNew=UpdatedText.getText();
	    System.out.println(textNew);
	    driver.close();
	}
}
