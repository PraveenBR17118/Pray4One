package com.Pray4One.TestCases;


import com.Pray4One.PageObjects.*;
import com.beust.jcommander.Parameter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class GetTitleAndroid extends BaseClassAndroid
{
    AndroidDriver<AndroidElement> driver2 = capabilities();

        public GetTitleAndroid() throws MalformedURLException
        {
        }

        public GetTitleAndroid(AndroidDriver<AndroidElement> driver2) throws MalformedURLException
        {
            PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
        }

    @Test(priority = 1)
    @Parameter(description = "Get the Login Page Title")
    void GettheLoginPageTitle()
    {
        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage l1 = new LoginPage(driver2);
        l1
                .tapStartButton()
                .sendEmail("kehsihbaalkush.89@gmail.com")
                .sendPassword("Alkush@1991")
                .tapLogin();

        HomePage h1 = new HomePage(driver2);
        System.out.print(h1.PrayForOtherTitleText());
        HomePage S1 = h1.PrayForOtherTitleText();

        WebDriverWait wait=new WebDriverWait(driver2,30);
        wait.until(ExpectedConditions.textToBe(By.xpath("//android.widget.TextView.[@text='Pray for Others']"),"Pray for Others"));

        h1
                .tapSettingsButton();
    }
}
