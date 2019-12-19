package com.Pray4One.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FilteringPage
{
    AndroidDriver<AndroidElement> driver;
    public FilteringPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    IOSDriver<IOSElement> iosdriver1;
    public FilteringPage(IOSDriver<IOSElement> iosdriver1)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1), this);
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Filter']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[476,390][605,464]']"),
            //@AndroidBy(xpath = "(//android.view.ViewGroup)[9]")
    })
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"Prayer Groups\"]"),
            @iOSXCUITBy(id = "4D000000-0000-0000-AA05-000000000000"), //BCOM
            // @iOSXCUITBy(iOSNsPredicate = "value == 'Special Offer' AND name == 'promotionProductBadge_label'") //MCOM PWP added to the bag
            @iOSXCUITBy(iOSNsPredicate = "x == '33' AND y == '213'")
    })
    public WebElement Filter;

    public FilteringPage isFilterDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Filter.isDisplayed();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Filter']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[476,390][605,464]']"),
            //@AndroidBy(xpath = "(//android.view.ViewGroup)[9]")
    })
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"Prayer Groups\"]"),
            @iOSXCUITBy(id = "4D000000-0000-0000-AA05-000000000000"), //BCOM
           // @iOSXCUITBy(iOSNsPredicate = "value == 'Special Offer' AND name == 'promotionProductBadge_label'") //MCOM PWP added to the bag
            @iOSXCUITBy(iOSNsPredicate = "x == '33' AND y == '213'")
    })

    public WebElement FilterText;

    public FilteringPage getFilterText() throws InterruptedException {
        Thread.sleep(1000);
        FilterText.getText();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[225,1686][770,1733]']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Praise Report']"),
            //@AndroidBy(xpath = "(//android.view.ViewGroup)[9]")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Pray for Others\"]/XCUIElementTypeOther")
    public WebElement PraiseReport;

    public FilteringPage textPraiseReport() throws InterruptedException
    {
        Thread.sleep(1000);
        PraiseReport.click();
        return this;
    }


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Filter Prayers']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[399,1883][643,1935]']")
            //@AndroidBy(xpath = "(//android.view.ViewGroup)[9]")
    })
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"Prayer Groups\"]/XCUIElementTypeOther]"),
            @iOSXCUITBy(id = "54000000-0000-0000-AA05-000000000000"), //BCOM
            // @iOSXCUITBy(iOSNsPredicate = "value == 'Special Offer' AND name == 'promotionProductBadge_label'") //MCOM PWP added to the bag
            @iOSXCUITBy(iOSNsPredicate = "x == '33' AND y == '215'")
    })
    public WebElement FiltersPlayersCheckBox;

    public FilteringPage tapFiltersPlayersCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        FiltersPlayersCheckBox.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Filter Prayers']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[399,1883][643,1935]']")
            //@AndroidBy(xpath = "(//android.view.ViewGroup)[9]")
    })
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"Filter Prayers\"])[2]"),
            @iOSXCUITBy(id = "22000000-0000-0000-6D0D-000000000000"), //BCOM
            @iOSXCUITBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name == 'Filter Prayers'"),
            //@iOSXCUITBy(iOSNsPredicate = "x == '33' AND y == '215'")
    })
    public WebElement FiltersPlayers;

    public FilteringPage tapFiltersPlayers() throws InterruptedException {
        Thread.sleep(1000);
        FiltersPlayers.click();
        return this;
    }
}

