package Tests;

import Pages.LoginPageObject;
import Pages.SearchElements;
import org.junit.Before;
import org.junit.Test;

public class UITest extends BaseTest {

    private LoginPageObject loginpageobject;
    private SearchElements searchelements;

    @Before
    public void setUp() {
            loginpageobject = new LoginPageObject(driver);
            searchelements = new SearchElements(driver);
    }

    @Test
    public void launch(){
        loginpageobject.login("bezpalkovitalii", "268v7goE");
        searchelements.search();


    }

}
