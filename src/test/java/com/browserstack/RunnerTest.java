package com.browserstack;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(//features="src/test/resources/MyFeatures.feature",
        //features="src/test/resources/NegativeTests.feature",
        features = "src/test/resources/Features/",
        plugin = {
                "pretty", "html:target/cucumber-html-reports",
                "json:target/cucumber.json"})
       // tags = "@tc241")
// tags = "@qaapp")

public class RunnerTest {
}
