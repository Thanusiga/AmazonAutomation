package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class ViewCartPage {

    @BeforeClass

    public void ClickCart() {
        //Click on Cart
        HomePage.getDriver().findElement(By.id("hlb-view-cart")).click();
        System.out.println("cart was clicked");
    }

    // @Test (priority = 0)
    // public void VerifyTitle() throws InterruptedException {
        //Verify selected details
        //String ActualTitle = HomePage.getDriver().findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/h2/a/span")).getText();
        // String itemTitle = HomePage.getDriver().findElement(By.cssSelector(".a-size-medium.sc-product-title.a-text-bold")).getText();
         // Assert.assertEquals(ActualTitle, itemTitle);
     //     System.out.println("Assert validate the title");

     //    Thread.sleep(3000);

    // }


    @Test(priority = 2)
    public void VerifySubTotal() throws InterruptedException {
        //Assert the Shopping Cart Subtotal with Proceed to checkout Subtotal
        String subtotal = HomePage.getDriver().findElement(By.id("sc-subtotal-amount-activecart")).getText();
        String proceedSubtotal = HomePage.getDriver().findElement(By.id("sc-subtotal-amount-buybox")).getText();
        Assert.assertEquals(subtotal,proceedSubtotal);
        System.out.println("Assert validate the subtotal\n" + "Sub Total = " + proceedSubtotal );
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void VerifyQuantity() throws InterruptedException {
        //Assert the ‘quantity of the Item(should not be empty) and print in console
        WebElement quantity = HomePage.getDriver().findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]"));
        Assert.assertNotNull(quantity);
        System.out.println("Quantity of the item :" + quantity.getText());

        Thread.sleep(3000);
    }




    @AfterClass
    public  void  ProceedCheckOut() throws InterruptedException {
        //Click on ‘Proceed to Checkout’ button
           HomePage.getDriver().findElement(By.id("sc-buy-box-ptc-button")).click();
           System.out.println("Proceed button was clicked");

            Thread.sleep(2000);
    }

    @AfterTest
    public void CompleteView(){
        System.out.println("Test 5 : View cart");
    }
}
