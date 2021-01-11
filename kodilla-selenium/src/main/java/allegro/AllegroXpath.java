package allegro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement alertAccept = driver.findElement(By.xpath("//button[@data-role='accept-consent']"));
        alertAccept.click();

        WebElement linkElectronics = driver.findElement(By.xpath("//div[@data-group-id='departments_Elektronika']/a"));
        linkElectronics.click();

        WebElement searchItem = driver.findElement(By.xpath("//input[@type='search']"));
        searchItem.sendKeys("Mavic mini");
        searchItem.submit();

    }
}