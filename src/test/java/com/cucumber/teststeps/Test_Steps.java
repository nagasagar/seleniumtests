package com.cucumber.teststeps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumtests.webpage.BookingConfirmationPage;
import com.seleniumtests.webpage.FlightBookingPage;
import com.seleniumtests.webpage.FlightFinderPage;
import com.seleniumtests.webpage.FlightResultsPage;
import com.seleniumtests.webpage.HomePage;
import com.seleniumtests.webpage.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	HomePage homepage;
	LoginPage loginpage;
	FlightFinderPage flightfinderpage;
	FlightResultsPage flightresultspage;
	FlightBookingPage flightbookingpage;
	BookingConfirmationPage bookingconfirmationpage;
	
	@Given("^I am on the HomePage$")
	public void i_am_on_the_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on SIGN-ON link$")
	public void i_click_on_SIGN_ON_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^enter login credentials and sign in$")
	public void enter_login_credentials_and_sign_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Flight finder page is displayed$")
	public void flight_finder_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I am logged in the application$")
	public void i_am_logged_in_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter search parameters$")
	public void i_enter_search_parameters() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on search$")
	public void click_on_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^flight search results should be displayed$")
	public void flight_search_results_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I Search for flight$")
	public void i_Search_for_flight() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I Select the required flights$")
	public void i_Select_the_required_flights() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I Book tickets$")
	public void i_Book_tickets() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Booking confirmation number should be displayed$")
	public void booking_confirmation_number_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}