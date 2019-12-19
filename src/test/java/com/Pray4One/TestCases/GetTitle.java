package com.Pray4One.TestCases;

import com.Pray4One.PageObjects.*;
import com.beust.jcommander.Parameter;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class GetTitle extends BaseClassiOS
{
    private IOSDriver iosdriver2 = capabilities();

    private WebDriverWait wait=new WebDriverWait(iosdriver2,10);


    public GetTitle() throws MalformedURLException
    {
    }

    public GetTitle(IOSDriver<IOSElement> iosdriver2) throws MalformedURLException
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver2), this);
    }

    @Test(priority = 1)
    @Parameter(description = "Get the Login Page Title")
    void GettheLoginPageTitle()
    {

        iosdriver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage startPage = new LoginPage(iosdriver2);
        startPage
                .tapStartButton()
                .sendEmail("kehsihbaalkush.89@gmail.com")
                .sendPassword("Alkush@1991")
                .tapLogin()
                .tapLogin();


        wait.until(ExpectedConditions.titleContains("Pray for Others"));

        HomePage o1 = new HomePage(iosdriver2);
        o1
                .tapSettingsButton();
    }

}