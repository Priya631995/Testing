import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//create driver object for chrome browser
		
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("hi");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("arc");
		//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		driver.get("http://makemytrip.com");
		driver.findElement(By.xpath("//*[@data-cy='account']")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("9960362796");
		driver.findElement(By.cssSelector("#SW")).click();
		//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/a[3]")).click();
		driver.findElement(By.xpath("//a[@class='latoBlack']")).click();
		driver.findElement(By.cssSelector("#emailOrPhone")).sendKeys("6666");
		driver.findElement(By.cssSelector("#password")).sendKeys("walke@6395");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div[2]/section/form/div[4]/button/span")).click();
		
	
		
		
	
		}

}
