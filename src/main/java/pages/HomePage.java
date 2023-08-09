package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://ecommerce-playground.lambdatest.io/");
    }

    public ProductPage clickProduct() {
        WebElement product = driver.findElement(By.cssSelector(".product"));
        product.click();
        return new ProductPage(driver);
    }
}
