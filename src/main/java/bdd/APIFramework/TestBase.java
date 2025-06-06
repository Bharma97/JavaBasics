package bdd.APIFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;

	
	public static void init() {
		String browserName = "chrome";
		System.out.println("browser name is " + browserName);
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.silentOutput", "true");			
			System.out.println("Browser is set to chrome");

			driver = new ChromeDriver();

		}

		try {
			driver.get("https://demo.guru99.com/test/newtours/");

		} catch (Exception e) {
			e.printStackTrace();
			//System.exit(0);
		}
	
	}
	
	

}