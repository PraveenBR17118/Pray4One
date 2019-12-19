package com.Pray4One.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class WorkBookPage
{
    public WorkBookPage() throws IOException
    {
    }

    AndroidDriver<AndroidElement> driver;

    public WorkBookPage(AndroidDriver<AndroidElement> driver) throws IOException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    IOSDriver<IOSElement> driver1;

    public WorkBookPage(IOSDriver<IOSElement> driver) throws IOException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    Workbook wb =new XSSFWorkbook(new FileInputStream("/Users/praveen/Documents/Project/Data/UNandPWD.xlsx"));
    public String s0 = wb.getSheet("ValidLoginData").getRow(0).getCell(0).getStringCellValue();
    public String s1 = wb.getSheet("ValidLoginData").getRow(0).getCell(1).getStringCellValue();
    public String s2 = wb.getSheet("ValidLoginData").getRow(1).getCell(0).getStringCellValue();
    public String s3 = wb.getSheet("ValidLoginData").getRow(1).getCell(1).getStringCellValue();
}
