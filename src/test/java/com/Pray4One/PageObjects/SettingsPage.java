package com.Pray4One.PageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage
{
    AndroidDriver<AndroidElement> driver;

    public SettingsPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    IOSDriver<IOSElement> driver1;

    public SettingsPage(IOSDriver<IOSElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }



    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeImage[@name=\"assets/assets/login_logo.png\"]"),
            @iOSXCUITBy(accessibility = "assets/assets/login_logo.png")
    })
    public WebElement Pray4OneHeaderInSettingsPage;

    public SettingsPage SettingsPagePray4OneHeader()
    {
        Pray4OneHeaderInSettingsPage.isDisplayed();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeStaticText[@name=\"Settings\"]")
    })
    public WebElement SettingsPageHeader;

    public SettingsPage SettingsPageHeader()
    {
        SettingsPageHeader.isDisplayed();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "(//XCUIElementTypeOther[@name=\"Notify me of new requests\"])[3]/XCUIElementTypeOther"),
    })
    public WebElement NotifyMeOfNewRequests;

    public SettingsPage NotifyMeOfNewRequestsCheckBox()
    {
        NotifyMeOfNewRequests.click();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "(//XCUIElementTypeOther[@name=\"Notify me of new prayer groups\"])[3]/XCUIElementTypeOther"),
    })
    public WebElement NotifyMeOfNewPrayersGroups;

    public SettingsPage NotifyMeOfNewPrayersGroupsCheckBox()
    {
        NotifyMeOfNewPrayersGroups.click();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "(//XCUIElementTypeOther[@name=\"Notify me when my request has been prayed\"])[3]/XCUIElementTypeOther"),
    })
    public WebElement NotifyMeWhenMyRequestHasBeenPrayed;

    public SettingsPage NotifyMeWhenMyRequestHasBeenPrayedCheckBox()
    {
        NotifyMeWhenMyRequestHasBeenPrayed.click();
        return this;
    }

    /*=======================================================*/
    //===================Languages============================

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Hindi\"]/XCUIElementTypeOther")
    })
    public WebElement HindiLanguage;

    public SettingsPage HindiLanguageCheckBox()
    {
        HindiLanguage.click();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"English\"]/XCUIElementTypeOther")
    })
    public WebElement EnglishLanguage;

    public SettingsPage EnglishLanguageCheckBox()
    {
        EnglishLanguage.click();
        return this;
    }


    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Arabic\"]/XCUIElementTypeOther")
    })
    public WebElement ArabicLanguage;

    public SettingsPage ArabicLanguageCheckBox()
    {
        ArabicLanguage.click();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Arabic\"]/XCUIElementTypeOther")
    })
    public WebElement TamilLanguage;

    public SettingsPage TamilLanguageCheckBox()
    {
        TamilLanguage.click();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Spanish\"]/XCUIElementTypeOther\n")
    })
    public WebElement SpanishLanguage;

    public SettingsPage SpanishLanguageCheckBox()
    {
        SpanishLanguage.click();
        return this;
    }





//    @AndroidFindAll
//            ({
//                    @AndroidBy(xpath = "(//android.view.ViewGroup)[45]/android.widget.ImageView"),
//                    @AndroidBy(xpath = "//*[@class='android.widget.ImageView' and @bounds='[901,1747][971,1817]']")
//            })
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Log Out\"]/XCUIElementTypeOther")
//    public WebElement scrollDownTillLogout;


    public SettingsPage scrollDownTillLogout()
    {
//        Actions act = new Actions(driver);
//        act.contextClick(LogoutButton1).perform();
        IOSElement i1 = (IOSElement) driver1.findElement(MobileBy.IosUIAutomation("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().description(\"Log Out\"));"));
        System.out.println(i1.getLocation());
        i1.click();
        return this;
    }

    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]/android.widget.ImageView") //its Working*****
    //@AndroidFindBy(xpath = "((//android.view.ViewGroup)[44])[2]/android.view.ViewGroup")
    //@AndroidFindBy(xpath = "(//android.widget.ImageView)[14]") //its Working******
    //AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]") // Its Working*******
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']/../android.view.ViewGroup")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']/parent::*/following-sibling::android.view.ViewGroup") its working but selecting different element;
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']/parent::*/following-sibling::android.view.ViewGroup[1]") //its working but selecting different element;
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']/parent::*[2]")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='App Version  0.0.17(S)']/parent::*/following-sibling::")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']//android.view.ViewGroup")
    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[45]")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']//android.view.ViewGroup//android.widget.ImageView")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']//android.view.ViewGroup/android.widget.ImageView")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']/android.view.ViewGroup/android.widget.ImageView")
    //@AndroidFindBy(xpath = "//*[@class='android.widget.ImageView' and @bounds='[901,1747][971,1817]']")
    //@AndroidFindBy(xpath = "//*[@class='android.widget.ImageView' and @bounds='[901,1747][971,1817]']") //*****imp
    //("//*[@class='android.widget.FrameLayout' and @bounds='[418,564][780,885]']"))
    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.view.ViewGroup)[45]/android.widget.ImageView"),
                    @AndroidBy(xpath = "//*[@class='android.widget.ImageView' and @bounds='[901,1747][971,1817]']")
            })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Log Out\"]/XCUIElementTypeOther")
    public WebElement LogoutButton;
    public SettingsPage tapLogoutButton()
    {

        LogoutButton.click();
        return this;
    }



    //    @AndroidFindBy(xpath = "android.widget.TextView[@text='Tamil']/parent::*")
//    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
//    public WebElement HindiCheckBox;
//
//    public SettingsPage selectHindiCheckBox()
//    {
//        HindiCheckBox.click();
//        return this;
//    }
}
