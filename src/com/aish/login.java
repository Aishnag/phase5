package com.aish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	
		public static void main(String[] args) {
			String driverPath ="C:\\phase5\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.shine.com/myshine/login/");
			
			WebElement email = driver.findElement(By.xpath("//*[@id=\"id_email_login\"]"));
				email.sendKeys("aish09@gmail.com");
				
				WebElement password = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
				password.sendKeys("aish@123");
				
				WebElement Login =driver.findElement(By.xpath("//*[@id=\"cndidate_login_widget\"]/form/ul[2]/li[4]/div/button"));
				Login.click();

		}
		}

