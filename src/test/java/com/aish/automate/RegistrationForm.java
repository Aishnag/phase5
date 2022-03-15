package com.aish.automate;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test(priority=1)
public class RegistrationForm {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
	String driverPath ="C:\\phase5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shine.com/registration/");
	
	WebElement Check= driver.findElement(By.id("id_privacy"));
	
	WebElement Email= driver.findElement(By.id("id_email"));
	Email.sendKeys("aish48617@gmail.com");
	
	WebElement Name= driver.findElement(By.id("id_name"));
	Name.sendKeys("Aishwarya Nagare");
	
	WebElement Pass= driver.findElement(By.id("id_password"));
	Pass.sendKeys("Aish@123");
	
	WebElement Mobile= driver.findElement(By.id("id_cell_phone"));
	Mobile.sendKeys("9822345678");
	
	
	
	 WebElement element = driver.findElement(By.id("id_file"));
	     JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
	     
	     Thread.sleep(5000);
	     Runtime.getRuntime().exec("D:\\Resume\\FileUpload.exe");
	     
	     WebElement Continue= driver.findElement(By.id("registerButton"));
	 	Continue.click();
}
@Test(priority=2)
	 	public void logIN() {
	 		
	 	 String driverPath ="C:\\phase5\\chromedriver_win32\\chromedriver.exe";
	 		System.setProperty("webdriver.chrome.driver", driverPath);
	 		WebDriver driver=new ChromeDriver();
	 		
	 	driver.get("https://www.shine.com/myshine/login/");
	 	System.out.println("login page..");
	 	
	 	WebElement email = driver.findElement(By.xpath("//*[@id=\"id_email_login\"]"));
		email.sendKeys("aish48617@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		password.sendKeys("Aish@123");
		
		WebElement Login =driver.findElement(By.xpath("//*[@id=\"cndidate_login_widget\"]/form/ul[2]/li[4]/div/button"));
		Login.click();

		System.out.println("Login successful..");

	  // driver.close();
	    
	    
	  
}
}

