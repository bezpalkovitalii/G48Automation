package projectGitHub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProjectPage extends BaseAuthorizedPage {

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    private final By xml = By.xpath("//a[@title = 'pom.xml']");
    private final By commitMessageText = By.xpath("//a[@data-test-selector='commit-tease-commit-message']");
    private final By codeTab = By.xpath("//span[@data-content='Code']");
    private final By issuesTab = By.xpath("//span[@data-content='Issues']");
    private final By pullRequestsTab = By.xpath("//span[@data-content='Pull requests']");
    private final By actionsTab = By.xpath("//span[@data-content='Actions']");
    private final By projectsTab = By.xpath("//span[@data-content='Projects']");
    private final By wikiTab = By.xpath("//span[@data-content='Wiki']");
    private final By securityTab = By.xpath("//span[@data-content='Security']");
    private final By insightsTab = By.xpath("//span[@data-content='Insights']");
    private final By settingsTab = By.xpath("//span[@data-content='Settings']");


    public ProjectPage displayTab() {

        LOG.info(driver.findElement(codeTab).getText());
        LOG.info(driver.findElement(issuesTab).getText());
        LOG.info(driver.findElement(pullRequestsTab).getText());
        LOG.info(driver.findElement(actionsTab).getText());
        LOG.info(driver.findElement(projectsTab).getText());
        LOG.info(driver.findElement(wikiTab).getText());
        LOG.info(driver.findElement(securityTab).getText());
        LOG.info(driver.findElement(insightsTab).getText());
        LOG.info(driver.findElement(settingsTab).getText());


        return this;


    }

    public XMLPage openXML() {

        driver.findElement(xml).click();
        return new XMLPage(driver);
    }

    public ProjectPage showCommitMessage() {
        LOG.info(driver.findElements(commitMessageText).get(0).getText());

        return this;
    }


}
