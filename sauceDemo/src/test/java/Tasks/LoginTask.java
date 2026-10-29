package Tasks;

import Framework.Utils.FileOperations;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask (WebDriver driver){

        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

    public void efetuarLogin(){

        loginPage.getUserNameInput().sendKeys(FileOperations.getProperties("user").getProperty("usuario"));
        loginPage.getPasswordInput().sendKeys(FileOperations.getProperties("user").getProperty("password"));
        loginPage.getLoginButton().click();
    }

}

