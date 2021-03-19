package chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //1 - Maximize the window
        driver.manage().window().maximize();

        //2 - Fullscreen mode
        //driver.manage().window().fullscreen();

        //3 - Specific width (iPhoneX)
        //driver.manage().window().setSize(new Dimension(375, 812));

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        /*List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());*/


        //
        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
