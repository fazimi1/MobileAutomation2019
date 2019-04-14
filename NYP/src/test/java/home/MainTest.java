package home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static common.MobileAPI.ad;

public class MainTest extends MainPage {

    @BeforeMethod
    public void initialize() {
        ObjOfApp = PageFactory.initElements(ad, MainPage.class);
    }

    MainPage ObjOfApp = null;

   @Test
    public void continueButtonTest(){
       ObjOfApp.clickContinue1();
   }
    @Test
    public void continue2ButtonTest(){
       ObjOfApp.clickContinue1();
       ObjOfApp.clickContinue2();
}
    @Test
    public void burgerButtonTest(){
       ObjOfApp.clickContinue1();
       ObjOfApp.clickContinue2();
       ObjOfApp.clickBurger();
    }
    @Test
    public void newsTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickNewsTab();
    }
    @Test
    public void metroTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickMetroTab();
    }
    @Test
    public void pageSixTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickPageSixTab();
    }
    @Test
    public void sportsTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickSportsTab();
    }
    @Test
    public void businessTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickBusinessTab();
    }
    @Test
    public void opinionTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickOpinionTab();
    }
    @Test
    public void entertainmentTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickEntertainmentTab();
    }
    @Test
    public void fashionTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickFashionTab();
    }
    @Test
    public void livingTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickLivingTab();
    }

    @Test
    public void mediaTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickMediaTab();
    }
    @Test
    public void techTabTest(){
        ObjOfApp.clickContinue1();
        ObjOfApp.clickContinue2();
        ObjOfApp.clickBurger();
        ObjOfApp.clickTechTab();
    }
    @Test
    public void realEstateTabTest(){
        TestLogger.log("Continue Button 1 Test");
       ObjOfApp.clickContinue1();
       TestLogger.log("Continue Button 2 Test");
       ObjOfApp.clickContinue2();
       TestLogger.log("Click Burger Test");
       ObjOfApp.clickBurger();
       TestLogger.log("Click Real Estate Tab Test");
       ObjOfApp.clickRealEstateTab();
    }
    }
