package com.Pray4One.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    AndroidDriver<AndroidElement> driver;

    public HomePage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    IOSDriver<IOSElement> iosdriver1;

    public HomePage(IOSDriver<IOSElement> iosdriver1)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1) ,this);
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView.[@text='Pray for Others']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[327,472][737,553]']"),
                    @AndroidBy(xpath = "(//android.widget.TextView)[0]")
                    //@AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeButton[@name=\"Settings, tab, 4 of 4\"]"),
            @iOSXCUITBy(accessibility = "Settings, tab, 4 of 4")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    public WebElement PrayForOtherTitle;

    public HomePage PrayForOtherTitleText()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrayForOtherTitle.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='I prayed for you!']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[368,1447][625,1494]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"I prayed for you!\"])[2]'")
    public WebElement IPrayedForzYouGetText;

    public HomePage getIPrayedForzYouGetText()
    {
        IPrayedForzYouGetText.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='I prayed for you!']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[368,1447][625,1494]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"I prayed for you!\"])[2]'")
    public WebElement IPrayedForzYou;

    public HomePage tapIPrayedForzYouCheckBox()
    {
        IPrayedForzYou.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Refer to Pastor']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[282,1582][519,1629]']"),
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Refer to Pastor\"]"),
            @iOSXCUITBy(accessibility = "Refer to Pastor")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    public WebElement ReferToPosterButton;

    public HomePage tapReferToPosterButton() throws InterruptedException {
        Thread.sleep(1000);
        ReferToPosterButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Skip ']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[620,1583][704,1627]']"),
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Skip \"]"),
            @iOSXCUITBy(accessibility = "Skip")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    public WebElement SkipButton;

    public HomePage tapSkipButton() throws InterruptedException {
        Thread.sleep(1000);
        SkipButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@class='android.widget.ImageView' and @bounds='[896,488][946,538]']"),
            @AndroidBy(xpath = "(//android.widget.TextView)[2]"),
            //@AndroidBy(xpath = "(//android.view.ViewGroup)[9]")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Pray for Others\"]/XCUIElementTypeOther")
    public WebElement FilterButton;

    public HomePage tapFilterButton() throws InterruptedException {
        Thread.sleep(1000);
        FilterButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[10]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[151,609][231,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 ALL\"])[2]")
    public WebElement AllButtonSize;

    public HomePage getAllButtonSize() throws InterruptedException {
        Thread.sleep(1000);
        AllButtonSize.getSize();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[10]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[151,609][231,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 ALL\"])[2]")
    public WebElement AllButtonText;

    public HomePage getAllButtonText() throws InterruptedException {
        Thread.sleep(1000);
        AllButtonText.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='ALL']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[161,656][222,703]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 ALL\"])[2]")
    public WebElement AllButton;

    public HomePage tapAllButton() throws InterruptedException {
        Thread.sleep(1000);
        AllButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[12]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[385,609][465,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Air1\"])[2]")
    public WebElement AirButtonCount;

    public HomePage getAirButtonCount() throws InterruptedException {
        Thread.sleep(1000);
        AirButtonCount.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Air1']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[624,656][688,703]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Air1\"])[2]")
    public WebElement AirButton;

    public HomePage tapAirButton() throws InterruptedException {
        Thread.sleep(1000);
        AirButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[14]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[626,609][686,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Air1\"])[2]")
    public WebElement Pray4OneButtonCount;

    public HomePage getPray4OneButtonCount() throws InterruptedException {
        Thread.sleep(1000);
        Pray4OneButtonCount.getText();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Pray4One']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[814,656][965,703]']"),
    })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Pray4One\"])[2]")
    public WebElement Pray4OneButton;

    public HomePage tapPray4OneButton() throws InterruptedException {
        Thread.sleep(1000);
        Pray4OneButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='K-LOVE']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[367,656][482,703]']"),
    })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 K-LOVE\"])[2]")
    public WebElement KLoveButton;

    public HomePage tapKLoveButton() throws InterruptedException {
        Thread.sleep(1000);
        KLoveButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.TextView)[3]"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[958,822][980,874]']")
    })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 K-LOVE\"])[2]")
    public WebElement PrayingHands;

    public HomePage getPrayingHandSize() throws InterruptedException {
        Thread.sleep(1000);
        PrayingHands.getSize();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Pray4others']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[0,1999][270,2037]']"),
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Pray4others, tab, 1 of 4\"]")
    public WebElement ForOtherButton;

    public HomePage tapForOtherButton() throws InterruptedException {
        Thread.sleep(1000);
        ForOtherButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Pray4me']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[270,1999][540,2037]']"),
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Pray4me, tab, 2 of 4\"]")
    public WebElement ForMeButton;

    public HomePage tapForMeButton() throws InterruptedException {
        Thread.sleep(1000);
        ForMeButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='My Impact']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[270,1999][540,2037]']")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My Impact, tab, 3 of 4\"]")
    public WebElement MyImpactButton;

    public HomePage tapMyImpactButton() throws InterruptedException {
        Thread.sleep(1000);
        MyImpactButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView.[@text='Settings']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[810,1999][1080,2037]']"),
                    //@AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeButton[@name=\"Settings, tab, 4 of 4\"]"),
            @iOSXCUITBy(accessibility = "Settings, tab, 4 of 4")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    public WebElement SettingsButton;

    public HomePage tapSettingsButton()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SettingsButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Prayers I've prayed for today']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[173,1849][677,1903]']")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My Impact, tab, 3 of 4\"]")
    public WebElement PrayersIHavePrayedToday;

    public HomePage tapPrayersIHavePrayedToday() throws InterruptedException {
        Thread.sleep(1000);
        PrayersIHavePrayedToday.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Prayers I've prayed for today']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[173,1849][677,1903]']")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My Impact, tab, 3 of 4\"]")
    public WebElement PrayersIHavePrayedTodaySize;

    public HomePage getPrayersIHavePrayedTodaySize() throws InterruptedException {
        Thread.sleep(1000);
        PrayersIHavePrayedTodaySize.getSize();
        return this;
    }





    //@AndroidFindBy(xpath = "//android.widget.ImageView[4]")
    //@AndroidFindBy(xpath = "//android.view.ImageView[1]/android.view.ImageView[3]")
    //findElement(By.xpath("//XCUIElementTypeApplication[1]..../XCUIElementTypeImage[1]"));
    //@AndroidFindBy(xpath = "//android.view.ViewGroup..../android.widget.ImageView")
    //@AndroidFindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[@text = 'Help:']")
    //@AndroidFindBy(xpath = "//android.widget.ImageView//android.widget.TextView[@text = 'Help:']")
    //@AndroidFindBy(xpath = "//android.widget.ImageView/..../android.widget.TextView[@text = 'Help:']")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Help:']") //itsworking
    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[9]") Selecting the filter instead of "how do i pray for this"


}
