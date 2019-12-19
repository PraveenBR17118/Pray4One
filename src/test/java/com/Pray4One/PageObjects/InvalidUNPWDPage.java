package com.Pray4One.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindAll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class InvalidUNPWDPage
{
    AndroidDriver<AndroidElement> driver;

    public InvalidUNPWDPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    IOSDriver<IOSElement> iosdriver1;

    public InvalidUNPWDPage(IOSDriver<IOSElement> iosdriver1)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1) ,this);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Please enter valid email']")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeStaticText[@name=\"Please enter email\"]"),
            @iOSXCUITBy(accessibility = "Please enter email")
    })
    public WebElement ErrorMessage;

    public InvalidUNPWDPage checkErrorMessage()
    {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ErrorMessage.isDisplayed();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Please enter a password']")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeStaticText[@name=\"Please enter a password\"]"),
            @iOSXCUITBy(accessibility = "Please enter a password")
    })
    public WebElement ErrorMessageInValidPwd;

    public InvalidUNPWDPage checkErrorMessageInValidPwd()
    {
        ErrorMessageInValidPwd.isDisplayed();
        return this;
    }
}
