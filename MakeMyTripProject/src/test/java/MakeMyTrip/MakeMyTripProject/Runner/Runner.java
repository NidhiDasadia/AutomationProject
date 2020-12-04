package MakeMyTrip.MakeMyTripProject.Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/featureFiles/Login/Login.feature" }, 
	glue = {
		"MakeMyTrip.MakeMyTripProject.StepDefinition" },
	tags = {"~@ignore"})

public class Runner{
	
}

