import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductStoreTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

    @org.junit.jupiter.api.Test
    public void productStore() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().setSize(new Dimension(1424, 772));
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        {
            List<WebElement> elements = driver.findElements(By.linkText("Add to cart"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("more-information"));
            assert (elements.size() > 0);
        }
    }
}