import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Test {

	WebDriver driver;
	@BeforeClass
	public void init()
	{
		System.setProperty("webDriver.chrome.driver","/home/qainfotech/workspace/TestHris/chromedriver");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void closeSession() 
	{
//		driver.quit();
	}
	@org.testng.annotations.Test
	public void step01_launchURL()
	{
		driver.get("https://hris.qainfotech.com/login.php");
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		driver. manage(). window().maximize();
	}
    @org.testng.annotations.Test
	public void step04_SignIn()
	{
	Login login=new Login(driver);            //create object of hris_login to reach to that page
	login.setusername("akritityagi");
	login.setpassword("Akriti@321#");
	login.clickLogin();
	}
    @org.testng.annotations.Test
    public void step05_Timesheet()
    {
    	Timesheet timesheet=new Timesheet(driver);
    	timesheet.CheckTimesheet();
        timesheet.time(25);
    	timesheet.CheckTaskBoard();
    	timesheet.CheckDashBoard();
    }
}
