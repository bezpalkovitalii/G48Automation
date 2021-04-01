package projectGitHub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import projectGitHub.pages.BasePage;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends BasePage {


    private final By loginField = By.name("login");
    private final By passwordField = By.name("password");
    private final By submitButton = By.name("commit");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage login(String username, String password) {
        waitFor10.until(visibilityOf(driver.findElement(loginField)));
        driver.findElement(loginField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
        return new MainPage(driver);
    }


}
