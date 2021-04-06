package projectGitHub.pages.issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import projectGitHub.pages.BaseProjectPage;

import java.util.List;

public class IssueCreationPage extends BaseProjectPage {

    public IssueCreationPage(WebDriver driver) {
        super(driver);
    }

    private final By titleField = By.id("issue_title");
    private final By bodyField = By.id("issue_body");
    private final By submitButton = By.xpath("//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/div[2]/button");

    private final By labelsButton = By.id("labels-select-menu");
    private final By labelsList = By.xpath("//div[@class = 'css-truncate']/span");

    public IssueInfoPage createNewIssue(String title, String body, List<String> labels) {

        driver.findElement(titleField).sendKeys(title);
        driver.findElement(bodyField).sendKeys(body);
        driver.findElement(labelsButton).click();
        List<WebElement> labelsOnPage = driver.findElements(labelsList);
        labelsOnPage.stream()
                .filter(labelOnPage -> labels.contains(labelOnPage.getText()))
                .forEach(filteredLabelOnPage -> filteredLabelOnPage.click());

        driver.findElement(labelsButton).click();
        driver.findElement(submitButton).click();

        return new IssueInfoPage(driver);
    }


}


