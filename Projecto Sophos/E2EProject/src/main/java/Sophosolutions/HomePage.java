package Sophosolutions;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import recursos.base;

public class HomePage extends base  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@BeforeTest
	public void initialize() throws IOException {
	driver = inicializarDriver();
	driver.get("https://google.com");
	}
	
	
	
	@Test 
	
	public void basePage () throws IOException, InterruptedException
	{
		//llamamos el metodo de la clase base  
	
		driver.findElement(By.name("q")).sendKeys("Sophos solutions");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
	
		
	}
	

	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
	
	
}
