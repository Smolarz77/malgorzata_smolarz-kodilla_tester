package allegro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroCSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article")));

        WebElement alertAccept = driver.findElement(By.cssSelector("div > button[class*='_13q9y _iu5pr mh36_0 mvrt_0 meqh_bv'] > img[class='mjyo_6x']"));
        alertAccept.click();


        WebElement linkElectronics = driver.findElement(By.cssSelector("div[data-role='filters'] > div > select"));
        Select categorySelect = new Select(linkElectronics);
        categorySelect.selectByValue("/kategoria/elektronika");



        WebElement searchItem = driver.findElement(By.cssSelector("div > form > input"));
        searchItem.sendKeys("Mavic mini");
        searchItem.submit();


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article")));

        // List<WebElement> sResults = driver.findElements(By.cssSelector("section>article"));

        List<WebElement> sResults = driver.findElements(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article"));
        for(WebElement element : sResults){
            System.out.println(element.getText());

        }}
}