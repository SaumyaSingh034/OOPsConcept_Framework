package myTest;

import myPages.HomePage;
import myPages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

    @Test(priority=1)
    public void verifyLoginPageTitleTest(){
        String title = page.getInstance(LoginPage.class).getPageLoginTitle();
        System.out.println(title);
        Assert.assertEquals(title,"HubSpot Login");
    }

    @Test(priority=2)
    public void verifyLoginPageHeaderTest(){
        String header = page.getInstance(LoginPage.class).getLoginPageHeader();
        System.out.println(header);
        Assert.assertEquals(header,"Create a free account or learn how our software can help you grow your business\n");
    }

    @Test(priority=3)
    public void doLoginWithValidCred(){
        HomePage homePage = page.getInstance(LoginPage.class).doLogin("singhsaumyait034@gmail.com","Test#1234");
        String title = homePage.getPageTitle();
        System.out.println("Home Page Title : "+title);


    }
}
