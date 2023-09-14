package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\admin\\Desktop\\Armorcode\\Armorcode_project\\src\\test\\resources\\Features\\subproduct.feature" ,
		glue = {"stepdefination"},
		plugin = {"html:test_reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class TestRunner {


}
