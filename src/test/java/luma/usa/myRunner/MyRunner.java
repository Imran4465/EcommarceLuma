package luma.usa.myRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		
		plugin= {"pretty","json:target/cucumber.json"},
		features= {"./Features"},
		glue = {"luma.us.stepDefination","luma.us.hooks"},
		tags="@sanity"
		
		)

public class MyRunner extends AbstractTestNGCucumberTests{

}
