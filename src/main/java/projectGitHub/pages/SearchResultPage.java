package projectGitHub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import projectGitHub.pages.BasePage;
import projectGitHub.pages.ProjectPage;

public class SearchResultPage extends BaseAuthorizedPage {


    private final By projectLink = By.xpath("//a[contains(text(), 'bezpalko')]");


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public ProjectPage openProject() {

        driver.findElement(projectLink).click();

        return new ProjectPage(driver);


    }


}
