package com.amazon.automation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/googleAutomation.feature",
glue = "com.amazon.automation.stepdefinitions",
snippets = SnippetType.CAMELCASE)

public class GoogleAutomationRunner {
}
