package islahiArtTest;




import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AccountPage;
import pages.HomePage;
import org.testng.annotations.Test;
import reusables.testingBase;

public class loginPageTest extends testingBase {
    HomePage homePage;
    AccountPage accountPage;
    @Test
    public void verifyLogin() throws InterruptedException {
        homePage = new HomePage(getDriver());
        homePage.clickAccountButton();

        accountPage = new AccountPage(getDriver());
        accountPage.enterUsername("rubayatsyeda@gmail.com");
        accountPage.enterPassword("777777777");
        accountPage.clickSignInButton();

        Thread.sleep(4000);
    }


}
