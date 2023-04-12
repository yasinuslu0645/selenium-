package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C02_Actions02 extends TestBase {
       /*
    Amazon anasayfasına gidin
    "Account & List" üzerinde bekleyin (mouse over - hover over)
    Açılan menüde "Account" linkine tıklayın
    Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
     */

    @Test
    public void actionsTest() throws InterruptedException {
//        Amazon anasayfasına gidin
        driver.get("https://www.amazon.com");

//        "Account & List" üzerinde bekleyin (mouse over - hover over)
        WebElement accandlist = driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
        Actions act = new Actions(driver);
        act.moveToElement(accandlist).perform();


//        Açılan menüde "Account" linkine tıklayın
        Thread.sleep(1200);
        driver.findElement(By.linkText("Account")).click();

//        Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
        String sb = driver.getTitle();
        Assert.assertEquals("Your Account",sb);




    }
}