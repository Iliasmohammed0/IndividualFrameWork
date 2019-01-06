package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    public String URL = null;
    @BeforeMethod
            public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:/PNTNY/Selenium WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);
    }
    @Parameters
    public void setUrl(String URL){
        this.URL = URL;
        driver.get(URL);
    }
    @Parameters
    public void naviBack(){
        driver.navigate().back();
    }
    @Parameters
    public void naviForward(){
        driver.navigate().forward();
    }
//    @AfterMethod
//    public void cleanUP(){
//        driver.close();
//    }

}