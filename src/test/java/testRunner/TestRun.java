package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./Features/"},
				dryRun = false, 
				monochrome = true,
				glue = "stepDefinitions", 
				plugin = {"pretty","html:test-output"},
				tags = {"@Sanity","@Regression"})
public class TestRun {

}
