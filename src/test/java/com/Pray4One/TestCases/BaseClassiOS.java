package com.Pray4One.TestCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClassiOS
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    //public static Logger logger;
    public IOSDriver capabilities() throws MalformedURLException {
        System.out.println(ANSI_RED + "Welcome To Pray4One App Automation" + ANSI_RESET);
        File iOSAppLocation = new File("src");
        File InstalliOSAppLocation = new File(iOSAppLocation, "Pray4One 2.zip");
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");
        capability.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        capability.setCapability(MobileCapabilityType.APP, InstalliOSAppLocation.getAbsolutePath());
        IOSDriver driver = new IOSDriver<IOSElement>
                ( new URL("http://127.0.0.1:4723/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void captureScreen(AndroidDriver driver, String tname) throws Exception {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }


}
