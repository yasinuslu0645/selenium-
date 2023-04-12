package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_TekrarTesti {

    //1.“https://www.saucedemo.com” Adresine gidin
    //2.Username kutusuna “standard_user” yazdirin
    //3.Password kutusuna “secret_sauce” yazdirin
    //4.Login tusuna basin
    //5.Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    //6.Add to Cart butonuna basin
    //7.Alisveris sepetine tiklayin
    //8.Sectiginiz urunun basarili olarak sepete eklendigini control edin
    //9.Sayfayi kapatin


    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void test(){
        //1.“https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");

        //2.Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        //3.Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        //4.Login tusuna basin
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        //5.Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).click();

        //6.Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //7.Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//span['shopping_cart_badge']")).click();

        //8.Sectiginiz urunun basarili olarak sepete eklendigini control edin;
        Boolean urun = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).isDisplayed();
        if (urun=true){
            System.out.println("Ürün Başarılı Bir Şekilde Sepete Eklenmiştir");
        }else{
            System.out.println("Maalesef ürün sepete eklenmemiştir");
        }



    }

}
