package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\test\\resources\\FeatureFile\\File.feature"},
glue= {"StepDefinition"}

		)

public class Test_Runner extends AbstractTestNGCucumberTests {

}
