package com.browserstack.cucumber;

import com.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/local.feature",
        plugin = {
        "pretty", "html:target/cucumber-html-reports",
        "json:target/cucumber.json"},
 tags = "@tcl")
public class LocalTest extends BrowserStackSerenityTest { }
