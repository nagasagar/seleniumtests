package com.seleniumtests.webpage;
import org.openqa.selenium.By;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.webelements.ImageElement;
import com.seleniumtests.webelements.LinkElement;
import com.seleniumtests.webelements.PageObject;


public class HomePage extends PageObject{
	
	 	 private static ImageElement Identifier_FeaturedDestination = new ImageElement ("Identifier element", By.cssSelector("img[alt='Featured Destination: Aruba']"));
	 	 private static LinkElement Sign_on_link = new LinkElement("Sign-ON link", By.linkText("SIGN-ON"));
	 	 
	 public HomePage(final boolean openPageURL) throws Exception {
			super(Identifier_FeaturedDestination, openPageURL ? SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
	 }
	 
	 public LoginPage navigateToLoginPage() throws Exception {
		 Sign_on_link.click();
	     return new LoginPage(false);
	    }
	 
	 
}
