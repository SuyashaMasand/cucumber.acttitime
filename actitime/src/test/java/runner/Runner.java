package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features ="featurefile", glue ="stepdefinition", tags ="@LoginExample")
public class Runner extends AbstractTestNGCucumberTests{

}
