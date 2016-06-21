package com.cucumber.utils;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "Features"
		,glue={"com.cucumber.teststeps"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

	public static void main(String[] args) {
	}

}