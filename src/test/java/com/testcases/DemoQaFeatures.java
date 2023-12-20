package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.objects.ElementsTextBox;

public class DemoQaFeatures extends BaseClass{

	ElementsTextBox elementTextboxpage;
	
	@Test
	public void elementsTC_001() throws InterruptedException, IOException {
		System.out.println("Test called");
		elementTextboxpage=new ElementsTextBox(driver);
		test=extent.createTest("TC_001").assignAuthor("Sateesh").assignCategory("Web Testing");
		elementTextboxpage.textBox();	
	}

	
	@Test
	public void elementsTC_002() throws InterruptedException {
		elementTextboxpage=new ElementsTextBox(driver);
		test=extent.createTest("TC_002").assignAuthor("Sateesh").assignCategory("Web Testing");
		elementTextboxpage.checkBox();
	}
	
	
}
