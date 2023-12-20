package com.objects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Screenshot;

public class ElementsTextBox {

	public WebDriver driver;
	
	
	public ElementsTextBox(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Elements']")
	WebElement elements;
	
	@FindBy(xpath="//span[text()='Text Box']")
	WebElement textbox;
	
	@FindBy(id="userName")
	WebElement fullname;
	
	@FindBy(id="userEmail")
	WebElement useremail;
	
	@FindBy(xpath="//span[text()='Check Box']")
	WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Home']")
	WebElement home;
	
	public void textBox() throws InterruptedException, IOException {
		Screenshot scr= new Screenshot();
		JavaScriptExe();
		elements.click();
		Thread.sleep(3000);
		textbox.click();
		Thread.sleep(3000);
		fullname.sendKeys("Sateesh");
		Thread.sleep(3000);
		useremail.sendKeys("Sateesh@gmail.com");
		scr.TakeScreenshot(driver);
		Thread.sleep(3000);
	}
	
	public void checkBox() throws InterruptedException {
		JavaScriptExe();
		elements.click();
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(3000);
		home.click();
		Thread.sleep(3000);
	}
	
	public void JavaScriptExe() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
	}
}
