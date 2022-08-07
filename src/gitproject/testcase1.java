package gitproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.studyonlinetech.com");
		
		driver.close();
		
		
		

	}

}
