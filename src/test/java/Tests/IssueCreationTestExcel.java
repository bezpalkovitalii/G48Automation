package Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import projectGitHub.pages.LoginPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static helpers.ExcelHelper.readExcelIssueTest;
import static helpers.FileHelper.readFile;

@RunWith(Parameterized.class)
public class IssueCreationTestExcel extends BaseTest{

    private LoginPage page;
    private String title;
    private String body;
    private List<String> labels;

    public IssueCreationTestExcel(String title, String body, List<String> labels) {
        this.title = title;
        this.body = body;
        this.labels = labels;
    }

    @Before
    public void prepareData() {
        this.page = new LoginPage(this.driver);

    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        List<Object[]> result = readExcelIssueTest(
                System.getProperty("user.dir") + "\\src\\test\\resources\\test_data\\TitleBodyLabels.xls",
                "Sheet1");
        return result;
    }

    @Test
    public void checkIssueCreation() {
        this.page.login(System.getProperty("username"), System.getProperty("password"))
                .openProjectG48()
                .openIssues()
                .openCreationPage()
                .createNewIssue(this.title, this.body, this.labels)
                .validateIssue(this.title, this.body, this.labels)
                .logout();
    }


}


