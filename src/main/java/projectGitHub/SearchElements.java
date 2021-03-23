package projectGitHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchElements {

    private final WebDriver driver;

    private final By searchField = By.name("q");
    private final By searchButton = By.xpath("//span[@class='js-jump-to-badge-search-text-global']");
    private final By searchProject = By.xpath("//a[contains(text(), 'BKuso/')]");
    private final By searchXML = By.xpath("//a[@title = 'pom.xml']");


    public SearchElements(WebDriver driver) {
        this.driver = driver;
    }

    public void search() {
        driver.findElement(searchField).sendKeys("G48Automation");
        driver.findElement(searchButton).click();
        driver.findElement(searchProject).click();
        driver.findElement(searchXML).click();

    }


}
