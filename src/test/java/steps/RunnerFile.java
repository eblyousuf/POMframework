package steps;

import cucumber.api.CucumberOptions; 
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features",
				glue="steps",
				plugin = {"html: reports"},
				strict=false,//It shows all pending step definitions.
				dryRun=false,// The mapping step definition missing or not.
				monochrome=true //It shows readable output/report
				//tags = {"@functional"}
								
				//snippets = SnippetType.CAMELCASE
				)

public class RunnerFile extends AbstractTestNGCucumberTests {
	

}
