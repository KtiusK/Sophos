package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//la ruta donde se encuentran los casos de pruebas a ejecutar 
		
		features = {"C:\\Users\\Katiusca\\eclipse-workspace\\Sophos Solutions\\com.MyCucumber.Project\\src\\test\\java\\Modulos\\Pruebasophos.feature"},
				
		glue = "Metodos",
	//	plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"},
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/cucumber-reports/report.html"},
		tags = {"@tag1"}
		
		)

public class cucumberRunner {


}




