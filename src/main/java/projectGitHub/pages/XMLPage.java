package projectGitHub.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class XMLPage extends BaseAuthorizedPage {


    public XMLPage(WebDriver driver) {
        super(driver);
    }

    private final By searchVersion = By.xpath("//td[@id = 'LC70']");

    public XMLPage comparison() {
        //waitFor25.until(visibilityOf(driver.findElement(searchVersion)));
        Assert.assertEquals("3.141.59", driver.findElement(searchVersion)
                .getText()
                .replaceAll("[ <></>]+[a-zA-Z]+[</>]", ""));
        LOG.info(driver.findElement(searchVersion).getText().replaceAll("[ <></>]+[a-zA-Z]+[</>]", ""));

        return this;

    }


}
