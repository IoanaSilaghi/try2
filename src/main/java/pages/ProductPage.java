package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        driver.findElement(By.xpath ("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]" )).click();
    }
}
