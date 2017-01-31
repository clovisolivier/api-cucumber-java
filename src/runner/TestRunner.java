import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by clovisolivier on 30/01/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"features"},
        plugin={"html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}
    )

public class TestRunner {
}
