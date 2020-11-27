package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartPage {

    @BeforeMethod
    public void cart() throws  InterruptedException{


        //Select “Add To Cart”
        HomePage.getDriver().findElement(By.id("add-to-cart-button")).click();
        System.out.println("Add to cart button was clicked");
        Thread.sleep(2000);
    }

    @Test
    public void getPrice() throws  InterruptedException{

        //Print Item Price in console
        WebElement price = HomePage.getDriver().findElement(By.xpath("//*[@id=\"hlb-subcart\"]/div[1]"));
        //WebElement price = HomePage.getDriver().driver.findElement(By.id("hlb-subcart"));
        System.out.println("Item Price is :" + price.getText());
        Thread.sleep(2000);
    }


    @AfterTest
    public void CompleteCart() {

        System.out.println("Test 4 : Add to cart");
    }

}
