package test.java;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options (
	   features= "src/CucumberPackage/FeatureFiles.feature",//path of feature file
	   glue = {"CucumberPackage"},// path of step definition file
		 tags ="@shree"
	   // tags ={“@Webdriver“},..// execute these tags
	   // tags ={“~@SoapUI“},... // exclude these tags
	   // dryRun = true// will check if there is there is a function for each step in feature file
	   // format = {"pretty"} 
		
		//format={"html:Folder_Name"} // to specify formatting options for the output reports in the mentioned location
	     )
	    
public class TestRunner {

}
