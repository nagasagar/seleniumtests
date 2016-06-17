package com.seleniumtests.webpage;

import org.openqa.selenium.By;

import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.ImageElement;
import com.seleniumtests.webelements.LabelElement;
import com.seleniumtests.webelements.PageObject;

public class BookingConfirmationPage extends PageObject {

	private static ImageElement identifier_element = new ImageElement("Flight Confirmation Image",By.cssSelector("img[src='/images/masts/mast_confirmation.gif']"));
	private static LabelElement confirmationelement = new LabelElement("Confirmation number",By.xpath("//*[contains(text(),'Confirmation #')]"));
	
	private static ButtonElement LogoutButton = new ButtonElement("Continue Button", By.cssSelector("img[src='/images/forms/Logout.gif']"));
	
	public BookingConfirmationPage() throws Exception {
		super(identifier_element);
	}
	
	public String getConfirmationNumber(){
		return confirmationelement.getText();
	}
	
	public LoginPage logout() throws Exception{
		LogoutButton.click();
		return new LoginPage(false);
	}
}
