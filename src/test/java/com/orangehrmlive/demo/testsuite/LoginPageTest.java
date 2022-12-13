package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage;
    ForgotPasswordPage forgotPasswordPage;
    LoginPage loginPage;


@BeforeMethod(alwaysRun = true)
public void inIt(){
    homePage = new HomePage();
    loginPage = new LoginPage();
    forgotPasswordPage = new ForgotPasswordPage();
}
    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.sendTextToUsernameField("Admin");
        loginPage.sendTextToPasswordField("admin123");
        loginPage.clickOnLoginButton();
        String expectedSuccessfullyLoggedInMessage = "Dashboard";
        String actualSuccessfullyLoggedInMessage = homePage.getTextFromDashboardMessage();
        Assert.assertEquals(actualSuccessfullyLoggedInMessage,expectedSuccessfullyLoggedInMessage,"Dashboard Message Not Displayed");
    }

    @Test(groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickOnForgotPasswordLink();
        String expectedForgotPasswordText = "Reset Password";
        String actualForgotPasswordText = forgotPasswordPage.getTextFromResetPasswordMessage();
        Assert.assertEquals(actualForgotPasswordText,expectedForgotPasswordText,"Reset Password Not Displayed");
    }
}
