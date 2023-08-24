package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","html:target/default-cucumber-report"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
<<<<<<< HEAD
        tags = "@giris",
=======
        tags = "@kitap",
>>>>>>> c4ca386fbe73bfa94c36708922ec06b35ea8f629
        dryRun = false
)

public class Runner {
}
