package cucumberOptions;



import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;



//@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src//test//java//Features"}
		,glue = {"src//test//java//StepDefinitions"}
		,plugin = {"pretty","html:target/cucumber"}
)


@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
