import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    @Test
    public void searchItems() {
        setUrl("http:www.amazon.com");
        searchBox("Video Games");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
    }
}
