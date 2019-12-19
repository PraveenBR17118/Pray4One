package com.Pray4One.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pray4MeRequest
{
    AndroidDriver<AndroidElement> driver;

    public Pray4MeRequest(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    IOSDriver<IOSElement> iosdriver1;

    public Pray4MeRequest(IOSDriver<IOSElement>iosdriver1)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1), this);
    }



    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@text='Prayer Request']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[84,630][996,904]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement PrayerRequest;

    public Pray4MeRequest sendPrayerRequest(String a) throws InterruptedException
    {
        Thread.sleep(1000);
        PrayerRequest.sendKeys(a);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Choose Category']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[84,1133][353,1174]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement ChooseCategoryButton;

    public Pray4MeRequest tapChooseCategoryButton() throws InterruptedException {
        Thread.sleep(1000);
        ChooseCategoryButton.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Addictive Behavior']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement ChooseCategoryAddictiveBehavior;

    public Pray4MeRequest selectChooseCategoryAddictiveBehavior() throws InterruptedException {
        Thread.sleep(1000);
        ChooseCategoryAddictiveBehavior.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Comfort/Grief']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement ChooseCategoryComfortGrief;

    public Pray4MeRequest selectChooseCategoryComfortGrief() throws InterruptedException {
        Thread.sleep(1000);
        ChooseCategoryComfortGrief.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Depression/Anxiety/Suicidal Ideations']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement ChooseCategoryDepressionAnxietySuicidalIdeations;

    public Pray4MeRequest selectChooseCategoryDepressionAnxietySuicidalIdeations() throws InterruptedException {
        Thread.sleep(1000);
        ChooseCategoryDepressionAnxietySuicidalIdeations.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Family Issues']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement ChooseCategoryFamilyIssues;

    public Pray4MeRequest selectChooseCategoryFamilyIssues() throws InterruptedException {
        Thread.sleep(1000);
        ChooseCategoryFamilyIssues.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@text='First Name']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[99,1226][1079,1326]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement FirstNameField;

    public Pray4MeRequest typeFirstNameField(String f) throws InterruptedException {
        Thread.sleep(1000);
        FirstNameField.sendKeys(f);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@text='Last Name']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[99,1354][1079,1454]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement LastNameField;

    public Pray4MeRequest typeLastNameField(String l) throws InterruptedException {
        Thread.sleep(1000);
        LastNameField.sendKeys(l);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@text='Phone']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[99,1481][1079,1581]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement PhoneNumberField;

    public Pray4MeRequest typePhoneNumberField(String p) throws InterruptedException {
        Thread.sleep(1000);
        PhoneNumberField.sendKeys(p);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@text='Email']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[99,1609][1079,1709]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement EmailField;

    public Pray4MeRequest typeEmailField(String E) throws InterruptedException {
        Thread.sleep(1000);
        EmailField.sendKeys(E);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.view.ViewGroup)[29]"),
                    @AndroidBy(xpath = "//*[@class='android.view.ViewGroup' and @bounds='[75,1736][1006,1834]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement CheckSubmitButton;

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Submit']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[476,1758][606,1812]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement SubmitButton;

    public Pray4MeRequest tapSubmitButton() throws InterruptedException {
        Thread.sleep(1000);
        SubmitButton.click();
        return this;
    }



}
