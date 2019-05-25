package EggTimer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@smoke,~@regression", monochrome = true, dryRun = false, plugin = {"pretty", "html:target/reports"})

public class RunTest {
}
