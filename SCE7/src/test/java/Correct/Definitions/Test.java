package Correct.Definitions;

import io.cucumber.junit.CucumberOptions;

//RUnWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features" , glue={"CorrectDefinitions"})
public class Test extends Rest {

}
