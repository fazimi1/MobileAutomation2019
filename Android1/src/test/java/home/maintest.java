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

    public void testArticles() {
        mainpage mainPage = PageFactory.initElements(ad, mainpage.class);
        mainPage.goToArticles();

    }


    public void burgerTest() {
        ObjOfApp.getMenu();

    }


    public void androidTabTest() {
        ObjOfApp.getMenu();
        ObjOfApp.Android();
    }
    @Test
    public void appleTabTest(){
        ObjOfApp.getMenu();
        ObjOfApp.Apple();
}

    public void noveltyTabTest(){
        ObjOfApp.getMenu();
        ObjOfApp.Novelty();
    }

    public void windowsTabTest(){
        ObjOfApp.getMenu();
        ObjOfApp.Windows();
    }
}

