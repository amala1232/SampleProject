package ConfigData;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles",glue={"StepDefinitions"}
		)
 
public class TestRunner {

}
