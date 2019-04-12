package home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class mainTest extends mainPage {
    @BeforeMethod
    public void initialize() {
        ObjOfApp = PageFactory.initElements(ad, mainPage.class);
    }

    mainPage ObjOfApp = null;

    @Test
    public void burgerTest() {
        TestLogger.log("Open Menu");
        ObjOfApp.getMenu();
    }

    @Test
    public void androidTabTest() {
        TestLogger.log("Open Menu");
        ObjOfApp.getMenu();
        TestLogger.log("Select Android Tab");
        ObjOfApp.Android();
    }

    @Test
    public void appleTabTest() {
        TestLogger.log("Open Menu");
        ObjOfApp.getMenu();
        TestLogger.log("Select Apple Tab");
        ObjOfApp.Apple();
    }

    @Test
    public void noveltyTabTest() {
        TestLogger.log("Open Menu");
        ObjOfApp.getMenu();
        TestLogger.log("Select Novelty Tab");
        ObjOfApp.Novelty();
    }

    @Test
    public void windowsTabTest() {
        TestLogger.log("Open Menu");
        ObjOfApp.getMenu();
        TestLogger.log("Select Windows Tab");
        ObjOfApp.Windows();
    }

    @Test
    public void allNewsTabTest() {
        TestLogger.log("Open Menu");
        ObjOfApp.getMenu();
        TestLogger.log("Select All News Tab");
        ObjOfApp.AllNews();
    }

    @Test
    public void searchBarTest() {
        TestLogger.log("Search for Samsung Test");
        ObjOfApp.searchForSamsung();
    }

    @Test
    public void searchBarTest2() {
        TestLogger.log("Search for Apple Test");
        ObjOfApp.searchForApple();
    }

    @Test
    public void searchBarTest3() {
        TestLogger.log("Search for Nokia Test");
        ObjOfApp.searchForNokia();
    }

    @Test
    public void searchBarTest4() {
        TestLogger.log("Search for Sony Test");
        ObjOfApp.searchForSony();
    }

    @Test
    public void searchBarTest5() {
        TestLogger.log("Search for Huawei Test");
        ObjOfApp.searchForHuawei();
    }

    @Test
    public void searchBarTest6() {
        TestLogger.log("Search for OnePlus Test");
        ObjOfApp.searchForOnePlus();
    }

    @Test
    public void searchBarTest7(){
        TestLogger.log("Search for Windows Test");
        ObjOfApp.searchForWindows();
    }

    @Test
    public void firstLinkTest() {
        TestLogger.log("First Link Test");
        ObjOfApp.clickFirstLink();
    }

    @Test
    public void firstLinkAndroidTest() {
        TestLogger.log("Open Menu");
        ObjOfApp.getMenu();
        TestLogger.log("Select Android Tab");
        ObjOfApp.Android();
        TestLogger.log("Select First Link in Android Tab");
        ObjOfApp.clickFirstLinkAndroid();
    }

    @Test
    public void secondLinkAndroidTest() {
        TestLogger.log("Open menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Android Tab Test");
        ObjOfApp.Android();
        TestLogger.log("Select Second Link Test");
        ObjOfApp.clickSecondLinkAndroid();
    }

    @Test
    public void secondLinkAppleTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Apple Tab Test");
        ObjOfApp.Apple();
        TestLogger.log("Select Second link Test");
        ObjOfApp.clickSecondLinkApple();
    }

    @Test
    public void secondLinkNoveltyTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Novelty Tab Test");
        ObjOfApp.Novelty();
        TestLogger.log("Select Second Link Test");
        ObjOfApp.clickSecondLinkNovelty();
    }

    @Test
    public void firstLinkWindowsTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Windows Tab Test");
        ObjOfApp.Windows();
        TestLogger.log("Select First Link Test");
        ObjOfApp.clickFirstLinkWindows();
    }

    @Test
    public void secondLinkWindowsTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Windows Tab Test");
        ObjOfApp.Windows();
        TestLogger.log("Select Second Link Test");
        ObjOfApp.clickSecondLinkWindows();
    }

    @Test
    public void thirdLinkAppleTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Apple Tab Test");
        ObjOfApp.Apple();
        TestLogger.log("Select Third Link Test");
        ObjOfApp.clickThirdLinkApple();
    }

    @Test
    public void thirdLinkAndroidTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Android Tab Test");
        ObjOfApp.Android();
        TestLogger.log("Select Third Link Test");
        ObjOfApp.clickThirdLinkAndroid();
    }

     @Test
    public void firstLinkAndroidShareButtonTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Android Tab Test");
        ObjOfApp.Android();
        TestLogger.log("Select First Link Test");
        ObjOfApp.clickFirstLinkAndroid();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickFirstLinkAndroidShareButton();
    }

     @Test
    public void secondLinkAppleShareButtonTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Apple Tab Test");
        ObjOfApp.Apple();
        TestLogger.log("Select Second Link Test");
        ObjOfApp.clickSecondLinkApple();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickSecondLinkAppleShareButton();
    }

     @Test
    public void firstLinkWindowsShareButtonTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Windows Tab Test");
        ObjOfApp.Windows();
        TestLogger.log("Select First Link Test");
        ObjOfApp.clickFirstLinkWindows();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickFirstLinkWindowsShareButton();
    }

    @Test
    public void SecondLinkNoveltyShareButtonTest() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Novelty Tab Test");
        ObjOfApp.Novelty();
        TestLogger.log("Select Second Link Test");
        ObjOfApp.clickSecondLinkNovelty();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickSecondLinkNoveltyShareButton();
    }

    @Test
    public void shareArticleUrlAndroidFirstLink() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Android Tab Test");
        ObjOfApp.Android();
        TestLogger.log("Select First Link Test");
        ObjOfApp.clickFirstLinkAndroid();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickFirstLinkAndroidShareButton();
        TestLogger.log("Select Share Article URl Test");
        ObjOfApp.clickShareArticleURL();

    }

     @Test
    public void shareArticleUrlWindowsFirstLink() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Windows Tab Test");
        ObjOfApp.Windows();
        TestLogger.log("Select First Link Test");
        ObjOfApp.clickFirstLinkWindows();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickFirstLinkWindowsShareButton();
        TestLogger.log("Select Share Article URl Test");
        ObjOfApp.clickShareArticleURL();
    }

    @Test
    public void shareArticleUrlAppleSecondLink() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Apple Tab Test");
        ObjOfApp.Apple();
        TestLogger.log("Select Second Link Test");
        ObjOfApp.clickSecondLinkApple();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickSecondLinkAppleShareButton();
        TestLogger.log("Select Share Article URl Test");
        ObjOfApp.clickShareArticleURL();
    }

    @Test
    public void shareArticleUrlNoveltySecondLink() {
        TestLogger.log("Open Menu Test");
        ObjOfApp.getMenu();
        TestLogger.log("Select Novelty Tab Test");
        ObjOfApp.Novelty();
        TestLogger.log("Select Second Link Test");
        ObjOfApp.clickSecondLinkNovelty();
        TestLogger.log("Select Share Button Test");
        ObjOfApp.clickSecondLinkNoveltyShareButton();
        TestLogger.log("Select Share Article URl Test");
        ObjOfApp.clickShareArticleURL();
    }
}
