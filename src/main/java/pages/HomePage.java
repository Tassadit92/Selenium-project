package pages;

import browser.Browser;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static browser.Browser.getPropertyValue;
import org.openqa.selenium.support.How;


public class HomePage {
    @FindBy(id= "txtUsername")private WebElement usernameElement;
    @FindBy(id="txtPassword")private WebElement passwordElement;
    @FindBy(id="btnLogin")private  WebElement loginButton;
    // an other way to find element
   // @FindBy(how = How.ID,using = "btnLogin")WebElement loginButton;

    public void LogIn(){
        // we can also use this :  passwordElement.sendKeys(Browser.getPropertyValue("Password"));// Password here is from Info.proparties

        usernameElement.sendKeys(getPropertyValue("UserName"));// userName here is from Info.proparties
        passwordElement.sendKeys(getPropertyValue("Password"));// Password here is from Info.proparties
        loginButton.click();

    }
}
