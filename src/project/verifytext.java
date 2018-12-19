package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifytext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/usr/local/share/chrome-driver/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.224.208.100:32771/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.linkText("About Us")).click();
        driver.findElement(By.id("PID-ab2-pg")).getText();
        System.out.println("Test Succeeded!!");
        driver.quit();
        
        
	}
}	
