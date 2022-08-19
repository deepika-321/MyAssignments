package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookImplicitWait {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
WebElement button=driver.findElement(By.xpath("//a[text()='Create New Account']"));
     button.click();
WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
    firstName.sendKeys("TestingFB");
    WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
    lastName.sendKeys("New");
    WebElement numberPh=driver.findElement(By.xpath("//input[@name='reg_email__']"));
    numberPh.sendKeys("6787656876");
    WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
    password.sendKeys("Testing@123");
    WebElement dayDD=driver.findElement(By.xpath("//select[@id='day']"));
     dayDD.click();
    Select dd1=new Select(dayDD);
    dd1.selectByIndex(15);
    WebElement monthDD=driver.findElement(By.xpath("//select[@id='month']"));
     monthDD.click();
    Select dd2=new Select(monthDD);
    dd2.selectByIndex(6);
    WebElement yearDD=driver.findElement(By.xpath("//select[@id='year']"));
    yearDD.click();
    Select dd3=new Select(yearDD);
    dd3.selectByIndex(20);
    WebElement firstRB=driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
    firstRB.click();
    
}
}