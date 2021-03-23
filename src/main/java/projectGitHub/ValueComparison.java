package projectGitHub;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValueComparison {

    private final WebDriver driver;

    private final static Logger LOG = LogManager.getLogger("TEST");


    public ValueComparison(WebDriver driver) {
        this.driver = driver;
    }

    private final By searchVersion = By.xpath("//td[@id = 'LC44']");

    public void comparison() {
        Assert.assertEquals("3.141.59", driver.findElement(searchVersion).getText().replaceAll("[ <></>]+[a-zA-Z]+[</>]", ""));
        LOG.info(driver.findElement(searchVersion).getText().replaceAll("[ <></>]+[a-zA-Z]+[</>]", ""));

    }


}
