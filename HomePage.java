package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

    private static WebDriver driver;
    public  static WebDriver getDriver(){

        return driver;
    }

    @BeforeMethod
    public void Method() throws  InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\resources\\drivers\\chromedriver.exe");

        //create a new chrome driver
        driver = new ChromeDriver();

        String url = "https://www.amazon.com/";

        //get title of the web page
        driver.get(url);

        //maximize the window
        driver.manage().window().maximize();

        //Select “Men’s Fashion” from main drop down box
        Select dropDownAll = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropDownAll.selectByVisibleText("Men's Fashion");
        System.out.println("Men's fashion was selected");

        //Type “Shirt” on search bar
        driver.findElement(By.name("field-keywords")).sendKeys("Shirt");
        System.out.println("Typed Shirt on search bar");

        Thread.sleep(3000);
    }
    @Test
    public void TestUrl(){

        //verify if it is the correct page that is opened
        String verifyUrl = driver.getCurrentUrl();

        if ( !verifyUrl.contains("amazon")){
            throw  new TestException("Error : your are not open the correct url");
        }

    }

    @AfterMethod
    public void AfterMethod(){
        //click on search button
        driver.findElement(By.xpath(".//*[@id='nav-search-submit-text']/input")).click();
    }

    @AfterTest
    public void AfterTestUrl(){
        System.out.println("Test 1 : Checked the url");
    }





}
