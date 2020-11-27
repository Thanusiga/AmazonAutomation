package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomizedOrderPage {

    @BeforeMethod
    public void SelectSize() throws  InterruptedException{

        Thread.sleep(2000);
        //Select a size
        HomePage.getDriver().findElement(By.id("dropdown_selected_size_name")).click();

        HomePage.getDriver().findElements(By.cssSelector(".a-dropdown-item.dropdownAvailable")).get(1).click();
        System.out.println("available size was Selected ");

    }
    @Test
    public void AfterSelectSize() {
        //verify if checkbox is check or not
        WebElement size = HomePage.getDriver().findElement(By.id("dropdown_selected_size_name"));
        System.out.println("The size box selection state is "+size.isDisplayed());

    }
    @AfterMethod
    public  void  GetSelectedItem() throws InterruptedException{

        Thread.sleep(2000);
        //Print the Item Title and Title Length
        String title = HomePage.getDriver().getTitle();
        int titleLength = HomePage.getDriver().getTitle().length();
        System.out.println("title " + title);
        System.out.println("length " + titleLength);

    }

    @AfterTest
    public void afterCustomized(){
        System.out.println("Test 3 : Customized my order");
    }

}
