package JunitRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
// for path of anything to run on mac and other system use 'single forward slash /' instead of \\'double backward'
@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Rahul Jadhav\\eclipse-workspace\\seleniumCucumber\\features\\login.feature", 
glue= {"stepdefinition"}, //package name
dryRun=false, //for dry run that is only mapping feature file gherkin with glue code steps
monochrome=true, //to reduce unwanted comments
plugin= {"pretty", "html:target/Html Reports/reports.html",
"pretty", "json:target/JSON Reports/reports.json",
"pretty", "junit:target/Junit Reports/reports.xml"}
)

// generate reports 1.html:target/Html Reports/reports.html //2. json:terget/JSON Reports/report.json




public class runner_class {

}
