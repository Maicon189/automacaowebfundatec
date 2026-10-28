package Tasks;

import Framework.Utils.FakersGneration;
import PageObjects.CheckoutPage;
import Validacao.CheckoutValidacao;
import Validacao.GenericValidacao;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidacao genericValidacao;
    private CheckoutValidacao checkoutValidacao;
    private FakersGneration fakersGneration;

    public CheckoutTask (WebDriver driver){

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
        checkoutValidacao = new CheckoutValidacao(this.driver);
        fakersGneration = new FakersGneration();
    }
    public void preenchercheckout(){

        genericValidacao.validacaoTitlePages("Checkout: Your Information");
        /*checkoutPage.getFirstNameInput().sendKeys("Maicon");
        checkoutPage.getLasttNameInput().sendKeys("Teixeira");
        checkoutPage.getZipeCodetNameInput().sendKeys("123456789");*/
        checkoutPage.getFirstNameInput().sendKeys(fakersGneration.getFirstName());
        checkoutPage.getLasttNameInput().sendKeys(fakersGneration.getLastName());
        checkoutPage.getZipeCodetNameInput().sendKeys(fakersGneration.getZipCode());
        checkoutValidacao.validaForm();
        checkoutPage.getContinueButton().click();
        genericValidacao.validacaoTitlePages("Checkout: Overview");
        genericValidacao.validacaoProduto();
    }
}
