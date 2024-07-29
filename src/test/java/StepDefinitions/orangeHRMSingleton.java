package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommanUse.BrowerLaunch;
import CommanUse.lauchingBrowse;
import Hooks.BasicHooksClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangeHRMSingleton {
WebDriver driver;  BasicHooksClass hooks;;
	
	//BrowerLaunch launch = new BrowerLaunch();
	lauchingBrowse browser ;
	//Logg
	
	@Given("provide the login creditial for OrangeHRM as UserName:<{string}> and Password<{string}> singleton")
	public void provide_the_login_creditial_for_orange_hrm_as_user_name_and_password(String uname, String pword) {
		 
		System.out.println("This si the OrangeHRM login page");
		
		driver =browser.getInstance(0).getDriverName();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(4000);
			   WebElement usernameElement= driver.findElement(By.name("username"));
			   WebElement passwordElement= driver.findElement(By.name("password"));
			   usernameElement.sendKeys(uname);
			   passwordElement.sendKeys(pword);
			   
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	}
	@When("Click the login button in orangeHRM singleton")
	public void click_the_login_button_in_orange_hrm() {
	 
	}
	@Then("Verify Ppt entered into home page of OrangeHRM singleton")
	public void verify_ppt_entered_into_home_page_of_orange_hrm() {
	    
	}


}
