package com.Pray4One.PageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static org.testng.Assert.assertNotNull;

public class ScrollingPage {
    AndroidDriver<AndroidElement> driver12;

    public ScrollingPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    IOSDriver<IOSElement> driver13;

    public ScrollingPage(IOSDriver<IOSElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void scrollDown() {
        Dimension dim = driver12.manage().window().getSize();

        Double scrollHiegthStart = dim.getHeight() * 0.5;
        int scrollStart = scrollHiegthStart.intValue();

        Double scrollHiegthEnd = dim.getHeight() * 0.2;
        int scrollEnd = scrollHiegthEnd.intValue();

        new TouchAction((PerformsTouchActions) driver12)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

    public void scrollTillSubmit(AndroidDriver<AndroidElement> driver)
    {

        driver.findElementByAndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true)"
                        + ".instance(0)).scrollIntoView(new UiSelector().text(\"Submit\").instance(0))");

    }
//
//
//    @iOSXCUITFindAll({
//            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"Settings, tab, 4 of 4\"]"),
//            @iOSXCUITBy(accessibility = "Settings, tab, 4 of 4"),
//            @iOSXCUITBy(iOSNsPredicate = "50000000-0000-0000-6D05-000000000000"),
//            @iOSXCUITBy(iOSNsPredicate = "x == '329' AND y == '657'")
//    })
//    public WebElement GetSettingsPage;
//
//
//    @iOSXCUITFindAll({
//            //@iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Log Out\"]/XCUIElementTypeOther"),
//            //@iOSXCUITBy(accessibility = "Settings, tab, 4 of 4"),
//            @iOSXCUITBy(iOSNsPredicate = "A5000000-0000-0000-6D05-000000000000"),
//            @iOSXCUITBy(iOSNsPredicate = "x == '336' AND y == '529'")
//    })
//
//    public WebElement LogoutButton;
//
//    public void scrollTillLogout() {
//        GetSettingsPage.click();
//
//        while (LogoutButton.getSize().equals(LogoutButton)) {
//            scrollDown();
//
//        }
//
//        if (LogoutButton.getSize().equals(LogoutButton)) {
//            LogoutButton.click();
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//
//    public void scrollTillLogout1() {
//        GetSettingsPage.click();
//
//        IOSElement l1 = driver13.findElement(MobileBy.IosUIAutomation("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Log Out\")));"));
//        l1.click();
//
//    }
//
//
//    @AndroidFindAll
//            ({
//                    @AndroidBy(xpath = "//android.widget.TextView[@text='Submit a Prayer Request']"),
//                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[304,501][776,555]']"),
//            })
//    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
//    public WebElement Submit1aPrayerRequestButton;
//
//    @AndroidFindAll
//            ({
//                    @AndroidBy(xpath = "//android.widget.TextView[@text='Submit']"),
//                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[476,1758][606,1812]']"),
//            })
//    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
//    public WebElement Submit1Button;
//
//    public void scrollDown1() {
//
//    }
//
//    @AndroidFindAll
//            ({
//                    @AndroidBy(xpath = "//android.widget.TextView[@text='Pray4me']"),
//                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[270,1999][540,2037]']"),
//            })
//    @iOSXCUITFindAll({
//            //@iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Log Out\"]/XCUIElementTypeOther"),
//            //@iOSXCUITBy(accessibility = "Settings, tab, 4 of 4"),
//            @iOSXCUITBy(iOSNsPredicate = "A5000000-0000-0000-6D05-000000000000"),
//            @iOSXCUITBy(iOSNsPredicate = "x == '336' AND y == '529'")
//    })
//    public WebElement Pray4meRequestButton;
//
//    public WebElement getitemsPray4meRequestButton()
//    {
//        return Pray4meRequestButton;
//    }
//
//    @AndroidFindAll
//            ({
//                    @AndroidBy(xpath = "//android.widget.TextView[@text='Submit a Prayer Request']"),
//                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[304,501][776,555]']"),
//            })
//    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
//    public WebElement Submit2aPrayerRequestButton;
//
//    public List<WebElement> getSubmitButton()
//    {
//        return (List<WebElement>) Submit2aPrayerRequestButton;
//    }
//
//    public void scrolTillSubmit()
//    {
//        getitemsPray4meRequestButton().click();
//
//        while(getSubmitButton().size() ==0)
//        {
//            //Scroll
//        }
//
//    }


    public void testScroll()throws Exception
    {
       // driver12.findElementByAndroidUIAutomator("Pray4me").click();
       // AndroidElement list = (AndroidElement) driver12.findElement(By.className("android.widget.TextView"));
        MobileElement list = driver12
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Submit\"));"));
        assertNotNull(list.getLocation());
        list.click();
    }

    public void verticalSwipe()
    {
//        Dimension dim = driver12.manage().window().getSize();
//        int height = dim.getHeight();
//        int width = dim.getWidth();
//        int x = width/2;
//        int starty = (int)(height*0.80);
//        int endy = (int)(height*0.20);
//        //driver12.swipe(x, starty, x, endy, 500);

//        Dimension dim = driver12.manage().window().getSize();
//        int height = dim.getHeight();
//        int width = dim.getWidth();
//        int x = width/2;
//        int top_y = (int)(height*0.80);
//        int bottom_y = (int)(height*0.20);
//        System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
//        TouchAction ts = new TouchAction(driver12);
//        ts.press(x, top_y).moveTo(x, bottom_y).release().perform();
        

    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Submit a Prayer Request']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[304,501][776,555]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement SubmitAPrayerText;


     @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Submit']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[476,1758][606,1812]']"),
            })
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Scheduled Delivery to'")
    public WebElement SubmitButton;

//    Dimension dim = driver12.manage().window().getSize();
//    int height = dim.getHeight();
//    int width = dim.getWidth();
//    int x = width/2;
//    int top_y = (int)(height*0.80);
//    int bottom_y = (int)(height*0.20);
//    System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
//    TouchAction ts = new TouchAction(driver12);
//		ts.press(x, top_y).moveTo(x, bottom_y).release().perform();



//    public ScrollingPage tapSubmitButton() throws InterruptedException {
//        Thread.sleep(1000);
//        SubmitButton.click();
//        return this;
//    }




}
