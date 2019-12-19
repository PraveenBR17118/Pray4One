package com.Pray4One.TestCases;

import com.Pray4One.PageObjects.*;
import com.beust.jcommander.Parameter;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AppTestiOS extends BaseClassiOS
{

    private IOSDriver iosdriver1 = capabilities();


    public AppTestiOS() throws MalformedURLException
    {

    }

    public AppTestiOS(IOSDriver<IOSElement> iosdriver1) throws MalformedURLException
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1) ,this);
    }

    @Test
    void BaseClass()
    {
        System.out.println("Appium Started");
    }

    @Test(priority = 1)
    @Parameter(description = "Login with valid email id and pwd")
    void LoginWithValidEmailIdAndValidPwd() throws IOException
    {
        iosdriver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WorkBookPage wb1 = new WorkBookPage(iosdriver1);

        LoginPage startPage = new LoginPage(iosdriver1);
        startPage
                .tapStartButton()
                .sendEmail(wb1.s0)
                .sendPassword(wb1.s1)
                .tapLogin()
                .tapLogin();

        HomePage o1 = new HomePage(iosdriver1);
        o1
                .tapSettingsButton();

        SettingsPage p1 = new SettingsPage(iosdriver1);
        p1
                .tapLogoutButton();

    }

    @Test(priority = 2 )
    @Parameter(description = "Login with valid email and invalid PWD")
    void LoginWithValidEmailAndInValidPWD()
    {
        iosdriver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage s2 = new LoginPage(iosdriver1);
        s2
                .sendEmail("kehsihbaalkush.89@gmail.com")
                .sendPassword("Alkush@")
                .tapLogin()
                .tapLogin();


        Alert popup = iosdriver1.switchTo().alert();
        popup.accept();

        PopUpPage p1 = new PopUpPage(iosdriver1);
        p1
                .tapInvalidUnPWDOkButton();

        s2
                .clrEmail()
                .clrPassword();
    }

    @Test(priority = 3)
    @Parameter(description = "Login with invalid email and valid PWD")
    void LoginWithInvalidEmailAndValidPwd()
    {
        iosdriver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage s3 = new LoginPage(iosdriver1);
        s3
                .sendEmail("kehsihbaalkush.89@gmail")
                .sendPassword("Alkush@1991")
                .tapLogin();

        InvalidUNPWDPage pwd3 = new InvalidUNPWDPage(iosdriver1);
        pwd3
                .checkErrorMessage();

        s3
                .clrEmail()
                .clrPassword();

    }

    @Test(priority = 4)
    @Parameter(description = "Login with invalid email and invalid PWD")
    void LoginWithInValidEmailAndInvalidPwd()
    {
        iosdriver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage s4 = new LoginPage(iosdriver1);
        s4
                .sendEmail("kehsihbaalkush.89@gmail")
                .sendPassword("Alkush@")
                .tapLogin();

        InvalidUNPWDPage pwd4 = new InvalidUNPWDPage(iosdriver1);
        pwd4
                .checkErrorMessage();

        s4
                .clrEmail()
                .clrPassword();
    }
}
