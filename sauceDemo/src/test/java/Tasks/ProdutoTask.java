package Tasks;

import PageObjects.ProdutoPage;
import org.openqa.selenium.WebDriver;

public class ProdutoTask {

    private WebDriver driver ;
    private ProdutoPage produtoPage;

    public ProdutoTask(WebDriver driver){

        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
    }
    public void selecionarProduto(){

        produtoPage.getAddToCartButton().click();
        produtoPage.getCartButton().click();
    }
}
