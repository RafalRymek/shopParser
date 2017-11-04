package pl.chmielna20;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/chmielna20/resources/features" ,
		format = {"pretty","html:target/report"})

public class Main {

}
