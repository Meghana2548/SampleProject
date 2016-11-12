package DatadrivenandPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {

	WebDriver driver;

	By userName = By.id("ap_email");
	By passWord = By.id("ap_password");
	By LoginButton = By.xpath(".//*[@id='signInSubmit']");

	public LoginPage1(WebDriver driver) {
		this.driver = driver;

	}
	
	public void LogintoAmazon(String userid,String upwd)
	{
		driver.findElement(userName).sendKeys(userid);;
		driver.findElement(passWord).sendKeys(upwd);;
		driver.findElement(LoginButton).click();
	}

		public void typeUsername()
		{
			driver.findElement(userName);
		}
		
		
		public void typepassword()
		{
			driver.findElement(passWord);
			
		}

		public void clickLoginbutton()
		{
			driver.findElement(LoginButton);
			
		}
}