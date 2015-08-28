package com.gvtester.webdriver;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

/**
 * Created by giri on 8/15/2015.
 */
public class FirstTest {

    @Test
    public void startWebDriver() {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://seleniumsimplified.com");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("c:\\screenshot.png"));
        WebElement query = driver.findElement(By.partialLinkText("Selenium"));
        String mystr = query.getText();
        System.out.println(mystr);
        Assert.assertTrue("start of title should be different", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}
