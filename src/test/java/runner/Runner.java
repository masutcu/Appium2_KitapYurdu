package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:raporlar/CucumberRapor.html"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@catagories_Clickability",
        dryRun = false, //true iken test çalışmadan eksik stepler görülür
        monochrome = true
)

public class Runner {
}
