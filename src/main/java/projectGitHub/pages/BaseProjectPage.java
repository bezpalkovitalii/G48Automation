package projectGitHub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import projectGitHub.pages.actions.ActionsPage;
import projectGitHub.pages.code.CodePage;
import projectGitHub.pages.insights.InsightsPage;
import projectGitHub.pages.issues.IssuesPage;
import projectGitHub.pages.projects.ProjectsPage;
import projectGitHub.pages.pullRequests.PullRequestsPage;
import projectGitHub.pages.security.SecurityPage;
import projectGitHub.pages.settings.SettingsPage;
import projectGitHub.pages.wiki.WikiPage;

public class BaseProjectPage extends BaseAuthorizedPage {

    public BaseProjectPage(WebDriver driver) {
        super(driver);
    }

    private final By codeTab = By.xpath("//span[@data-content='Code']");
    private final By issuesTab = By.xpath("//span[@data-content='Issues']");
    private final By pullRequestsTab = By.xpath("//span[@data-content='Pull requests']");
    private final By actionsTab = By.xpath("//span[@data-content='Actions']");
    private final By projectsTab = By.xpath("//span[@data-content='Projects']");
    private final By wikiTab = By.xpath("//span[@data-content='Wiki']");
    private final By securityTab = By.xpath("//span[@data-content='Security']");
    private final By insightsTab = By.xpath("//span[@data-content='Insights']");
    private final By settingsTab = By.xpath("//span[@data-content='Settings']");

    public CodePage openSourceCode() {
        driver.findElement(codeTab).click();
        return new CodePage(driver);
    }

    public IssuesPage openIssues() {
        driver.findElement(issuesTab).click();
        return new IssuesPage(driver);
    }

    public PullRequestsPage openPullRequest() {
        driver.findElement(pullRequestsTab).click();
        return new PullRequestsPage(driver);
    }

    public ActionsPage openActions() {
        driver.findElement(actionsTab).click();
        return new ActionsPage(driver);
    }

    public ProjectsPage openProjects() {
        driver.findElement(projectsTab).click();
        return new ProjectsPage(driver);
    }

    public WikiPage openWiki() {
        driver.findElement(wikiTab).click();
        return new WikiPage(driver);
    }

    public SecurityPage openSecurity() {
        driver.findElement(securityTab).click();
        return new SecurityPage(driver);
    }

    public InsightsPage openInsights() {
        driver.findElement(insightsTab).click();
        return new InsightsPage(driver);
    }

    public SettingsPage openSettings() {
        driver.findElement(settingsTab).click();
        return new SettingsPage(driver);
    }


    public BaseProjectPage displayTab() {

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

}
