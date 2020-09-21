package Day2demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://corporate.olacabs.com/");
		System.out.println("Hello world");
		//hello
		System.out.println("day 4 Demo ");
		
		//hello
		

	}

}
