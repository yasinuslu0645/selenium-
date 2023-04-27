package practice_day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C05_Alert {
    //http://demo.guru99.com/test/delete_customer.php adresine gidin
    //customer id kısmına 53920 yazın
    //submit butonuna tıklayın
    //cıkan alert mesajını yazdırın
    //alerti kabul edin
    //cıkan 2. alert mesajını yazdırın
    //cıkan 2. alerti kabul edin
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void name() throws InterruptedException {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        //customer id kısmına 53920 yazın
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
        Thread.sleep(2000);

        //submit butonuna tıklayın
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //cıkan alert mesajını yazdırın
        System.out.println("1. Alert Text = " + driver.switchTo().alert().getText());

        //alerti kabul edin
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //cıkan 2. alert mesajını yazdırın
        System.out.println("2. Alert Text = " + driver.switchTo().alert().getText());

        //cıkan 2. alerti kabul edin
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
