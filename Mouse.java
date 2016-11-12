package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		 
		Actions abc=new Actions(driver);
		WebElement element= driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(element).build().perform();
		WebElement element1= driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(element1).sendKeys("maggi").build().perform();
		abc.contextClick(element1).build().perform();
		
		
	}

}
