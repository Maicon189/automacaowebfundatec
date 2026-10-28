package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private  Waits waits;

    public CartPage(WebDriver driver){

        this.driver = driver;
        this.waits = new Waits(this.driver);
    }
    public WebElement getCheckoutButton(){

        waits.visibilityOfElemente(By.id("checkout"));

        return driver.findElement(By.id("checkout"));
    }
}
