package myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  extends BasePage {

    //page Locators
    private By emailId = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.id("loginBtn");
    private By header = By.xpath("//i18n-string[@data-key='login.marketingCopy.createAccount']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailId() {
        return getElement(emailId);
    }

    public WebElement getPassword() {
        return getElement(password);
    }

    public WebElement getLoginBtn() {
        return getElement(loginBtn);
    }

    public WebElement getHeader() {
        return getElement(header);
    }

    public String getPageLoginTitle(){
        return getPageTitle();
    }

    public String getLoginPageHeader(){
        return getPageHeader(header);
    }

    public HomePage doLogin(String userName, String password){
        getEmailId().sendKeys(userName);
        getPassword().sendKeys(password);
        getLoginBtn().click();

        return getInstance(HomePage.class);
    }
}
