package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", plugin = { "json:target/cucumber.json",
		"html:target/site/cucumber-pretty" }, glue = { "StepsDefinitions" }, monochrome = true)
public class TestRunner {

}
