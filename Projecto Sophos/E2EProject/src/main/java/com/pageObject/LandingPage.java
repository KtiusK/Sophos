package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import recursos.base;

public class LandingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public WebDriver driver;
	
	By google=By.name("q");

		
	public void buscar(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public WebElement getTexto()
	{
		
		return driver.findElement(google);
	}

	
	
}
