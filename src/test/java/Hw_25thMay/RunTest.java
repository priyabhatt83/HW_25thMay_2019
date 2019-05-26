package Hw_25thMay;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resources\\FeatureFile",tags = "@login",
        plugin = {"pretty","html:target/cucumber-reports"})

public class RunTest {


}
