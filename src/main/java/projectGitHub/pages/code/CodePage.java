package projectGitHub.pages.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import projectGitHub.pages.BaseProjectPage;
import projectGitHub.pages.XMLPage;


public class CodePage extends BaseProjectPage {

    public CodePage(WebDriver driver) {
        super(driver);
    }

    private final By xml = By.xpath("//a[@title = 'pom.xml']");
    private final By commitMessageText = By.xpath("//a[@data-test-selector='commit-tease-commit-message']");


    public XMLPage openXML() {

        driver.findElement(xml).click();
        return new XMLPage(driver);
    }

    public CodePage showCommitMessage() {
        LOG.info(driver.findElements(commitMessageText).get(0).getText());

        return this;
    }


}
