import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//s.selectByValue("AED");
		// //*[@value='BLR']--Xpath for balglore
		// //(//a[@value='HBX'])[2]  --xpath for arrival to hublix
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='ATQ']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@value='BLR'])[2]" )).click();
		
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//count no of checkbox
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	
		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		    Thread.sleep(4000);

		    // Selection of Adults

		   WebElement  Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		   
		   Select adultsdrp = new Select(Adults);

		    adultsdrp.selectByValue("2");

		    // Selection of Childs

		    WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));

		    Select childsdrp = new Select(childs);

		    childsdrp.selectByValue("2");

		    driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		    System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
		    
		    driver.findElement(By.cssSelector("input[value='Search']")).click();



	}

}
