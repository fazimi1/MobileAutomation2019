package home;

import common.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class mainpage extends MobileAPI {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")
    public WebElement AndroidTab;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    public WebElement Burger;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView")
    public WebElement AppleTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")
    public WebElement NoveltyTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView")
    public WebElement WindowsTab;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")
    public WebElement AllNewsTab;
    @FindBy(id = "com.android_1.clientapp:id/action_search")
    public WebElement Search;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[3]")
    public WebElement FirstLink;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[3]")
    public WebElement FirstLinkAndroid;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[3]")
    public WebElement SecondLinkApple;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[3]")
    public WebElement SecondLinkNovelty;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[3]")
    public WebElement FirstLinkWindows;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[3]")
    public WebElement SecondLinkAndroid;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[3]")
    public WebElement SecondLinkWindows;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView[3]")
    public WebElement ThirdLinkApple;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView[3]")
    public WebElement ThirdLinkAndroid;
    @FindBy(id = "com.android_1.clientapp:id/action_share")
    public WebElement ShareButton;

    public void getMenu() {
        Burger.click();
    }

    public void Android() {
        AndroidTab.click();
    }

    public void Apple() {
        AppleTab.click();
    }

    public void Novelty() {
        NoveltyTab.click();
    }

    public void Windows() {
        WindowsTab.click();
    }

    public void AllNews(){
        AllNewsTab.click();
    }

    public void searchForSamsung() {
        Search.sendKeys("Samsung", Keys.ENTER);

    }
    public void searchForApple(){
        Search.sendKeys("iphone",Keys.ENTER);
    }

    public void searchForNokia(){
        Search.sendKeys("Nokia",Keys.ENTER);
    }

    public void searchForSony(){
        Search.sendKeys("Sony",Keys.ENTER);
    }

    public void searchForHuawei(){
        Search.sendKeys("Huawei",Keys.ENTER);
    }
    public void searchForOnePlus(){
        Search.sendKeys("OnePlus",Keys.ENTER);
    }

    public void clickFirstLink(){
        FirstLink.click();
    }

    public void clickFirstLinkAndroid(){
        FirstLinkAndroid.click();
    }

    public void clickSecondLinkAndroid(){
        SecondLinkAndroid.click();
    }

    public void clickThirdLinkAndroid(){
        ThirdLinkAndroid.click();
    }

    public void clickSecondLinkApple(){
        SecondLinkApple.click();
    }

    public void clickThirdLinkApple(){
        ThirdLinkApple.click();
    }

    public void clickSecondLinkNovelty(){
        SecondLinkNovelty.click();
    }

    public void clickFirstLinkWindows(){
        FirstLinkWindows.click();
    }

    public void clickSecondLinkWindows(){
        SecondLinkWindows.click();
    }

    public void clickFirstLinkAndroidShareButton(){
        ShareButton.click();
    }

    public void clickSecondLinkAppleShareButton() {
        ShareButton.click();
    }

    public void clickFirstLinkWindowsShareButton(){
            ShareButton.click();
    }

    public void clickSecondLinkNoveltyShareButton(){
        ShareButton.click();
        }

    }



