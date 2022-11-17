package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/resources/feature", 
glue= "StepDef",
tags= "@tag",
plugin = {"pretty",
        "html:target/report/cucumber.html",
        "json:target/report/cucumber.json"
})
public class run {

}
