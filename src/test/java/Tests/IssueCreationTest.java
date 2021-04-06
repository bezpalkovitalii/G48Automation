package Tests;

import org.junit.Before;
import org.junit.Test;
import projectGitHub.pages.LoginPage;
import projectGitHub.pages.issues.IssuesPage;

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


