package TestCases;

import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoTest extends TestBase {

    private final WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);


    @Test
    public void realizarCompra() throws InterruptedException{

        loginTask.efetuarLogin();
        produtoTask.selecionarProduto();

    }

}
