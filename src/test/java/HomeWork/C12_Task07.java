package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C12_Task07 extends TestBase {
        //- http://szimek.github.io/signature_pad/ sayfasına gidiniz
        //- Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        //- Çizimden sonra clear butonuna basınız
        //- Sayfayi kapatiniz

    @Test
    public void test(){
        //- http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");

        //- Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        WebElement loc = driver.findElement(By.id("signature-pad"));
        Actions act = new Actions(driver);

        //- Çizimden sonra clear butonuna basınız
        //- Sayfayi kapatiniz
    }
}
