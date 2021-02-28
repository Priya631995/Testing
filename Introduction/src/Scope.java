import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.findElement(By.tagName("a")).getSize());

	}

}
8