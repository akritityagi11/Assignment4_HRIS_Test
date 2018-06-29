import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class Timesheet {

	 WebDriver driver;
	 By timesheet = By.id("addstatustag");
	 By taskBoard = By.cssSelector(".icon_size.taskboard");
	 By dashBoard = By.cssSelector(".icon_size.dashboard");
	 public Timesheet(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void CheckTimesheet()
	 {
		 driver.findElement(timesheet).click();
		 String expectedURL="https://hris.qainfotech.com:8086/time/timesheet";
		 Assert.assertEquals( expectedURL, driver.getCurrentUrl());         //actual,expected 
	
	 }
	 public void time(int myDate) 
	{
				System.out.println(driver.findElement(By.xpath("//*[text()="+myDate+"]/../div/div[2]/p/span")).getText());
	 }
	 
	 public void CheckTaskBoard()
	 {
		 driver.findElement(taskBoard).click();
		 String expectedURL="https://hris.qainfotech.com:8086/taskboard/list";
		 Assert.assertEquals( expectedURL, driver.getCurrentUrl());         //actual,expected      
	 }
	 public void CheckDashBoard()
	 {
		 driver.findElement(dashBoard).click();
		 String expectedURL="https://hris.qainfotech.com:8086/report/dashboard";
		 Assert.assertEquals( expectedURL, driver.getCurrentUrl());     //actual,expected
	 }
}
