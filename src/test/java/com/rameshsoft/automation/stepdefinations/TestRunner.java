package com.rameshsoft.automation.stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature Files",
glue = "com.rameshsoft.automation.stepdefinations",
plugin= "html:target/cucumber",
dryRun = false,
monochrome = true)
public class TestRunner {

}
