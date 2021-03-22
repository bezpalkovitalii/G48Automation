package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

    private final WebDriver driver;

    private final By loginField = By.name("login");
    private final By passwordField = By.name("password");
    private final By submitButton = By.name("commit");

    public LoginPageObject(WebDriver driver){
        this.driver =driver;
    }

    public void login(String username, String password){
        driver.findElement(loginField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }



}
