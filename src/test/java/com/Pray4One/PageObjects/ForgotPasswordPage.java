package com.Pray4One.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage
{
    AndroidDriver<AndroidElement> driver;

    public ForgotPasswordPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    IOSDriver<IOSElement> iosdriver1;

    public ForgotPasswordPage(IOSDriver<IOSElement> iosdriver1)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1) ,this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@text = 'Forgot your password?']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement ForgotYourPasswordHeader;

    public ForgotPasswordPage forgotYourPasswordHeader()
    {
        ForgotYourPasswordHeader.isDisplayed();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.view.View[@resource-id,'UserName']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[80,756][1000,893]']")
            })

    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement EMailId;

    public ForgotPasswordPage forgotenEmailId(String s)
    {
        EMailId.sendKeys(s);
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'Submit']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement Submit;

    public ForgotPasswordPage clickOnSubmitButton()
    {
        Submit.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.view.View[@text = 'Back to Login']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement BackToLogin;

    public ForgotPasswordPage clickOnBackToLoginButton()
    {
        BackToLogin.click();
        return this;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageView' and @bounds='[987,142][1024,179]']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement CancelButton;

    public ForgotPasswordPage clickOnCancelButton()
    {
        CancelButton.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.view.View[@text = 'Privacy Policy']")
    //@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement PrivacyButton;

    public ForgotPasswordPage clickOnPrivacyButton()
    {
        PrivacyButton.click();
        return this;
    }

}
