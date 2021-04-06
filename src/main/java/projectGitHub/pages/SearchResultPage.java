package projectGitHub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import projectGitHub.pages.code.CodePage;

public class SearchResultPage extends BaseAuthorizedPage {


    private final By projectLink = By.xpath("//a[contains(text(), 'bezpalko')]");


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public CodePage openProject() {

        driver.findElement(projectLink).click();

        return new CodePage(driver);


    }


}
