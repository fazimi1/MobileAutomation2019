package TransitionsPage;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Transitions extends MobileAPI {
    public void flipImage(){
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Flip Image\"]")).getText();
        String Expected = "Flip Image";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void curlImage() {
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Curl Image\"]")).getText();
        String Expected = "Curl Image";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
