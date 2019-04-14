package SearchBarPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends MobileAPI {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SearchBar\"]")
    public static WebElement SearchBar;
    public void setSearchBar(){
        SearchBar.click();
    }
}
