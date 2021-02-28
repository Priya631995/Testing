import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Dropdown2 {

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
			
	//Parent-child relationship dropdown		
	//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //input[@value='BHO']")).click();
			
		
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



	}

}
