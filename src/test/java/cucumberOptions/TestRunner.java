package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src/test/java/features", 
									plugin = "json:target/JsonReports/Cucumber-Report.json", 
									glue = "stepDefinations")
public class TestRunner {

}
