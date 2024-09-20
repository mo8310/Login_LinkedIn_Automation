import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class loginscript {

    public static void main(String[] args) {

        WebDriver driver;

        //1: open browser
        driver = new ChromeDriver();

        //2: navigate to google
        driver.navigate().to("https://www.google.com.eg/?hl=ar");

        //3:find element
      WebElement searchbar = driver.findElement(By.id("APjFqb"));

         //4.write on searchbar
        searchbar.sendKeys("LinkedIn");
        //5:press enter
        searchbar.sendKeys(Keys.ENTER);




    }
}
