package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\jmohamme\\eclipse-workspace\\TestProject\\src\\main\\java\\Feature",
		glue= {"Definitions"}
		
		)
		

public class TestRunner {

	
	
	
}
