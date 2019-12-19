package com.Pray4One.TestCases;


import com.Pray4One.PageObjects.*;
import com.beust.jcommander.Parameter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestAll
{
    private String ValidEmailId  = "kehsihbaalkush.89@gmail.com";
    private String InValidEmailId  = "kehsihbaalkush.89@gmail.";
    private String ValidPwd  = "Alkush@1991";
    private String InValidPwd  = "Alkush@";

    private Actions action=null;

    public TestAll()
    {
    }

    @BeforeSuite
    @Parameter(description = "Creating Base Class")
    public AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
    {
        System.out.println( "Welcome To Appium Automation Framework" );
        File AppLocation = new File("src");
        //File InstallAppLocation = new File(AppLocation, "pray4One-Android.apk");
        File InstallAppLocation = new File(AppLocation, "app-release (1).apk");
        DesiredCapabilities capability = new DesiredCapabilities();
        //capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a XL API 29");
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capability.setCapability(MobileCapabilityType.APP, InstallAppLocation.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>
                (new URL("http://127.0.0.1:4723/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    @Test(priority = 1)
    @Parameter(description = "Login with valid email id and valid pwd")
    public void TestOne() throws Exception
    {
        AndroidDriver<AndroidElement> driver1 = capabilities();

        driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        LoginPage s1 = new LoginPage(driver1);

        s1
                .tapStartButton()
                .sendEmail(ValidEmailId)
                .sendPassword(ValidPwd)
                .tapLogin();

        HomePage o1 = new HomePage( driver1);
        o1

                .tapKLoveButton()
                .tapSettingsButton()
                .tapForOtherButton()
                .tapAirButton()
                .tapAllButton()
                .tapMyImpactButton()
                .tapForMeButton();
//
//       JavascriptExecutor js = (JavascriptExecutor) driver1;
//   	HashMap<String, String> swipeObject = new HashMap<String, String>();
//
//   	swipeObject.put("direction", "down");
//
//	js.executeScript("mobile:scroll", swipeObject);

//        //Set<String> whs = driver1.getWindowHandles();
//        action=new Actions(driver1);
//
//        for(String childTab:driver1.getWindowHandles())
//        {
//        driver1.switchTo().window(childTab);
//        }
//        action.moveToElement(f1.PraiseReport).click().build().perform();

    }

}
