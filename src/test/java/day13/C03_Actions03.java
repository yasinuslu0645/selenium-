package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_Actions03 extends TestBase {
     /*
     https://techproeducation.com adresine gidin
     Sayfanın alt tarafına gidin
     Sayfanın üst tarafına gidin
     */
    @Test
    public void action03(){
//        https://techproeducation.com adresine gidin
        driver.get("https://techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click(); //Reklamı kapattık

//        Sayfanın alt tarafına gidin
        Actions act = new Actions(driver);

        bekle(2);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(2);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(2);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        bekle(2);
        act.sendKeys(Keys.ARROW_DOWN).perform();

        bekle(3);
        act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();

//        Sayfanın üst tarafına gidin
        bekle(2);
        act.sendKeys(Keys.PAGE_UP).perform();
        act.sendKeys(Keys.ARROW_UP).perform();
    }
}
