package com.seleniumtests.webpage;

import org.openqa.selenium.By;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.ImageElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;


public class LoginPage extends PageObject {
	
	 private static ImageElement identifier_element = new ImageElement("Sign - on Image",By.cssSelector("img[src='/images/masts/mast_signon.gif']"));
	
	 private static TextFieldElement UserNameTextBox = new TextFieldElement("UserName Text Box", By.name("userName"));
	 private static TextFieldElement PasswordTextBox = new TextFieldElement("Password Text Box", By.name("password"));
	 private static ButtonElement SubmitButton = new ButtonElement("Submit Button", By.cssSelector("input[src='/images/forms/submit.gif']"));

	 public LoginPage(final boolean openPageURL) throws Exception {
			super(identifier_element, openPageURL ? SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
	 }
	 
	 public FlightFinderPage login2Website() throws Exception {
		 UserNameTextBox.clear();
		 UserNameTextBox.type("Apache");
		 PasswordTextBox.clear();
		 PasswordTextBox.type("jmeter");
		 SubmitButton.submit();
		 return new FlightFinderPage();
	    } 
	 
	 
}
