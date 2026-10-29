package Tasks;

import Framework.Utils.FakersGneration;
import Framework.Utils.FileOperations;
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

    public CheckoutTask(WebDriver driver) {

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
        checkoutValidacao = new CheckoutValidacao(this.driver);
        fakersGneration = new FakersGneration();
    }

    public void preenchercheckout() throws InterruptedException {


        String name = fakersGneration.getFirstName();
        String lastName = fakersGneration.getLastName();
        String zipCode = fakersGneration.getZipCode();

        FileOperations.setProperties("form", "primeiroNome", name);
        FileOperations.setProperties("form", "ultimoNome", lastName);
        FileOperations.setProperties("form", "cep", zipCode);

        genericValidacao.validacaoTitlePages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys(fakersGneration.getFirstName());
        checkoutPage.getLasttNameInput().sendKeys(fakersGneration.getLastName());
        checkoutPage.getZipeCodetNameInput().sendKeys(fakersGneration.getZipCode());
        checkoutValidacao.validaCamposForm();
        checkoutPage.getContinueButton().click();
        genericValidacao.validacaoTitlePages("Checkout: Overview");
        genericValidacao.validacaoProduto();
    }


}
