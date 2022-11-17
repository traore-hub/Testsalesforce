package TestRunner;


import helpers.BrowserHelper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import utils.ConfigFile;

import java.io.FileNotFoundException;

@RunWith(Cucumber.class)
@CucumberOptions(  plugin = {"pretty",
        "html:target/report/cucumber.html",
        "json:target/report/cucumber.json"
},
        features = "src/main/resources/Features",
        glue = "Stepdefinition",
        tags ="@TestCampagn"
)
public class TestRun{

    @BeforeClass
    public static void setup() throws FileNotFoundException {
        ConfigFile.initialiseFile();
        BrowserHelper.helperbrowserChrome();
        //Helpers.helperbrowserfirefox();
        //Helpers.helperbrowseredge();

    }
    @AfterClass
    public static void teardown(){
        BrowserHelper.helperbrowserclose();

    }
}
