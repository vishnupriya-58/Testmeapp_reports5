package cucumber_reports_stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"json:target/cucumber54646.json"},features="Feature456",glue="cucumber_reports_stepdef")
public class Runnerclass_reports {

}
