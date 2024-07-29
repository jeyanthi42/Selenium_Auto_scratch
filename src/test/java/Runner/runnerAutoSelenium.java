package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/featureFiles",
glue = {"\\StepDefinitions","\\Hooks"},
plugin = {"pretty","html:target/cucumberReport/cucumber-htmlreport.html",
		"json:target/cucumberReport/cucumber-jsonreport.json"},
		tags=""
		)
public class runnerAutoSelenium {

}
