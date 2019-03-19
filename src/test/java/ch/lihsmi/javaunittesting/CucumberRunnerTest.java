package ch.lihsmi.javaunittesting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, strict = true, features = "src/test/resources", glue = "ch.lihsmi.javaunittesting")
public class CucumberRunnerTest {
}