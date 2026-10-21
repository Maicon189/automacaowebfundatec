package Validacao;

import PageObjects.FinishPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FinishValidacao {

    private WebDriver driver;
    private FinishPage finishPage;

    public FinishValidacao (WebDriver driver){

        this.driver = driver;
        finishPage = new FinishPage(this.driver);
    }

    public void validacaoSucessoCompra(){

        try {
            Assertions.assertEquals("Thank you for your order!", finishPage.getFinishTextLabel().getText());
        } catch (Exception e){
            e.getMessage();
        }
    }
}
