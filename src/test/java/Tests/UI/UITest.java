package Tests.UI;

import io.qameta.allure.*;
import projectGitHub.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

@Owner("Bezpalko")
@Severity(SeverityLevel.CRITICAL)

public class UITest extends BaseTest {

    private LoginPage loginPage;


    @Before
    public void setUp() {
        loginPage = new LoginPage(driver);

    }

    @Description("Сравневаем версии Selenium")
    @Test
    public void comparisonVersionSelenium() {
        loginPage.login(System.getProperty("username"), System.getProperty("password"))
                .search()
                .openProject()
                .openXML()
                .comparison()
                .logout()
                .checkIsLogOut();


    }

    @Description("Отображаем вкладки проекта")
    @Test
    public void showNameTab() {
        loginPage.login(System.getProperty("username"), System.getProperty("password"))
                .openProjectG48()
                .displayTab()
                .logout();
    }

    @Description("Выводим сообщение коммита")
    @Test
    public void showCommitMessageTest() {
        loginPage.login(System.getProperty("username"), System.getProperty("password"))
                .openProjectG48()
                .showCommitMessage()
                .logout();
    }
}
