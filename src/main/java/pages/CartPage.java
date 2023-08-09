package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartContents() {
        return driver.findElement(By.cssSelector(".cart")).getText();
    }
}
