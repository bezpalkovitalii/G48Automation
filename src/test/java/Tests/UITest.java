package Tests;

import projectGitHub.LoginPageObject;
import projectGitHub.SearchElements;
import org.junit.Before;
import org.junit.Test;
import projectGitHub.ValueComparison;

public class UITest extends BaseTest {

    private LoginPageObject loginpageobject;
    private SearchElements searchelements;
    private ValueComparison valueComparison;

    @Before
    public void setUp() {
            loginpageobject = new LoginPageObject(driver);
            searchelements = new SearchElements(driver);
            valueComparison = new ValueComparison(driver);
    }

    @Test
    public void launch(){
        loginpageobject.login("bezpalkovitalii", "268v7goE");
        searchelements.search();
        valueComparison.comparison();



    }

}
