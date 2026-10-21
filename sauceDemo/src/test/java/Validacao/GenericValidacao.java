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

        try{
            String label = genericPage.getTextTitle().getText();
            Assertions.assertEquals(texto,label);
        } catch (Exception e){
            e.getMessage();
        }
    }

    public void validacaoProduto(){

        try{
            String labelProduto = genericPage.getTextProtudo().getText();
            Assertions.assertEquals("Sauce Labs Onesie",labelProduto);

        } catch (Exception e){
            e.getMessage();
        }
    }
}
