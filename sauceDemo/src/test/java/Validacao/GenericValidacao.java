package Validacao;

import PageObjects.GenericPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class GenericValidacao {

    private WebDriver driver;
    private GenericPage genericPage;

    public GenericValidacao (WebDriver driver){

        this.driver = driver;
        genericPage = new GenericPage(this.driver);
    }

    public void validacaoTitlePages(String texto){

        Assertions.assertEquals(texto, genericPage.getTextTitle().getText());
    }

    public void validacaoProduto(){

        Assertions.assertEquals("Sauce Labs Onesie", genericPage.getTextProtudo().getText());
    }
}