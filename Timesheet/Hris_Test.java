package com.hris;

import static org.junit.Assert.assertTrue;

import javafx.scene.layout.Priority;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Hris_Test {
    Login h =new Login();

    @Test(priority = 0)
    public void open_Browser_And_Open_Hris_Test()
    {
        h.open_Browserand_Open_Hris();
        Assert.assertTrue(h.get_Current_Url().contains("login.php"));
    }
    @Test(priority = 1)
    public void Login_Test_With_Incorrect_credentials()
    {
        h.Login_With_Incorrect_Credentials("akriti", "Akriti@321");
        Assert.assertTrue(h.get_Current_Url().contains("https://hris.qainfotech.com/login.php"));
    }

    @Test(priority = 2)
    public void Login_Test_With_No_Password()
    {
        h.Login_With_No_Password("abcd");
        Assert.assertTrue(h.driver.findElement(By.cssSelector("#login > form > div.loginTxt.txtHideDiv.alert.alert-error > div")).getText().contains("Invalid Login"));
    }

    @Test(priority = 3)
    public void Login_Test_With_Correct_Credentials()
    {
        h.Login_With_Correct_Credentials("akritityagi", "Akriti@321#");
        Assert.assertTrue(h.Get_Profile_Name().contains("Abhay"));
        Assert.assertTrue(h.Hours_Check().contains("40:27"));


    }

}

