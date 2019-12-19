package com.Pray4One.TestCases;


import com.Pray4One.PageObjects.*;
import com.beust.jcommander.Parameter;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class IntegrationTest2 extends BaseClassiOS
{
    private IOSDriver<IOSElement>  driver1 = capabilities();

    public IntegrationTest2() throws MalformedURLException
    {
        // Assert.assertEquals(h11,h12);
        // Reporter.log("test() method is Start",true);
    }

    public IntegrationTest2(IOSDriver<IOSElement> driver1) throws IOException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver1) ,this);
    }

    @Test(priority = 1)
    @Parameter(description = "Select on Filter")
    void selectOnFilter() throws Exception
    {
        driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        WorkBookPage wb1 = new WorkBookPage(driver1);

        WebDriverWait wait=new WebDriverWait(driver1,10);


        LoginPage l1 = new LoginPage(driver1);

        l1
                .tapStartButton()
                .sendEmail(wb1.s0)
                .sendPassword(wb1.s1)
                .tapLogin()
                .tapLogin();

        HomePage o1 = new HomePage(driver1);
        o1
                .tapFilterButton();

        FilteringPage f1 = new FilteringPage(driver1);

        Reporter.log("Header of filtering page" + f1.getFilterText(),true);
        f1
                .isFilterDisplayed()
                .tapFiltersPlayers();

    }
}
