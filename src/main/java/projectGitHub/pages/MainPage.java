package projectGitHub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage extends BaseAuthorizedPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By repositoryLink = By.xpath("//span[@title = 'G48Automation']");

    public ProjectPage openProjectG48() {
        driver.findElements(repositoryLink).get(0).click();
        return new ProjectPage(driver);
    }

}
