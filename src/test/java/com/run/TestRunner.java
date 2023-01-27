package com.run;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features ="Features",
glue = {"stefDef"}
//tags  = "@dish"

)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
	
 
}
