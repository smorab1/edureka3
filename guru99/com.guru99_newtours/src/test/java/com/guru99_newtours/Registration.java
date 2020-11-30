package com.guru99_newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class Registration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "E:\\DevOps\\guru99\\com.guru99_newtours\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Nachiket");
		driver.findElement(By.name("lastName")).sendKeys("Nijampurkar");
		driver.findElement(By.name("phone")).sendKeys("9850972234");
		driver.findElement(By.name("userName")).sendKeys("s_b_morab123@yahoo.co.in");
		driver.findElement(By.name("address1")).sendKeys("Flat No.2,Vallabh HSG.SOC.,S B ROAD");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("411001");
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByIndex(107);
		driver.findElement(By.name("email")).sendKeys("edureka1");
		driver.findElement(By.name("password")).sendKeys("edureka1");
		driver.findElement(By.name("confirmPassword")).sendKeys("edureka1");
		driver.findElement(By.name("submit")).click();
		driver.quit();
   }
}