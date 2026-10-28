package Tasks;

import Framework.Browser.Waits;
import PageObjects.FinishPage;
import PageObjects.LoginPage;
import Validacao.FinishValidacao;
import Validacao.GenericValidacao;
import Validacao.LoginValidacao;
import org.openqa.selenium.WebDriver;

public class FinishTask {

    private WebDriver driver;
    private FinishPage finishPage;
    private GenericValidacao genericValidacao;
    private FinishValidacao finishValidacao;
    private LoginValidacao loginValidacao;
    private Waits waits;
    private LoginPage loginPage;

    public FinishTask (WebDriver driver){

        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
        finishValidacao = new FinishValidacao(this.driver);
        loginValidacao = new LoginValidacao(this.driver);
        waits = new Waits(this.driver);
        loginPage = new LoginPage(this.driver);
    }
    public void finalizarCompra(){
        finishPage.getFinishButton().click();
        genericValidacao.validacaoTitlePages("Checkout: Complete!");
        finishValidacao.validacaoSucessoCompra();
        finishPage.getMenuButton().click();
        finishPage.getMenuLogoutLink().click();
        waits.loadElement(loginPage.getLoginButton());
        loginValidacao.loginValidacao();
    }
}
