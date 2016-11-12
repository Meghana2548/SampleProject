package DatadrivenandPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelDataConfig;

public class VerifyamazonLoginwithexcel {
	
			
	@Test(dataProvider="logindata")
	public void VerifyLogin(String userid,String upwd)
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement element =driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
		
		LoginPage1 login=new LoginPage1(driver);
		/*login.typeUsername("meghana.sriranganilayam@gmail.com");
		login.typepassword("Meghana@2548");
		login.clickLoginbutton();
		*/
		
		 login.LogintoAmazon(userid,upwd);
		driver.quit();
	}

	@DataProvider
	public Object[][] logindata()
	{
		ExcelDataConfig d=new ExcelDataConfig("C:\\Users\\580\\workspace\\SeleniumProject\\TestData\\AmazonLoginData.xlsx");
		
		int rows=d.getRowcount("Sheet1");
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			
			data[i][0]= d.getData("Sheet1", i, 0);
			data[i][1]=d.getData("Sheet1", i, 1);
			
		}
		
		return data;
	}
}
	
	

