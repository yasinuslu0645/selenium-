package day21;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class C01_JSExecuter_Click extends TestBase {

    /*
    http://www.uitestpractice.com/Students/Form sayfasına git
    Formu doldur
    Submit tuşuna tıkla
    Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
    */

    @Test
    public void clickByJSTest(){
//        http://www.uitestpractice.com/Students/Form sayfasına git
        driver.get("http://www.uitestpractice.com/Students/Form");

//        Formu doldur
        driver.findElement(By.id("firstname")).sendKeys(Faker.instance().name().firstName());
        driver.findElement(By.id("lastname")).sendKeys(Faker.instance().name().lastName());
        driver.findElement(By.id("email")).sendKeys(Faker.instance().internet().emailAddress());
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        driver.findElement(By.xpath("//input[@value='dance']")).click();
        driver.findElement(By.xpath("//input[@value='read']")).click();
        driver.findElement(By.id("sel1")).sendKeys("Belarus");
        driver.findElement(By.id("datepicker")).sendKeys("08/08/1990");
        bekle(3);
        driver.findElement(By.id("phonenumber")).click();
        driver.findElement(By.id("phonenumber")).sendKeys("90505050500");
        driver.findElement(By.id("username")).sendKeys(Faker.instance().name().username());
        driver.findElement(By.id("pwd")).sendKeys("111111");
        bekle(10);

        //Gerisi ödev...

//        Submit tuşuna tıkla
        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        //submitButton.click(); ==> Selenium click() çalışmadı, JS Executer deniyorum:

        //Driver'ı JavascriptExecutor classına "cast" ediyoruz:
        JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;

        //executeScript() metodu ile uygun script'i çalıştırıyoruz:
        jsExecuter.executeScript("arguments[0].click();",submitButton);

        //clickByJS metodu oluşturarak gerekli yerlerde tıklama yapabiliriz:


//        Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
        assertEquals("http://www.uitestpractice.com/Students/Form?optradio=on",driver.getCurrentUrl());

    }
}