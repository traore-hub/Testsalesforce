package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/resources/feature/tache.feature", 
glue= "StepDef",
tags= "@tag",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class run {

}
