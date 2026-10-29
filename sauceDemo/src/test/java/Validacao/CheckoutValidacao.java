package Validacao;

import Framework.Utils.FileOperations;
import PageObjects.CheckoutPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutValidacao {

    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutValidacao (WebDriver driver){

        this.driver = driver;
    }

    public void validaForm(){

        try {
            Assertions.assertFalse(checkoutPage.getFirstNameInput().getAttribute("value").equalsIgnoreCase(" "));
        } catch (Exception e){
            e.getMessage();
        }
    }


    public void validaCamposForm(){

        try{
            String name = FileOperations.getProperties("form").getProperty("primeiroNome");
            String lastname = FileOperations.getProperties("form").getProperty("ultimoNome");
            String zipCode = FileOperations.getProperties("form").getProperty("cep");
            Assertions.assertEquals(name, checkoutPage.getFirstNameInput().getAttribute("value"));
            Assertions.assertEquals(lastname, checkoutPage.getLasttNameInput().getAttribute("value"));
            Assertions.assertEquals(zipCode, checkoutPage.getZipeCodetNameInput().getAttribute("value"));

        } catch (Exception e){

            e.getMessage();
        }
    }
}
