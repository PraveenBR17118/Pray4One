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

public class PopUpPage
{
    AndroidDriver<AndroidElement> driver;

    public PopUpPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    IOSDriver<IOSElement>iosdriver1;

    public PopUpPage(IOSDriver<IOSElement>iosdriver1)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1) ,this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text ='OK']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "OK"),
            @iOSXCUITBy(xpath ="//XCUIElementTypeButton[@name=\"OK\"]"),
            @iOSXCUITBy(id ="48000000-0000-0000-6F05-000000000000"),
            @iOSXCUITBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name=='OK'")
    })
    public WebElement InvalidUnPWDOkButton;

    public PopUpPage tapInvalidUnPWDOkButton()
    {

        InvalidUnPWDOkButton.click();
        return this;
    }


    @AndroidFindBy(xpath = "//android.view.View[@text ='It's on its way!']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement EmailIdConfarmationPopUp;

    public PopUpPage headerEmailIdConfarmationPopUp()
    {
        EmailIdConfarmationPopUp.isDisplayed();
        return this;
    }
}
