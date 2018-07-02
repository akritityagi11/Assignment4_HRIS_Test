package com.hris;

import com.google.common.base.CharMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver = new ChromeDriver();

    public void open_Browserand_Open_Hris()
    {
        driver.get("https://hris.qainfotech.com/login.php");
        driver.findElement(By.cssSelector("#demo-2 > div > div.tabbable.custom-tabs.tabs-left.tabs-animated.flat.flat-all.hide-label-980.shadow.track-url.auto-scroll > ul > li:nth-child(1)")).click();

    }


    public String get_Current_Url()
    {
        return driver.getCurrentUrl();
    }

    public void Login_With_Correct_Credentials(String Username , String Password) {

        WebElement e1=driver.findElement(By.id("txtUserName"));
        e1.clear();
        WebElement e2=driver.findElement(By.id("txtUserName"));
        e2.sendKeys(Username);
        WebElement e3= driver.findElement(By.id("txtPassword"));
        e3.clear();
        WebElement e4=driver.findElement(By.cssSelector("#txtPassword"));
        e4.sendKeys(Password);
        driver.findElement(By.name("Submit")).click();
    }
    public String Get_Profile_Name()
    {
        return driver.findElement(By.cssSelector(".profile-btn span")).getText();
    }

    public void Login_With_No_Password(String Username)
    {
     driver.findElement(By.id("txtUserName"));
        driver.findElement(By.cssSelector("#demo-2 > div > div.tabbable.custom-tabs.tabs-left.tabs-animated.flat.flat-all.hide-label-980.shadow.track-url.auto-scroll > ul > li:nth-child(1)")).click();
    }
    public void Login_With_Incorrect_Credentials(String Username , String Password)
    {
        WebElement e1=driver.findElement(By.id("txtUserName"));
        e1.clear();
        WebElement e2=driver.findElement(By.id("txtUserName"));
        e2.sendKeys(Username);
        WebElement e3= driver.findElement(By.id("txtPassword"));
        e3.clear();
        WebElement e4=driver.findElement(By.cssSelector("#txtPassword"));
        e4.sendKeys(Password);
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.cssSelector("#demo-2 > div > div.tabbable.custom-tabs.tabs-left.tabs-animated.flat.flat-all.hide-label-980.shadow.track-url.auto-scroll > ul > li:nth-child(1)")).click();
    }
    public String Hours_Check()
    {
        int count=0;
        int day=18;
        String v1="//*[@id=\"dv_2018-06-";
        String v2="\"]/div/div[1]/div/div[2]/p[1]/span";
        String arr[]=new String[20];
        int totalHour = 0;
        int totalMinute = 0;
        for(int i=0;i<=4;i++)
        {
            arr[i]=driver.findElement(By.xpath(v1+day+v2)).getText();
            day++;
            String currentTime[] = arr[i].split(":");
            int hours = Integer.parseInt(currentTime[0]);
//            System.out.println(hours);
            int minutes = Integer.parseInt(currentTime[1]);
//            System.out.println((minutes));
            totalMinute+=minutes;
            totalHour+=hours;

            if(totalMinute>=60){
                totalMinute-=60;
                totalHour++;
            }
        }

            //System.out.println(arr[i]);

            //System.out.println(arr[j]);
       // System.out.println(totalHour+":"+totalMinute);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"dv_total\"]/div/span")).getText());
        return driver.findElement(By.xpath("//*[@id=\"dv_total\"]/div/span")).getText();



    }

}
