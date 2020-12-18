package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.By;

import java.awt.*;

public class SignUp {
    private final AndroidDriver driver;
    private final By phoneField =By.tagName("phone");
    private final By emailField = By.className("email");
    private final By passField = By.id("password");
    private final By passConfirmField = By.id("password-confirm");
    private final By signUpButton = By.linkText("Signup_screen_next");

    public SignUp(AndroidDriver driver){
                this.driver = driver;
    }
    public void setPhoneNumber(){driver.findElement(phoneField).sendKeys();}
    public void setEmail(String email){driver.findElement(emailField).sendKeys(email);}
    public  void setPassword(String password){driver.findElement(passField).sendKeys(password);}
    public void setPassConfirm(String password){driver.findElement(passConfirmField).sendKeys(password);}
    public VerifyAreaPage clickSignUpButton(){
        driver.findElement(signUpButton).click();
        return new VerifyAreaPage(driver);
    }

    }

