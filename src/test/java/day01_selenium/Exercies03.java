package day01_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Exercies03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tugba");
        //fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("efe");
        //check the gender
       driver.findElement(By.id("sex-1")).click();
        //check the experience
        driver.findElement(By.id("exp-2")).click();
        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("16/05/2022");

        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        //choose your continent -> Antartica
        driver.findElement(By.xpath("//*[text()='Antartica']")).click();
        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//*[text()='Browser Commands']")).click();
        //click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
}
