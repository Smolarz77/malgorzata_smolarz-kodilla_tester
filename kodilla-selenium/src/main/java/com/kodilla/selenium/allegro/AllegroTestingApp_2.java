package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllegroTestingApp_2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");
//Wskazówka: skorzystaj z driver.findElements
        try {

            WebElement cbutton = driver.findElement(By.cssSelector("._1yyhi > div > button"));
            cbutton.click();

            WebElement option = driver.findElement(By.cssSelector("div > select > optgroup > option"));
            option.click();

            WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
            inputField.sendKeys("mavic mini");

            WebElement inputField2_button = driver.findElement(By.cssSelector("div > form > button"));
            inputField2_button.click();

            //List<WebElement> element = driver.findElements(By.className("nazwa_klasy));
            List<WebElement> productionCard = driver.findElements(By.cssSelector("._9c44d_378hD > section > article"));



        } catch (NoSuchElementException e) {
            System.err.println(e);
        }

    }
}
