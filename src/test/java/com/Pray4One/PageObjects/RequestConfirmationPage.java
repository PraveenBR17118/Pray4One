package com.Pray4One.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RequestConfirmationPage
{
    AndroidDriver<AndroidElement> driver;

    public RequestConfirmationPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    IOSDriver<IOSElement> iosdriver1;

    public RequestConfirmationPage(IOSDriver<IOSElement>iosdriver1)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1), this);
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='We'll be praying for you!']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[245,414][836,488]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement PrayingForYouText;

    public RequestConfirmationPage getPrayingForYouText() throws InterruptedException
    {
        Thread.sleep(1000);
        PrayingForYouText.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='We'll be praying for you!']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[245,414][836,488]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement PrayingForYouIsDisplayed;

    public RequestConfirmationPage prayingForYouTextIsDisplayed() throws InterruptedException
    {
        Thread.sleep(1000);
        PrayingForYouIsDisplayed.isDisplayed();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Pray for others']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[169,1886][420,1930]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement PrayForOtherButton;

    public RequestConfirmationPage clickPrayForOthersButton() throws InterruptedException
    {
        Thread.sleep(1000);
        PrayForOtherButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Pray for others']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[169,1886][420,1930]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement SubmitNewRequestButton;

    public RequestConfirmationPage clickSubmitNewRequestButton() throws InterruptedException
    {
        Thread.sleep(1000);
        SubmitNewRequestButton.click();
        return this;
    }
}
