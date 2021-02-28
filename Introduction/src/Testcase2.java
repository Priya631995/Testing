import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.geck.driver","E:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://makemytrip.com");
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[1]/ul/li[6]/div/p")).click();

	}

}
