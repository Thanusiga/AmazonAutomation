package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShirtPage {

    @BeforeMethod
    public void selectShirt() throws InterruptedException {

        //select first brand
        HomePage.getDriver().findElements(By.cssSelector(".a-icon.a-icon-checkbox")).get(2).click();
        System.out.println(" first brand was selected");

        Thread.sleep(3000);
    }

    @Test
    public void verifyCheckBox(){
        //verify if checkbox is check or not
        WebElement brandCheckbox = HomePage.getDriver().findElements(By.cssSelector(".a-icon.a-icon-checkbox")).get(2);
        System.out.println("The brand selection state is "+brandCheckbox.isDisplayed());

    }


    @AfterMethod
    public void SelecteItem() throws InterruptedException {

        //Select the first search item
        HomePage.getDriver().findElement(By.cssSelector(".a-size-base-plus.a-color-base.a-text-normal")).click();
        System.out.println("first item was selected");

        Thread.sleep(5000);
    }
    @AfterTest
    public void Selected(){

        System.out.println("Test 2 : Select shirt");
    }



}
