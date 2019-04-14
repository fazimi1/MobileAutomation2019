package ControlsPage;

import common.MobileAPI;
import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static common.MobileAPI.ad;

public class Controls extends MobileAPI {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Controls\"]")
    public static WebElement control;
    public void showSwitch(){
        control.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UISwitch\"]")).getText();
        String Expected = "UISwitch";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSlider(){
        control.click();
        String Actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"UISlider\"])[1]")).getText();
        String Expected = "UISlider";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showPageControl(){
        control.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIPageControl\"]")).getText();
        String Expected = "UIPageControl";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
