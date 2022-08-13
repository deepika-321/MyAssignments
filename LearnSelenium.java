package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {
	
	public static void main(String[] args) {
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
	    WebElement elementCreateLeads=driver.findElement(By.linkText("Create Lead"));
	    elementCreateLeads.click();
	    WebElement elementCompanyName=driver.findElement(By.id("createLeadForm_companyName"));
	    elementCompanyName.sendKeys("PersistentSystem");
	    WebElement elementFirstName=driver.findElement(By.id("createLeadForm_firstName"));
	    elementFirstName.sendKeys("Deepika");
	    WebElement elementLastName=driver.findElement(By.id("createLeadForm_lastName"));
	    elementLastName.sendKeys("Kumari");
	    WebElement elementFirstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
	    elementFirstNameLocal.sendKeys("Jenifier");
	    WebElement elementDepartment=driver.findElement(By.id("createLeadForm_departmentName"));
	    elementDepartment.sendKeys("Testing");
	    WebElement elementDescription=driver.findElement(By.id("createLeadForm_description"));
	    elementDescription.sendKeys("Manual and Automation Testing");
	    WebElement elementEmail=driver.findElement(By.id("createLeadForm_primaryEmail"));
	    elementEmail.sendKeys("deepika123@gmail.com");
	    WebElement elementStateProvienceDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd=new Select(elementStateProvienceDD);
	    dd.selectByVisibleText("New York");
	    WebElement elementCreateLead=driver.findElement(By.className("smallSubmit"));
		elementCreateLead.click();
		System.out.println("Page title is : " + driver.getTitle());
		// Assignment 2
		WebElement elementDuplicate=driver.findElement(By.linkText("Duplicate Lead"));
	    elementDuplicate.click();
	    WebElement elementNewCompanyName=driver.findElement(By.id("createLeadForm_companyName"));
	    elementNewCompanyName.clear();
	    elementNewCompanyName.sendKeys("Wipro");
	    WebElement elementFirstNewName=driver.findElement(By.id("createLeadForm_firstName"));
	    elementFirstNewName.clear();
	    elementFirstNewName.sendKeys("Megha");
	    WebElement elementDuplicateCreateLead=driver.findElement(By.className("smallSubmit"));
		elementDuplicateCreateLead.click();
		System.out.println("Page title is : " + driver.getTitle());
	}

}
