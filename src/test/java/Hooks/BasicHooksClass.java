package Hooks;

import org.openqa.selenium.WebDriver;

import CommanUse.BrowerLaunch;  
import CommanUse.lauchingBrowse;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BasicHooksClass {
		WebDriver driver;
		lauchingBrowse browser;
		public Scenario scenarioName;
		
					
		@Before		
		public void beforeScenario(Scenario scenario) throws InterruptedException {		
		System.out.println("This is Before Scenario");	
		int i = 5;
		driver = browser.getInstance(i).getDriverName();
				
		}
	
	@After
		public void afterScenario(Scenario scenario) {
		
		System.out.println("This is After Scenario");
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
			//BrowerLaunch.getDriver().quit();
	}
	
}
