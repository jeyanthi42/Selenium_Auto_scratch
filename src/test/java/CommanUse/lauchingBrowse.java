package CommanUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lauchingBrowse {
	private  static lauchingBrowse  driverInstance;
	private static WebDriver driver;
	 
	private lauchingBrowse() {}
	
	public static lauchingBrowse getInstance(int i) {
		try {
			if(i==5) {
				driverInstance = new lauchingBrowse();
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return driverInstance;
	}
		
	public WebDriver getDriverName() {
		return driver;
	}

}
