package trialrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trialprojectpage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium material\\broswers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com/practice-form.html");
	      driver.findElement(By.xpath("//*[@text()='Switch Commands']"));
	      System.out.println(driver.findElement(By.xpath("//*[@text()='Wait Commands']")).getText());
	      System.out.println(driver.findElement(By.xpath("//*[@text()='Wait Commands']")).getText());
			
	}

}
