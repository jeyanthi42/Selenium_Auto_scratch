package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommanUse.BrowerLaunch;
import Hooks.BasicHooksClass;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpageValidation {
	
	WebDriver driver1; BasicHooksClass hooks; BrowerLaunch launch= new BrowerLaunch();
	
	//BrowerLaunch launch ;
	@Given("provide the login creditial as UserName:<{string}> and Password<{string}>")
	public void provide_the_login_creditial_as_user_name_and_password(String uname, String pword) {
		 // Write code here that turns the phrase above into concrete actions
		
		//driver= hooks.beforeScenario();
		launch.launchBrowser();
		driver1 = launch.getDriver();

		System.out.println("Person in Given StateMent");
		
		driver1.get("http://testphp.vulnweb.com/login.php");
		System.out.println("Person entered into php login page");
		
		WebElement userName= driver1.findElement(By.name("uname"));
		WebElement passWord= driver1.findElement(By.name("pass"));
		userName.sendKeys(uname);
		passWord.sendKeys(pword);
		
	    
	}
	@When("Click the login button")
	public void click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Person in When State Ment");
	   
	}
	@Then("Verify Ppt entered into home page")
	public void verify_ppt_entered_into_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Person in Then State Ment");
	   
	}


	
}
