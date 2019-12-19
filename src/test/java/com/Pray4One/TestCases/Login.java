package com.Pray4One.TestCases;


import com.Pray4One.PageObjects.*;
import com.beust.jcommander.Parameter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Login extends BaseClassAndroid
{
    public Login() throws MalformedURLException
    {
    }

    AndroidDriver<AndroidElement> driver1 = capabilities();

    public Login(AndroidDriver<AndroidElement> driver1) throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(driver1), this);
    }

    @Test
    void BaseClass() {
        System.out.println("Appium Started");
    }

    @Test(priority = 1)
    @Parameter(description = "Login with valid email id and pwd")
    void LoginWithValidEmailIdAndValidPwd() throws IOException
    {
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WorkBookPage wb1 = new WorkBookPage(driver1);

        LoginPage l1 = new LoginPage(driver1);
        l1
                .tapStartButton()
                .sendEmail(wb1.s0)
                .sendPassword(wb1.s1)
                .tapLogin();

        HomePage h1 = new HomePage(driver1);
        h1
                .tapSettingsButton();

        SettingsPage s1 = new SettingsPage(driver1);
        s1
                .tapLogoutButton();
    }

    @Test(priority = 2)
    @Parameter(description = "Login with valid email and invalid PWD")
    void LoginWithValidEmailAndInValidPWD() throws IOException
    {
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WorkBookPage wb1 = new WorkBookPage(driver1);

        LoginPage l2 = new LoginPage(driver1);
        l2
                .sendEmail(wb1.s0)
                .sendPassword(wb1.s3)
                .tapLogin();

//        ErrorsPage e2 = new ErrorsPage(driver);
//        e2
//                .tapInvalidUnPWDOkButton();

        Alert popup = driver1.switchTo().alert();
        popup.accept();

        l2
                .clrEmail()
                .clrPassword();
    }

    @Test(priority = 3)
    @Parameter(description = "Login with invalid email and valid PWD")
    void LoginWithInvalidEmailAndValidPwd() throws IOException
    {
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WorkBookPage wb1 = new WorkBookPage(driver1);

        LoginPage l3 = new LoginPage(driver1);
        l3
                .sendEmail(wb1.s2)
                .sendPassword(wb1.s1)
                .tapLogin();

        InvalidUNPWDPage pwd3 = new InvalidUNPWDPage(driver1);
        pwd3
                .checkErrorMessage();

        l3
                .clrEmail()
                .clrPassword();
    }

    @Test(priority = 4)
    @Parameter(description = "Login with invalid email and invalid PWD")
    void LoginWithInValidEmailAndInvalidPwd() throws IOException
    {
        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WorkBookPage wb1 = new WorkBookPage(driver1);

        LoginPage l4 = new LoginPage(driver1);
        l4
                .sendEmail(wb1.s2)
                .sendPassword(wb1.s3)
                .tapLogin();


        InvalidUNPWDPage pwd4 = new InvalidUNPWDPage(driver1);
        pwd4
                .checkErrorMessage();

        l4
                .clrEmail()
                .clrPassword();
    }

}
