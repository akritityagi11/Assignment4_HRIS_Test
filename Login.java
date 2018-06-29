import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	 WebDriver driver;
	 By username=By.id("txtUserName");
	 By password=By.id("txtPassword");
	 By loginButton=By.name("Submit");
	 
	 public Login(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void setusername(String userNamevalue)
	 {
		 driver.findElement(username).sendKeys(userNamevalue);
	 }
	 public void setpassword(String passwordValue)
	 {
		 driver.findElement(password).sendKeys(passwordValue);
	 }
	 public void clickLogin()
	 {
	     driver.findElement(loginButton).click();
	 }
}
