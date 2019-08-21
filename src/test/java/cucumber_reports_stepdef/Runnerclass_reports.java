package cucumber_reports_stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature456",glue="cucumber_reports_stepdef",plugin={"json:target/cucumber.json"})
public class Runnerclass_reports {

}
