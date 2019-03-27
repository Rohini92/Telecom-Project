package org.tele;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
monochrome=true,glue="org.tele",plugin="html:target")

public class TestRunner {

	
}
