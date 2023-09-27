package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
			//features = {"src/test/resource/Feature/Scans.feature","src/test/resource/Feature/Scans1.feature","src/test/resource/Feature/Findings.feature","src/test/resource/Feature/Findingscreen.feature","src/test/resource/Feature/Findingsbucketflow.feature"},//"src/test/resource/Feature/Scans.feature","src/test/resource/Feature/Scans1.feature"
		features = {"src/test/resource/Feature"},	
		glue = {"Stepdefinition"},
			dryRun =false,
			monochrome = true,
			plugin = {"pretty",  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" , "html: target/report.html",}
			)
public class TestRunner extends AbstractTestNGCucumberTests
	{

	}


