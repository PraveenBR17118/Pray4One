package com.Pray4One.TestCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClassAndroid
{

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static Logger logger;

    public AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
    {
        logger = Logger.getLogger("Pray4One");
        //DOMConfigurator.configure(“Log4j.xml”);
        PropertyConfigurator.configure("Log4j.properties");

        System.out.println(ANSI_RED + "Welcome To Appium Automation Framework" + ANSI_RESET);
        File AppLocation = new File("src");
        //File InstallAppLocation = new File(AppLocation, "pray4One-Android.apk");
        File InstallAppLocation = new File(AppLocation, "app-release (1).apk");
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a XL API 29");
        //capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capability.setCapability(MobileCapabilityType.APP, InstallAppLocation.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>
                (new URL("http://127.0.0.1:4723/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return driver;
    }

    public void captureScreen(AndroidDriver driver, String tname) throws Exception
    {
        TakesScreenshot ts = driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        logger.warn("Screen Shot is taken");
    }
}
