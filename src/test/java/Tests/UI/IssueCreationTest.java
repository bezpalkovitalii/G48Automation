package Tests.UI;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import projectGitHub.pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class IssueCreationTest extends BaseTest {

    private LoginPage page;
    private List<String> labels = new ArrayList<>();

    @Before
    public void prepareData() {
        this.page = new LoginPage(this.driver);
        labels.add("bug");
        labels.add("invalid");
    }

    @TmsLink("GitHub-001")
    @Description("Check issue creation")
    @Story("Positive")
    @Feature("Github Issue Creation")
    @Owner("Bezpalko")
    @Severity(SeverityLevel.CRITICAL)

    @Test
    public void checkIssueCreation() {
        this.page.login(System.getProperty("username"), System.getProperty("password"))
                .openProjectG48()
                .openIssues()
                .openCreationPage()
                .createNewIssue(
                        "Automated Issue Title",
                        "Test body. Please ignore me!", labels)
                .validateIssue("Automated Issue Title",
                        "Test body. Please ignore me!", labels)
                .logout();
    }


}


