package Amazon;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccount {

    @BeforeMethod
    public void BeforeCreateAccount(){

        //Click on ‘Create your Amazon Account’ button
        HomePage.getDriver(). findElement(By.id("createAccountSubmit")).click();
        System.out.println("Create Account was clicked");
    }

    @Test
    public void createAccount() throws InterruptedException{

        //Type sample username, email, password and re-enter password
        HomePage.getDriver().findElement(By.name("customerName")).sendKeys("Thanusiga");
        HomePage.getDriver().findElement(By.name("email")).sendKeys("as2017552@sci.sjp.ac.lk");
        HomePage.getDriver().findElement(By.name("password")).sendKeys("As2017552");
        HomePage.getDriver().findElement(By.name("passwordCheck")).sendKeys("As2017552");
        System.out.println("Type sample username :\nemail:\npassword and re-enter password:");
        Thread.sleep(3000);

    }

    @AfterMethod
    public void afterPassValues(){

        //close the browser
        HomePage.getDriver().close();

        System.out.println("Browser closed");
    }
    @AfterTest
    public void AmozonComplete(){

        System.out.println("Test 6 : Create account");
    }
}