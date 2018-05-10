package step_definitions;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by clovisolivier on 30/01/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
        plugin={"html:target/result/cucumber-html-report","json:target/result/cucumber.json", "pretty:target/result/cucumber-pretty.txt",
        "usage:target/result/cucumber-usage.json","junit:target/result/cucumber-results.xml"}
    )

public class TestRunner {
}
