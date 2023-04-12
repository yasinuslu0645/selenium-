package HomeWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C09_Task05 extends TestBase {
//http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
//Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
//Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
//Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
//Çıkan alert'te iptal butonuna basınız
//Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
//Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
//Çıkan mesajı konsola yazdırınız
//Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız

    @Test
    public void clickToButton() throws InterruptedException {

        //http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
        driver.get("http://demo.automationtesting.in/Alerts.html");

        //Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
        driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();

        //Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
        System.out.println("Alert Text : "+ driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        //Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
        Thread.sleep(2000);

        //Çıkan alert'te iptal butonuna basınız
        driver.switchTo().alert().dismiss();

        //Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
        Thread.sleep(2000);

        //Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
        driver.switchTo().alert().sendKeys("kemal sunal");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
        System.out.println("Son Mesaj : " +driver.findElement(By.xpath("//p[@id='demo1']")).getText());
        Assert.assertEquals("Hello kemal sunal How are you today", driver.findElement(By.xpath("//p[@id='demo1']")).getText());
    }

}
