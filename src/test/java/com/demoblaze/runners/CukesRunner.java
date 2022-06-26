package com.demoblaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                 "html: target/cucumber-report.html"
        },
        features = "src/test/resources/feature",
        glue = "com/demoblaze/stepdefinitions",
        dryRun = false,
        tags=""


)


public class CukesRunner {


}
