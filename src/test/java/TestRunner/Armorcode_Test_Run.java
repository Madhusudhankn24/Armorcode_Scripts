 package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurefiles/Dashboard.feature",
					glue = {"StepDefinitions","appHooks"},
					plugin = {"pretty",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Armorcode_Test_Run {
}
