package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FreeRangeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test1(){
        driver.get("https://www.freerangetesters.com");

        WebElement elementPorId = driver.findElement(By.id("idDeElemento"));
        elementPorId.click();
    }

    @Test
    public void test2(){
        driver.get("https://www.freerangetesters.com");

        WebElement elementPorId = driver.findElement(By.id("idDeElemento"));
        elementPorId.click();
    }

    @Test
    public void test3(){
        driver.get("https://www.freerangetesters.com");

        WebElement elementPorId = driver.findElement(By.id("idDeElemento"));
        elementPorId.click();
    }

    @AfterMethod
    public void  tearDown(){
        //cierra el navegador después de la prueba
        if (driver != null){
            driver.quit();
        }
    }
    
}
