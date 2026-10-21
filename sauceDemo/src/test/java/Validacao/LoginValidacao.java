package Validacao;

import PageObjects.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginValidacao {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginValidacao (WebDriver driver){

        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

    public void loginValidacao(){
        try{
            Assertions.assertTrue(loginPage.getLoginButton().isDisplayed());
        } catch (Exception e){
            e.getMessage();
        }
    }
}
