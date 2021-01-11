package com.kodilla.selenium.allegro;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestAppChrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);

        //podana w teorii opcja z Alertem z jakiegoś powodu nie działa, więc klikam przycisk w popup po ścieżce absolutnej
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialog-content")));
        WebElement gdprPopup = driver.findElement(By.cssSelector("button[data-role='accept-consent']"));
        gdprPopup.click();

        WebElement searchField = driver.findElement(By.cssSelector("div[data-box-name='allegro.metrumHeader.search'] > div > form > input"));
        searchField.sendKeys("Mavic mini");

        WebElement categoryCombo = driver.findElement(By.cssSelector("div[data-role='filters'] > div > select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("/kategoria/elektronika");
        searchField.submit();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article")));
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article"));
        System.out.println(searchResults.get(15).getText());

    }
}