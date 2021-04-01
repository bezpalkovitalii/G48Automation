package Tests;

import projectGitHub.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class UITest extends BaseTest {

    private LoginPage loginPage;


    @Before
    public void setUp() {
        loginPage = new LoginPage(driver);

    }

    @Test
    public void comparisonVersionSelenium() {
        loginPage.login(System.getProperty("username"), System.getProperty("password"))
                .search()
                .openProject()
                .openXML()
                .comparison()
                .logout();


    }

    @Test
    public void showNameTab() {
        loginPage.login(System.getProperty("username"), System.getProperty("password"))
                .openProjectG48()
                .displayTab()
                .logout();
    }

    @Test
    public void showCommitMessageTest() {
        loginPage.login(System.getProperty("username"), System.getProperty("password"))
                .openProjectG48()
                .showCommitMessage()
                .logout();
    }
}
