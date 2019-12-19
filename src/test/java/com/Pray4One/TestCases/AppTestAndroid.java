package com.Pray4One.TestCases;

import com.Pray4One.PageObjects.*;
import com.beust.jcommander.Parameter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class AppTestAndroid extends BaseClassAndroid
{

    AndroidDriver<AndroidElement> driver1 = capabilities();

    public AppTestAndroid() throws MalformedURLException {

    }

    public AppTestAndroid(AndroidDriver<AndroidElement> driver1) throws IOException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver1) ,this);
    }

    @Test(priority = 1)
    @Parameter(description = "Login with valid email id and valid pwd")
    void TestOne() throws Exception
    {
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WorkBookPage wb1 = new WorkBookPage(driver1);

        LoginPage l1 = new LoginPage(driver1);

        l1
                .tapStartButton()
                .sendEmail(wb1.s0)
                .sendPassword(wb1.s1)
                .tapLogin();
        Thread.sleep(1000);

        HomePage o1 = new HomePage(driver1);
        o1

                .tapKLoveButton()
                .tapSettingsButton()
                .tapForOtherButton()
                .tapAirButton()
                .tapAllButton()
                .tapMyImpactButton()
                .tapForMeButton()
                .tapSettingsButton();

        SettingsPage s1 = new SettingsPage(driver1);
        s1
                .tapLogoutButton();
    }
}
