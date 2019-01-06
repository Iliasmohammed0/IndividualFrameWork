import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {
    public void searchBox(String search){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
    }
}
