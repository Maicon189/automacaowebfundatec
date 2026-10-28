package Validacao;

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
}
