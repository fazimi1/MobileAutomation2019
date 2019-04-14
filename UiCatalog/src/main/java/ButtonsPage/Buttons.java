package ButtonsPage;

import common.MobileAPI;
import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static common.MobileAPI.ad;

public class Buttons extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buttons\"]")
    public static WebElement buttons;
    public void showBackgroundImage(){
        buttons.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Background Image\"]")).getText();
        String Expected = "Background Image";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showButtonWithImage() {
        buttons.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Button with Image\"]")).getText();
        String Expected = "Button with Image";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showRoundedButton(){
        buttons.click();
        String Actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"UIButtonTypeRoundedRect\"])[1]")).getText();
        String Expected = "UIButtonTypeRoundedRect";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
