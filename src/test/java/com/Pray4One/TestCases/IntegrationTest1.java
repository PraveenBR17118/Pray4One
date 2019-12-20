package com.Pray4One.TestCases;

import com.Pray4One.PageObjects.*;
import com.Pray4One.Utilities.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.*;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

@Listeners({AllureListener.class})
public class IntegrationTest1 extends BaseClassAndroid
{
    private AndroidDriver<AndroidElement> driver1 = capabilities();

    public IntegrationTest1() throws MalformedURLException
    {
        // Assert.assertEquals(h11,h12);
        // Reporter.log("test() method is Start",true);
    }

    public IntegrationTest1(AndroidDriver<AndroidElement> driver1) throws IOException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver1) ,this);
    }


    @Severity(value = SeverityLevel.BLOCKER)
    @Test(priority=1, description="Verify login")
    @Description("Verify login with Valid Credentials........")
    @Epic("EP001")
    @Feature("Feature1: Login")
    @Story("Story:Valid login")
    @Step("Verify login")
    void loginTest() throws Exception
    {

        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WorkBookPage w1 = new WorkBookPage(driver1);

        logger.info("Openning the app");

        LoginPage l1 = new LoginPage(driver1);

        l1
                .tapStartButton()
                .sendEmail(w1.s0)
                .sendPassword(w1.s1)
                .tapLogin();
        Thread.sleep(1000);
        logger.info("Entered login details");



    }


    @Severity(value = SeverityLevel.NORMAL)
    @Test(priority=2, description="Request a Prayer")
    @Description("Verify request a pryer for some one")
    @Epic("EP001")
    @Feature("Feature2: Prayer request")
    @Story("Story:Prayer request")
    @Step("Verify Prayer request")
    void requestaPrayer() throws Exception
    {
        logger.info("Login is completed");

        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WorkBookPage w1 = new WorkBookPage(driver1);

        HomePage o1 = new HomePage(driver1);
        o1
                .tapForMeButton();
        logger.info("Opened Pray for me page");

        ScrollingPage s1 = new ScrollingPage(driver1);
        s1
                .scrollTillSubmit(driver1);

        logger.info("Page scrolled down till submit");

        Pray4MeRequest p1 = new Pray4MeRequest(driver1);
//       boolean e1 = p1.CheckSubmitButton.isEnabled();
//        if(e1)
//        {
//            Thread.sleep(10000);
//            captureScreen(driver1,"Integration Test1");
//            logger.warn("Submit Button is enabled without providing necessary details");
//            Assert.assertTrue(false);
//        }
        p1
                .sendPrayerRequest
                        ("hi my name is pogo, please pray " +
                                "for all who are suffering from pain,problems" +
                                " etc let god give them happiness ")
                .tapChooseCategoryButton()
                .selectChooseCategoryComfortGrief()
                .typeFirstNameField("Pogo1")
                .typeLastNameField("R")
                .typePhoneNumberField("9080709090")
                .typeEmailField(w1.s0)
                .tapSubmitButton();
        logger.info("Entered all the Prayer request details");

        Thread.sleep(4000);

        if (isAlertPresent() == true)
        {
            Thread.sleep(3000);
            //captureScreen(driver1, "Integration Test1");
            driver1.switchTo().alert().accept();//close alert
            //driver1.switchTo().defaultContent();
            logger.fatal("Integration Test is failed due to request is not accepting");
            //throw new SkipException("Skiping this test");
            //logger.warn("Integration Test is failed due to request is not accepting");
            Assert.assertTrue(false);


        }
//        else
//        {
//            Assert.assertTrue(true);
//            logger.info("Login passed");
//            try
//            {
//                Thread.sleep(3000);
//            }
//            catch (Exception e)
//            {
//
//                e.printStackTrace();
//            }
//            driver1.switchTo().alert().accept();//close logout alert
//            driver1.switchTo().defaultContent();
//
//        }
        logger.info("Accepted the enterd details for request prayer");
        RequestConfirmationPage c12 = new RequestConfirmationPage(driver1);
        c12
                .prayingForYouTextIsDisplayed();
        System.out.println(c12.getPrayingForYouText());
        logger.info("Opened Confirmation page");
        RequestConfirmationPage s12 = c12.getPrayingForYouText();

        Thread.sleep(10000);

        if ("jhkjsagkjhgsak".equals(c12.getPrayingForYouText()))
        {
            Assert.assertTrue(true);
            logger.info("Integration Test1 is passed");
        }
        else
            {
            Thread.sleep(10000);
            //captureScreen(driver1, "Integration Test1");
            logger.warn("Integration Test is Failed");
            Assert.assertTrue(false);

            }
    }



    private boolean isAlertPresent() //user defined method created to check alert is presetn or not
    {
        try
        {

            logger.info("Checking for popup");
            driver1.switchTo().alert();
            return true;
        }
        catch(NoAlertPresentException e)
        {
            return false;
        }

    }
    @AfterSuite
    void tearDown()
    {
        driver1.quit();
    }
}
//String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//        String repName = tname + timeStamp+".png";