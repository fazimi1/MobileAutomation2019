package ImagesPage;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static common.MobileAPI.ad;

public class Images extends MobileAPI {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Images\"]")
    public static WebElement images;
    public void show(){
        images.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Duration\"]")).getText();
        String Expected = "Duration";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
