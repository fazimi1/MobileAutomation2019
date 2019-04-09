package home;

import common.MobileAPI;
import home.mainpage;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import static common.MobileAPI.ad;

public class maintest extends mainpage {
    @BeforeMethod
    public void initialize() {
        ObjOfApp = PageFactory.initElements(ad, mainpage.class);
    }

    mainpage ObjOfApp = null;

     @Test
    public void burgerTest() {
        ObjOfApp.getMenu();
    }

     @Test
    public void androidTabTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Android();
    }

     @Test
    public void appleTabTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Apple();
    }

    @Test
    public void noveltyTabTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Novelty();
    }

     @Test
    public void windowsTabTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Windows();
    }

     @Test
    public void allNewsTabTest() {
        ObjOfApp.getMenu();
        ObjOfApp.AllNews();
    }

    @Test
    public void searchBarTest() {
        ObjOfApp.searchForSamsung();
    }

     @Test
    public void searchBarTest2() {
        ObjOfApp.searchForApple();
    }

    @Test
    public void searchBarTest3() {
        ObjOfApp.searchForNokia();
    }

     @Test
    public void searchBarTest4() {
        ObjOfApp.searchForSony();
    }

    @Test
    public void searchBarTest5() {
        ObjOfApp.searchForHuawei();
    }

     @Test
    public void searchBarTest6() {
        ObjOfApp.searchForOnePlus();
    }

     @Test
    public void firstLinkTest() {
        ObjOfApp.clickFirstLink();
    }

     @Test
    public void firstLinkAndroidTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Android();
        ObjOfApp.clickFirstLinkAndroid();
    }

     @Test
    public void secondLinkAndroidTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Android();
        ObjOfApp.clickSecondLinkAndroid();
    }

     @Test
    public void secondLinkAppleTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Apple();
        ObjOfApp.clickSecondLinkApple();
    }

     @Test
    public void secondLinkNoveltyTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Novelty();
        ObjOfApp.clickSecondLinkNovelty();
    }

     @Test
    public void firstLinkWindowsTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Windows();
        ObjOfApp.clickFirstLinkWindows();
    }

     @Test
    public void secondLinkWindowsTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Windows();
        ObjOfApp.clickSecondLinkWindows();
    }

     @Test
    public void thirdLinkAppleTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Apple();
        ObjOfApp.clickThirdLinkApple();
    }

     @Test
    public void thirdLinkAndroidTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Android();
        ObjOfApp.clickThirdLinkAndroid();
    }

    @Test
    public void firstLinkAndroidShareButtonTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Android();
        ObjOfApp.clickFirstLinkAndroid();
        ObjOfApp.clickFirstLinkAndroidShareButton();
    }

    @Test
    public void secondLinkAppleShareButtonTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Apple();
        ObjOfApp.clickSecondLinkApple();
        ObjOfApp.clickSecondLinkAppleShareButton();
    }
    @Test
   public void firstLinkWindowsShareButtonTest(){
        ObjOfApp.getMenu();
        ObjOfApp.Windows();
        ObjOfApp.clickFirstLinkWindows();
        ObjOfApp.clickFirstLinkWindowsShareButton();
    }

    @Test
    public void SecondLinkNoveltyShareButtonTest(){
        ObjOfApp.getMenu();
        ObjOfApp.Novelty();
        ObjOfApp.clickSecondLinkNovelty();
        ObjOfApp.clickSecondLinkNoveltyShareButton();
    }
}


