package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ForgotPasswordPage extends Utility {

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordText;
@Test
    public String getTextFromResetPasswordMessage(){
        Reporter.log("Getting Reset Password Message " + resetPasswordText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Reset Password");
        return getTextFromElement(resetPasswordText);
    }
}
