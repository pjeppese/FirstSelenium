import Data.DataHolder;
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args){
        String var;
        DataHolder data = new DataHolder();

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.dk/");
        driver.findElement(By.id("lst-ib")).sendKeys(data.getM_data1());
        WebElement element = driver.findElement(By.name("btnK"));
        element.submit();


    }
}