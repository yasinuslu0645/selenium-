package day21;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_JSExecuter extends TestBase {
    @Test
    public void js(){
        /*
Techpro education ana sayfasına git
We Offer elementi görünür olacak şekilde üzerine scroll et ve ekran görüntüsünü al
Aynı sayfada Enroll Free elementi görünür olacak sekilde scroll et ve ekran görüntüsünü al
Aynı sayfada WHY US? elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
Aynı sayfada tekrar Enroll Free elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
 */

        driver.get("https://techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        WebElement weOffer = driver.findElement(By.xpath("//span[.='we offer']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",weOffer);


    }
}
