package com.rameshsoft.automation.stepdefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "D:\\RameshSoft2directory\\BDDCucumber\\Feature Files\\FB_ScenarioOutline.feature",
    glue = "com.rameshsoft.automation.steppdefinations")
    //plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
    //tags = "@rameshsoft", // Uncomment and set this to execute specific tagged scenarios
    //dryRun = false,       // Set to true to validate the mappings without running tests
    //strict = true,        // Ensures undefined steps are treated as errors
    //monochrome = true     // Makes the console output more readable
//)
public class TestRunner {
}


/*package com.rameshsoft.automation.stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\RameshSoft2directory\\BDDCucumber\\Feature Files\\FB_ScenarioOutline.feature",
glue = "com.rameshsoft.automation.stepdefinations",
plugin= "html:target/cucumber.html")
//tags = "@rameshsoft")
//dryRun = true)
//strict = true)
//monochrome = true)
public class TestRunner {

}*/ 


/*@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\RameshSoft2directory\\BDDCucumber\\Feature Files\\FB.feature",
glue = "com.rameshsoft.automation.steppdefinations",
plugin= "html:target/cucumber.html")
//tags = "@rameshsoft")
//dryRun = true)
//strict = true)
//monochrome = true)
public class TestRunner {

} */