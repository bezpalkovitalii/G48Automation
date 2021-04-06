package projectGitHub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import projectGitHub.pages.code.CodePage;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage extends BaseAuthorizedPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By repositoryLink = By.xpath("//span[@title = 'G48Automation']");

    public CodePage openProjectG48() {
        driver.findElements(repositoryLink).get(0).click();
        return new CodePage(driver);
    }

}
