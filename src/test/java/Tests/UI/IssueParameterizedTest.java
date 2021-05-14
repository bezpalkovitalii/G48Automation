package Tests.UI;

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

public class IssueParameterizedTest extends BaseTest {

    private LoginPage page;
    private String title;
    private String body;
    private List<String> labels;

    public IssueParameterizedTest(String title, String body, List<String> labels) {
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
        String inputFile = System.getProperty("input.file", "excel");
        switch (inputFile) {
            case "file":
                List<Object[]> result = new ArrayList<>();
                List<String> dataFromFile = readFile(System.getProperty("user.dir") + "\\src\\test\\resources\\test_data\\issueData");
                for (String line : dataFromFile) {
                    String[] temp = line.split(", ");
                    result.add(new Object[]{temp[0], temp[1], Arrays.asList(temp[2].split("; "))});
                }
                return result;
            default:
                List<Object[]> resultExcel = readExcelIssueTest(
                        System.getProperty("user.dir") + "\\src\\test\\resources\\test_data\\TitleBodyLabels.xls",
                        "Sheet1");
                return resultExcel;
        }
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