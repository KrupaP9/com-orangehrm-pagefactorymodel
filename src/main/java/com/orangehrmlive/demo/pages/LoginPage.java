package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
@CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
@CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
@CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
@CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;
    public void sendTextToUsernameField(String username) {
        Reporter.log("Enter username"+username+ "to username field "+usernameField.toString());
        sendTextToElement(usernameField, username);
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + username);
    }

    public void sendTextToPasswordField(String password) {
        Reporter.log("Enter password"+password+ "to password field "+passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"Enter password " + password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on login Button");
    }

    public void clickOnForgotPasswordLink() {
        Reporter.log("Clicking on forgot password Button " + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
        CustomListeners.test.log(Status.PASS,"Click on forgot password Button");
    }
}
