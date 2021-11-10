import com.wired.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MenuOptionsTest extends BaseTest {


    @BeforeClass
    public void beforeClass() {
        homePage = new HomePage();

    }

    @Test
    public void testLaunch() {

        homePage.clickHamburgerMenu();

    }


}
